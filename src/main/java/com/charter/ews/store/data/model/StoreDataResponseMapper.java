package com.charter.ews.store.data.model;

import com.charter.ews.store.data.entities.StoreData;
import org.springframework.stereotype.Component;

@Component
public class StoreDataResponseMapper {

    public StoreDataResponse mapResponse(StoreData storeDataEntity)
    {
        StoreDataResponse storeData=new StoreDataResponse();
        storeData.setStoreSId(storeDataEntity.getStoreSId() == null ? null :String.valueOf(storeDataEntity.getStoreSId()));
        storeData.setStoreNumber(storeDataEntity.getStoreNumber());
        storeData.setStoreName(storeDataEntity.getStoreName());
        storeData.setSiteAddress(storeDataEntity.getSiteAddress());
        storeData.setCity(storeDataEntity.getCity());
        storeData.setStateCode(storeDataEntity.getState());
        storeData.setZip(storeDataEntity.getZip());
        storeData.setLegacyCorp(storeDataEntity.getLegacyBrand());
        storeData.setStoreType(storeDataEntity.getStoreType());
        storeData.setStoreStatus(storeDataEntity.getStoreStatus());
        storeData.setStoreCategory(storeDataEntity.getStoreCategory());
        storeData.setRegion(storeDataEntity.getRegion());
        storeData.setDivision(storeDataEntity.getDivision());
        storeData.setMarket(storeDataEntity.getMarket());
        storeData.setErpSystemId(storeDataEntity.getErpSystemId());
        storeData.setSearchEntityId(storeDataEntity.getSearchEntityId());
        storeData.setMobileStore(storeDataEntity.getMobileStore());
        storeData.setGlid(storeDataEntity.getGlid());
        storeData.setSunday(storeDataEntity.getSunday());
        storeData.setMonday(storeDataEntity.getMonday());
        storeData.setTuesday(storeDataEntity.getTuesday());
        storeData.setWednesday(storeDataEntity.getWednesday());
        storeData.setThursday(storeDataEntity.getThursday());
        storeData.setFriday(storeDataEntity.getFriday());
        storeData.setSaturday(storeDataEntity.getSaturday());
        storeData.setCSGTechBufferId(storeDataEntity.getCSGTechBufferId());
        storeData.setICOMSTechBufferId(storeDataEntity.getICOMSTechBufferId());
        storeData.setMerchantId(storeDataEntity.getMerchantId());
        storeData.setAdaWorkstations(storeDataEntity.getAdaWorkstations()==null?null : Math.toIntExact(storeDataEntity.getAdaWorkstations()));
        storeData.setFullServWorkstations(storeDataEntity.getFullServWorkstations()==null?null : Math.toIntExact(storeDataEntity.getFullServWorkstations()));
        storeData.setGreeterStations(storeDataEntity.getGreeterStations()==null?null : Math.toIntExact(storeDataEntity.getGreeterStations()));
        storeData.setTotalWorkStations(storeDataEntity.getTotalWorkStations()==null?null : Math.toIntExact(storeDataEntity.getTotalWorkStations()));
        storeData.setPosEnabledStatus(storeDataEntity.getPosEnabledStatus());
        storeData.setPosQuantity(storeDataEntity.getPosQuantity() ==null?null : Math.toIntExact(storeDataEntity.getPosQuantity()) );
        storeData.setStartDate(storeDataEntity.getStartDate());
        storeData.setStopDate(storeDataEntity.getEndDate());
        //	storeData.setchangeid
        //	storeData.setchangeNotes
        storeData.setStoreOpeningDate(storeDataEntity.getStoreOpeningDate());
        storeData.setGrandOpeningDate(storeDataEntity.getGrandOpeningDate());
        storeData.setStoreClosingDate(storeDataEntity.getStoreClosingDate());
        storeData.setGatewayUse(storeDataEntity.getGatewayUse());
        storeData.setNotes(storeDataEntity.getNotes());
        storeData.setVersionNumber(storeDataEntity.getVersionNumber() ==null?null : Math.toIntExact(storeDataEntity.getVersionNumber()));
        //	storeData.setApprovalStaus
        storeData.setRelocationToStore(storeDataEntity.getRelocationToStore());
        storeData.setQueuingSystem(storeDataEntity.getQueuingSystem());
        storeData.setSafeRoom(storeDataEntity.getSafeRoom());
        storeData.setLatitude(storeDataEntity.getLatitude());
        storeData.setLongitude(storeDataEntity.getLongitude());
        storeData.setPrimaryBiller(storeDataEntity.getPrimaryBiller());
        storeData.setSharedFacility(storeDataEntity.getSharedFacility());
        storeData.setSecondaryBiller(storeDataEntity.getSecondaryBiller());
        storeData.setQmaticMountType(storeDataEntity.getQmaticMountType());

        return storeData;

    }
}
