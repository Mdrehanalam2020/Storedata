package com.charter.ews.store.data.logging;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

@Aspect
public class CommonEndpointLoggingAspect {

	private static final Logger logger = LogManager.getLogger(CommonEndpointLoggingAspect.class);

	@Autowired(required = false)
	private TransactionRequest transactionRequest;

	@Around("""
			@annotation(com.charter.ews.store.data.logging.CommonEndpointLogging) ||
			@within(com.charter.ews.store.data.logging.CommonEndpointLogging)
			""")
	public Object logCall(ProceedingJoinPoint jp) throws Throwable {
		Signature signature = jp.getSignature();
		Object[] arguments = jp.getArgs();
		String action = signature.getName();
		if (transactionRequest != null) {
			String transactionId = transactionRequest.getTransactionId();
			if (transactionId == null) {
				UUID uuid = UUID.randomUUID();
				transactionId = uuid.toString();
				transactionRequest.setTransactionId(transactionId);
			}
		} else {
			transactionRequest = new TransactionRequestImpl();
			UUID uuid = UUID.randomUUID();
			transactionRequest.setTransactionId(uuid.toString());
		}
		String authenticatedUser = getAuthenticatedUser();

		logger.info(buildQueryString((MethodSignature) signature, arguments, action, authenticatedUser));

		long start = System.currentTimeMillis();
		Object results = jp.proceed(arguments);

		logger.info(buildReplyString((MethodSignature) signature, action, start, results, arguments));

		return results;
	}

	private String buildReplyString(MethodSignature signature, String action, long start, Object results,
			Object[] arguments) {
		StringBuilder sb = new StringBuilder("REPLY action=").append(action);
		sb.append(" status=OK execTime=").append(System.currentTimeMillis() - start);
		if (transactionRequest.getTransactionId() != null) {
			sb.append(" transactionId=").append(transactionRequest.getTransactionId());
		}
		if (transactionRequest.getSessionId() != null) {
			sb.append(" sessionId=").append(transactionRequest.getSessionId());
		}
		if (transactionRequest.getUserId() != null) {
			sb.append(" userId=").append(transactionRequest.getUserId());
		}
		if (transactionRequest.getClientId() != null) {
			sb.append(" clientId=").append(transactionRequest.getClientId());
		}

		if (results instanceof Collection collection) {
			if (collection.size() > 0) {
				Iterator iterator = collection.iterator();
				sb.append(" results=");
				while (iterator.hasNext()) {
					sb.append(iterator.next());
				}
			} else {
				sb.append(collection.size()).append(" results");
			}
		} else {
			sb.append(" results=").append(results);
		}
		return sb.toString();
	}

	private String buildQueryString(MethodSignature signature, Object[] arguments, String action,
			String authenticatedUser) {
		StringBuilder builder = new StringBuilder("QUERY action=").append(action);
		if (transactionRequest.getTransactionId() != null) {
			builder.append(" transactionId=").append(transactionRequest.getTransactionId());
		}
		if (transactionRequest.getSessionId() != null) {
			builder.append(" sessionId=").append(transactionRequest.getSessionId());
		}
		if (transactionRequest.getUserId() != null) {
			builder.append(" userId=").append(transactionRequest.getUserId());
		}
		if (transactionRequest.getClientId() != null) {
			builder.append(" clientId=").append(transactionRequest.getClientId());
		}
		if (authenticatedUser != null) {
			builder.append(" authenticatedUser=").append(authenticatedUser);
		}
		builder.append(" with arguments:");

		addArguments(signature, arguments, builder, transactionRequest.getTransactionId());

		return builder.toString();
	}

	private void addArguments(MethodSignature signature, Object[] arguments, StringBuilder builder, String requestId) {
		if (arguments != null && arguments.length > 0) {
			Method targetMethod = signature.getMethod();
			Annotation[][] parameterAnnotations = targetMethod.getParameterAnnotations();
			for (int x = 0; x < arguments.length; x++) {
				builder.append(LoggingAspectUtilities.getParameterName(parameterAnnotations[x], "Arg" + x)).append("=")
						.append(LoggingAspectUtilities.removeQuotes(arguments[x])).append(" ");

			}
			builder.append(" TxRoot=").append(requestId);
		}

	}

	private String getAuthenticatedUser() {
		String authenticatedUser = null;
		SecurityContext context = SecurityContextHolder.getContext();
		if (context != null) {
			Authentication authentication = context.getAuthentication();
			if (authentication != null) {
				authenticatedUser = authentication.getName();
			}
		}
		return authenticatedUser;
	}

}