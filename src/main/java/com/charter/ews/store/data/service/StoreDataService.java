package com.charter.ews.store.data.service;

import com.charter.ews.store.data.entities.StoreData;
import com.charter.ews.store.data.exception.NoDataFoundException;
import com.charter.ews.store.data.model.StoreDataResponse;
import com.charter.ews.store.data.model.StoreDataResponseMapper;
import com.charter.ews.store.data.repository.StoreDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class StoreDataService {

    private static final String RECORD_STATUS_ACTIVE = "A";
    @Autowired
    StoreDataRepository storeDataRepository;

    @Autowired
    StoreDataResponseMapper storeDataResponseMapper;

    public StoreDataResponse getDataByStoreNumber(String storeNumber){

        StoreData storeDataEntity = storeDataRepository.getByStoreNumberAndAuditRecordStatusAndEndDateGreaterThan(storeNumber, RECORD_STATUS_ACTIVE, LocalDate.now()).orElseThrow(()->
                new NoDataFoundException("storeNumber :  " + storeNumber + " doesn't exists."));

        return storeDataResponseMapper.mapResponse(storeDataEntity);
    }
}
