package com.charter.ews.store.data.logging;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.reflect.MethodSignature;
import jakarta.jws.WebParam;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

public class LoggingAspectUtilities {

	public static String getParameterName(Annotation[] parameterAnnotation, String defaultArgumentDisplayName) {
		String argumentDisplayName = defaultArgumentDisplayName;
		for (Annotation annotation : parameterAnnotation) {
			if (annotation instanceof WebParam webParam) {
				argumentDisplayName = webParam.name();
			} else if (annotation instanceof RequestHeader requestHeader) {
				if (!StringUtils.isEmpty(requestHeader.name())) {
					argumentDisplayName = requestHeader.name();
				}
			} else if (annotation instanceof RequestParam requestParam) {
				if (!StringUtils.isEmpty(requestParam.name())) {
					argumentDisplayName = requestParam.name();
				}
			}
		}
		return argumentDisplayName;
	}

	public static StringBuilder removeQuotes(Object arguments) {
		String argumentName = "";
		StringBuilder fullFormattedString = new StringBuilder();
		fullFormattedString.append(arguments);
		return fullFormattedString;
	}

	public static String addArguments(MethodSignature signature, Object[] arguments) {
		if (arguments != null && arguments.length > 0) {
			StringBuilder builder = new StringBuilder();
			builder.append("with arguments:");
			Method targetMethod = signature.getMethod();

			Annotation[][] parameterAnnotations = targetMethod.getParameterAnnotations();
			for (int x = 0; x < arguments.length; x++) {
				builder.append(getParameterName(parameterAnnotations[x], "Arg" + x)).append("=").append(arguments[x])
						.append(" ");
			}
			return builder.toString();
		}

		return "No Arguments ";
	}
}