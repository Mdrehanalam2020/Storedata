package com.charter.ews.store.data.repository;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.charter.ews.store.data.entities.StoreData;

public interface StoreDataRepository extends JpaRepository<StoreData, Long> {

    public Optional<StoreData> getByStoreNumberAndAuditRecordStatusAndEndDateGreaterThan(String storeNumber, String recordStatus, LocalDate date);
}
