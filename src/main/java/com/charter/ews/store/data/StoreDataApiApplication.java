package com.charter.ews.store.data;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Store Data API",
				description = "Store Data API",
				version = "v2.0")
)
public class StoreDataApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreDataApiApplication.class, args);
	}

}
