package com.charter.ews.store.data.logging;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

public class TransactionRequestImplTest {

	@Test
	void testEqualsAndHashcode() {
		EqualsVerifier.simple().forClass(TransactionRequestImpl.class).suppress(Warning.INHERITED_DIRECTLY_FROM_OBJECT)
				.verify();
	}

	@Test
	void testUserId() {
		TransactionRequestImpl transactionRequest = new TransactionRequestImpl();
		transactionRequest.setUserId("1234");
		assertEquals("1234", transactionRequest.getUserId());

	}

	@Test
	void testClientId() {
		TransactionRequestImpl transactionRequest = new TransactionRequestImpl();
		transactionRequest.setClientId("CID12");
		assertEquals("CID12", transactionRequest.getClientId());

	}

	@Test
	void testTransactionId() {
		TransactionRequestImpl transactionRequest = new TransactionRequestImpl();
		transactionRequest.setTransactionId("TID1234");
		assertEquals("TID1234", transactionRequest.getTransactionId());

	}

}