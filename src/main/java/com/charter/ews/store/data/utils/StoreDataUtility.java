package com.charter.ews.store.data.utils;

import java.util.function.BooleanSupplier;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

import com.charter.ews.store.data.exception.StoreDataServiceException;

@NoArgsConstructor
//@AllArgsConstructor
public class StoreDataUtility {

	static public void validateStoreData(String storeNumber) {
        validate(storeNumber::isBlank, "storeNumber is required");
        validate(() -> !StringUtils.isNumeric(storeNumber), "storeNumber should be a number");
        validate(() -> storeNumber.length() != 4, "storeNumber length should be equal to 4.");
    }

    static private void validate(BooleanSupplier condition, String errorMessage) {
        if (condition.getAsBoolean()) {
            throw new StoreDataServiceException(errorMessage);
        }
    }
}
