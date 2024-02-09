package com.charter.ews.store.data.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.charter.ews.store.data.logging.CommonEndpointErrorHandling;
import com.charter.ews.store.data.logging.CommonEndpointLogging;
import com.charter.ews.store.data.model.StoreDataResponse;
import com.charter.ews.store.data.service.StoreDataService;
import com.charter.ews.store.data.utils.StoreDataUtility;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "store-data-controller", description = "store-data-controller")
@RestController
@RequestMapping("/store-data-api/solo-services/storeData/v1/")
@CommonEndpointLogging
@CommonEndpointErrorHandling
public class StoreDataController {

	private static final Logger LOGGER = LogManager.getLogger(StoreDataController.class);

	@Autowired
	StoreDataService storeDataService;

	@Operation(summary = "storeData-Hello", responses = { @ApiResponse(responseCode = "200", description = "OK") })
	@GetMapping("/hello")
	public ResponseEntity<String> hello() {
		return ResponseEntity.ok().body("Hello from Store API");
	}

	@Operation(summary = "storeData", responses = {
			@ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = StoreDataResponse.class))),
			@ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(hidden = true))),
			@ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(hidden = true))),
			@ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(hidden = true))),
			@ApiResponse(responseCode = "404", description = "Not Found", content = @Content(schema = @Schema(hidden = true))) })
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/{storeNumber}")
	public ResponseEntity<StoreDataResponse> storeData(
			@RequestHeader(required = true, name = "client-id") String clientId,
			@RequestHeader(required = true, name = "session-id") String sessionId,
			@RequestHeader(required = true, name = "transaction-id") String transactionId,
			@RequestHeader(required = false, name = "user-id") String userId,
			@PathVariable("storeNumber") String storeNumber) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("transactionId", transactionId);
		headers.add("session-id", sessionId);
		StoreDataUtility.validateStoreData(storeNumber);
		LOGGER.info("storeNumber : {}", storeNumber);
		return ResponseEntity.ok().headers(headers).body(storeDataService.getDataByStoreNumber(storeNumber));
	}

}
