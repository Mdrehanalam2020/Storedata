package com.charter.ews.store.data.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDate;

@Data
@Schema(description = "Store Data Response")
public class StoreDataResponse {

    private String storeSId;
    private String storeNumber;
    private String storeName;
    private String siteAddress;
    private String city;
    private String stateCode;
    private String zip;
    private String legacyCorp;
    private String storeType;
    private String storeStatus;
    private String storeCategory;
    private String region;
    private String division;
    private String market;
    private String erpSystemId;
    private String searchEntityId;
    private String mobileStore;
    private String glid;
    private String sunday;
    private String monday;
    private String tuesday;
    private String wednesday;
    private String thursday;
    private String friday;
    private String saturday;
    private String CSGTechBufferId;
    private String ICOMSTechBufferId;
    private String merchantId;
    private Integer adaWorkstations;
    private Integer fullServWorkstations;
    private Integer greeterStations;
    private Integer totalWorkStations;
    private String posEnabledStatus;
    private Integer posQuantity;
    private LocalDate storeOpeningDate;
    private LocalDate grandOpeningDate;
    private LocalDate storeClosingDate;
    private String gatewayUse;
    private String notes;
    private Integer versionNumber;
    private String relocationToStore;
    private String queuingSystem;
    private String safeRoom;
    private String latitude;
    private String longitude;
    private String primaryBiller;
    private String sharedFacility;
    private String secondaryBiller;
    private String qmaticMountType;
    private LocalDate startDate;
    private LocalDate stopDate;
}
