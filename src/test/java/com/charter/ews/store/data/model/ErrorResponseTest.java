package com.charter.ews.store.data.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

public class ErrorResponseTest {
	
	
	@Test
	void testEqualsAndHashcode()
	{
		EqualsVerifier.simple().forClass(ErrorResponse.class).suppress(Warning.INHERITED_DIRECTLY_FROM_OBJECT).verify();
	}
	
}
