package com.charter.ews.store.data.service;

import java.time.LocalDate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.charter.ews.store.data.entities.StoreData;
import com.charter.ews.store.data.exception.NoDataFoundException;
import com.charter.ews.store.data.model.StoreDataResponse;
import com.charter.ews.store.data.model.StoreDataResponseMapper;
import com.charter.ews.store.data.repository.StoreDataRepository;

@Service
public class StoreDataService {

    private static final String RECORD_STATUS_ACTIVE = "A";
    @Autowired
    StoreDataRepository storeDataRepository;

    @Autowired
    StoreDataResponseMapper storeDataResponseMapper;
    
    private static final Logger LOGGER = LogManager.getLogger(StoreDataService.class);

    public StoreDataResponse getDataByStoreNumber(String storeNumber){

        StoreData storeDataEntity = storeDataRepository.getByStoreNumberAndAuditRecordStatusAndEndDateGreaterThan(storeNumber, RECORD_STATUS_ACTIVE, LocalDate.now()).orElseThrow(()->
                new NoDataFoundException("storeNumber :  " + storeNumber + " doesn't exists."));
        return storeDataResponseMapper.mapResponse(storeDataEntity);
    }
}
