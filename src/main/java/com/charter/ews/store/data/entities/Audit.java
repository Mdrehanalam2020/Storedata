package com.charter.ews.store.data.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Audit implements Serializable {

    @Column(name = "RECORD_STAT", nullable = true, length = 1, updatable = true, insertable = true)
    private String recordStatus;

    @Column(name = "CREATED_DTTM", nullable = true, updatable = false)
    private Date createdDateTime;

    @Column(name = "CREATED_BY", nullable = true, length = 100, updatable = true)
    private String createdBy;

    @Column(name = "MODIFIED_DTTM")
    private Date modifiedDateTime;

    @Column(name = "MODIFIED_BY", length = 100)
    private String modifiedBy;
}
