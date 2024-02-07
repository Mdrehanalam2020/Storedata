package com.charter.ews.store.data.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Schema(description = "Store Data Error Response")
public class ErrorResponse {

	private String source;
	private String errorMessage;
	private String errorCode;
	public ErrorResponse(String source, String errorMessage, String errorCode) {
		super();
		this.source = source;
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
	}
	public static ErrorResponse generateErrorResponse(String source, String errorMessage, String errorCode) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setSource(source);
		errorResponse.setErrorMessage(errorMessage);
		errorResponse.setErrorCode(errorCode);

		return errorResponse;
	}
}
