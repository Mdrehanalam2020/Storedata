package com.charter.ews.store.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.charter.ews.store.data.logging.CommonEndpointLoggingAspect;
import com.charter.ews.store.data.logging.EndpointErrorHandlingAspect;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Store Data API",
				description = """
						This project gives an API which which accepts the storeNumber and returns the store information associated 
						to that storeNumber from SOLO DB/RDM schema.
						It includes security, logging, external configuration, and API specification (Swagger).
                        This is a secured Endpoint and it provides different search criteria to search the account associated
                        """,
				version = "v2.0")
)
public class StoreDataApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreDataApiApplication.class, args);
	}

	@Bean
    public CommonEndpointLoggingAspect endpointLoggingAspect() {
        return new CommonEndpointLoggingAspect();
    }

	@Bean
    public EndpointErrorHandlingAspect errorHandlingAspect() {
        return new EndpointErrorHandlingAspect();
    }
}
