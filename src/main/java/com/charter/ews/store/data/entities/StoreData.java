package com.charter.ews.store.data.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@Table(name = "store")
//@Table(name = "T_RDM_MASTERSTORELOC")
//@Table(name = "T_RDM_MASTERSTORELOC", schema = "RDM")
public class StoreData {

    @Id
    @Column(name = "STORESID", nullable = false)
    private Long storeSId;

    //@Size(max = 5, message = "Store Number should not be more than 5")
    @Column(name = "STORENUMBER")
    private String storeNumber;

    @Column(name = "STORENAME")
    private String storeName;

    @Column(name = "SITEADDRESS")
    private String siteAddress;

    @Column(name = "CITY")
    private String city;

    @Column(name = "STATECD")
    private String state;

    @Column(name = "ZIP")
    private String zip;

    @Column(name = "LEGACYCORP")
    private String legacyBrand;

    @Column(name = "STORETYPE")
    private String storeType;

    @Column(name = "STORESTATUS")
    private String storeStatus;

    @Column(name = "STORECATEGORY")
    private String storeCategory;

    @Column(name = "REGION")
    private String region;

    @Column(name = "DIVISION")
    private String division;

    @Column(name = "MARKET")
    private String market;

    @Column(name = "ERPSYSTEMID")
    private String erpSystemId;

    @Column(name = "SEARCHENTITYID")
    private String searchEntityId;

    @Column(name = "MOBILESTORE")
    private String mobileStore;

    @Column(name = "GLID")
    private String glid;

    @Column(name = "SUNDAY")
    private String sunday;

    @Column(name = "MONDAY")
    private String monday;

    @Column(name = "TUESDAY")
    private String tuesday;

    @Column(name = "WEDNESDAY")
    private String wednesday;

    @Column(name = "THURSDAY")
    private String thursday;

    @Column(name = "FRIDAY")
    private String friday;

    @Column(name = "SATURDAY")
    private String saturday;

    @Column(name = "CSGTECHBUFFERID")
    private String CSGTechBufferId;

    @Column(name = "ICOMSTECHBUFFERID ")
    private String ICOMSTechBufferId;

    @Column(name = "MERCHANTID")
    private String merchantId;

    @Column(name = "ADAWORKSTATIONS")
    private Long adaWorkstations;

    @Column(name = "FULLSERVWORKSTATIONS")
    private Long fullServWorkstations;

    @Column(name = "GREETERSTATIONS")
    private Long greeterStations;

    @Column(name = "TOTALWORKSTATIONS")
    private Long totalWorkStations;

    @Column(name = "POSENABLEDSTATUS")
    private String posEnabledStatus;

    @Column(name = "POSQUANTITY")
    private Long posQuantity;

    @Column(name = "STOREOPENINGDATE")
    private LocalDate storeOpeningDate;

    @Column(name = "GRANDOPENINGDATE")
    private LocalDate grandOpeningDate;

    @Column(name = "STORECLOSINGDATE")
    private LocalDate storeClosingDate;

    @Column(name = "GATEWAYUSE")
    private String gatewayUse;

    @Column(name = "NOTES")
    private String notes;

    @Column(name = "VERSIONNUMBER")
    private Long versionNumber;

    @Column(name = "RELOCATEDTOSTORE")
    private String relocationToStore;

    @Column(name = "QUEUINGSYSTEM")
    private String queuingSystem;

    @Column(name = "SAFEROOM")
    private String safeRoom;

    @Column(name = "LATITUDE")
    private String latitude;

    @Column(name = "LONGITUDE")
    private String longitude;

    @Column(name = "PRIMARYBILLER")
    private String primaryBiller;

    @Column(name = "SHAREDFACILITY")
    private String sharedFacility;

    @Column(name = "SECONDARYBILLER")
    private String secondaryBiller;

    @Column(name = "QMATICMOUNTTYPE")
    private String qmaticMountType;

    @Column(name = "START_DATE")
    private LocalDate startDate;

    @Column(name = "END_DATE")
    private LocalDate endDate;

    @Embedded
    private Audit audit;
}
