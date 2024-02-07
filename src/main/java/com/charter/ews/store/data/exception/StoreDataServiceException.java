package com.charter.ews.store.data.exception;

public class StoreDataServiceException extends RuntimeException {

	private static final long serialVersionUID = 1568856858130862965L;

	public StoreDataServiceException() {
		super();
	}

	public StoreDataServiceException(String message) {
		super(message);
	}

	public StoreDataServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public StoreDataServiceException(Throwable cause) {
		super(cause);
	}
}
