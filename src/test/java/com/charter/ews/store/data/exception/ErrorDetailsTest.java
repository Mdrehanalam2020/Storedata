package com.charter.ews.store.data.exception;

import org.junit.jupiter.api.Test;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

public class ErrorDetailsTest {
	
	
	@Test
	void testEqualsAndHashcode()
	{
		EqualsVerifier.simple().forClass(ErrorDetails.class).suppress(Warning.INHERITED_DIRECTLY_FROM_OBJECT).verify();
	}
	
}
