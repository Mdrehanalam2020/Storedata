package com.charter.ews.store.data.controller;

import com.charter.ews.store.data.model.ErrorResponse;
import com.charter.ews.store.data.model.StoreDataResponse;
import com.charter.ews.store.data.service.StoreDataService;
import com.charter.ews.store.data.utils.StoreDataUtility;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@Tag(name = "store-data-controller", description = "store-data-controller")
@RestController
@RequestMapping("/solo-services/storeData/v1/")
public class StoreDataController {

    @Autowired
    StoreDataService storeDataService;

    @Operation(summary = "storeData-Hello",
    responses = {
            @ApiResponse(responseCode = "200", description = "OK")
    })
    @GetMapping("/hello")
    public String hello(){
        return "Hello from Store API";
    }

    @Operation(summary = "storeData", responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = StoreDataResponse.class))),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
    })
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/{storeNumber}")
    public ResponseEntity<StoreDataResponse> storeData(
            @RequestHeader(required = true, name = "client-id") String clientId,
            @RequestHeader(required = true, name = "session-id") String sessionId,
            @RequestHeader(required = true, name = "transaction-id") String transactionId,
            @RequestHeader(required = false, name = "user-id") String userId,
            @PathVariable("storeNumber")
            String storeNumber
    ){
        HttpHeaders headers = new HttpHeaders();
        headers.add("transactionId", transactionId);
        headers.add("session-id", sessionId);
        StoreDataUtility.validateStoreData(storeNumber);
        return ResponseEntity.ok().headers(headers).body(storeDataService.getDataByStoreNumber(storeNumber));
    }

    @ExceptionHandler(value = {ConstraintViolationException.class})
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ResponseEntity<String> handleValidationFailure(ConstraintViolationException ex) {
        StringBuilder messages = new StringBuilder();

        for (ConstraintViolation<?> violation : ex.getConstraintViolations()) {
            messages.append(violation.getMessage());
        }

        return ResponseEntity.badRequest().body(messages.toString());
    }
}
