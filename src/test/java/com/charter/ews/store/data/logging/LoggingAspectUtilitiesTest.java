package com.charter.ews.store.data.logging;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.annotation.Annotation;

import org.aspectj.lang.reflect.MethodSignature;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.jws.WebParam;

public class LoggingAspectUtilitiesTest {
	@Mock
	MethodSignature signature;

	@Test
	public void testGetParameterNameWithWebParamAnnotation() {
		Annotation[] annotations = new Annotation[] { createWebParamAnnotation("webParamName") };
		String result = LoggingAspectUtilities.getParameterName(annotations, "defaultArgument");
		assertEquals("webParamName", result);
	}

	@Test
	public void testGetParameterNameWithRequestHeaderAnnotation() {
		Annotation[] annotations = new Annotation[] { createRequestHeaderAnnotation("headerName") };
		String result = LoggingAspectUtilities.getParameterName(annotations, "defaultArgument");
		assertEquals("headerName", result);
	}

	@Test
	public void testGetParameterNameWithRequestParamAnnotation() {
		Annotation[] annotations = new Annotation[] { createRequestParamAnnotation("paramName") };
		String result = LoggingAspectUtilities.getParameterName(annotations, "defaultArgument");
		assertEquals("paramName", result);
	}

	@Test
	public void testRemoveQuotes() {
		Object arguments = "testArgument";
		StringBuilder result = LoggingAspectUtilities.removeQuotes(arguments);
		assertEquals("testArgument", result.toString());
	}

	private WebParam createWebParamAnnotation(String name) {
		return new WebParam() {
			@Override
			public Class<? extends Annotation> annotationType() {
				return WebParam.class;
			}

			@Override
			public String name() {
				return name;
			}

			@Override
			public String partName() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String targetNamespace() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Mode mode() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean header() {
				// TODO Auto-generated method stub
				return false;
			}
		};
	}

	private RequestHeader createRequestHeaderAnnotation(String name) {
		return new RequestHeader() {
			@Override
			public Class<? extends Annotation> annotationType() {
				return RequestHeader.class;
			}

			@Override
			public String name() {
				return name;
			}

			@Override
			public String value() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean required() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public String defaultValue() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	private RequestParam createRequestParamAnnotation(String name) {
		return new RequestParam() {
			@Override
			public Class<? extends Annotation> annotationType() {
				return RequestParam.class;
			}

			@Override
			public String name() {
				return name;
			}

			@Override
			public String value() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean required() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public String defaultValue() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}
}