package com.charter.ews.store.data.logging;

import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

@Aspect
public class EndpointErrorHandlingAspect {
	private static final Logger LOG = LogManager.getLogger(EndpointErrorHandlingAspect.class);

	@AfterThrowing(pointcut = "@annotation(com.charter.ews.store.data.logging.CommonEndpointErrorHandling) || "
			+ "@within(com.charter.ews.store.data.logging.CommonEndpointErrorHandling)", throwing = "e")
	public void throwConfiguredException(JoinPoint jp, Throwable e) throws Throwable {
		Signature signature = jp.getSignature();
		Object[] arguments = jp.getArgs();
		Throwable copyE = e;
		StringBuilder sb = new StringBuilder("REPLY action=").append(jp.getSignature().getName())
				.append(" status=ERROR ").append(" with arguments:")
				.append(LoggingAspectUtilities.addArguments((MethodSignature) signature, arguments)).append(" Error=");
		while (copyE != null) {
			sb.append(copyE.getMessage());
			copyE = copyE.getCause();
		}

		LOG.error(sb.toString(), e);

		determineAndThrowException(jp, e);
	}

	private void determineAndThrowException(JoinPoint jp, Throwable e) throws Throwable {
		Method method = ((MethodSignature) jp.getSignature()).getMethod();
		CommonEndpointErrorHandling annotation = jp.getTarget().getClass()
				.getAnnotation(CommonEndpointErrorHandling.class);

		if (annotation == null) {
			annotation = method.getAnnotation(CommonEndpointErrorHandling.class);
		}

		Class<?>[] exceptions = annotation.exceptions();

		

		for (Class<?> clazz : exceptions) {
			if (clazz.isInstance(e)) {

				throw e;
			}
		}

		throw (Exception) exceptions[1].getConstructor(String.class).newInstance(e.getMessage());
	}

}
