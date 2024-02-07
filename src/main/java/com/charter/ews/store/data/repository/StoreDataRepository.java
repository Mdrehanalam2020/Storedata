package com.charter.ews.store.data.repository;

import com.charter.ews.store.data.entities.StoreData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;

public interface StoreDataRepository extends JpaRepository<StoreData, Long> {

    public Optional<StoreData> getByStoreNumberAndAuditRecordStatusAndEndDateGreaterThan(String storeNumber, String recordStatus, LocalDate date);
}
