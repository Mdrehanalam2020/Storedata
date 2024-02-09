package com.charter.ews.store.data.exception;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.charter.ews.store.data.model.ErrorResponse;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	private static final Logger LOGGER = LogManager.getLogger(GlobalExceptionHandler.class);
	

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError)error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });

        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }
    
    //handle global exception

   	   @ExceptionHandler({Exception.class, NoDataFoundException.class, StoreDataServiceException.class,CharterWebFaultException.class})
       public ResponseEntity<ErrorResponse> handleGlobalException(Exception ex, WebRequest webRequest){
   		   
   		ErrorResponse errorResponse = new ErrorResponse();
   		HttpStatus status = null;
		if (ex instanceof StoreDataServiceException) {
			status = HttpStatus.BAD_REQUEST;
			errorResponse.setSource("REQUEST");
			errorResponse.setErrorCode(status.toString());
			errorResponse.setErrorMessage(ex.getMessage());
		} else if (ex instanceof NoDataFoundException) {
			status = HttpStatus.NOT_FOUND;
			errorResponse.setSource("REQUEST");
			errorResponse.setErrorCode(status.toString());
			errorResponse.setErrorMessage(ex.getMessage());
		}else {
			status = HttpStatus.INTERNAL_SERVER_ERROR;
			errorResponse.setSource("REQUEST");
			errorResponse.setErrorCode(status.toString());
			errorResponse.setErrorMessage(ex.getMessage());
		}
		return ResponseEntity.status(status).body(errorResponse);
       
       }
    
}
