package com.java.seg.challenge.core.model;

import java.time.LocalDateTime;

public class Insurance {
    public Integer insuranceCode;
    public String insuranceName;
    public String insuranceDescription;
    public LocalDateTime createDate;
    public LocalDateTime alterDate;

    public Integer getInsuranceCode() {
        return this.insuranceCode;
    }

    public void setInsuranceCode(Integer insuranceCode) {
        this.insuranceCode = insuranceCode;
    }

    public String getInsuranceName() {
        return this.insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public String getInsuranceDescription() {
        return this.insuranceDescription;
    }

    public void setInsuranceDescription(String insuranceDescription) {
        this.insuranceDescription = insuranceDescription;
    }

    public LocalDateTime getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getAlterDate() {
        return this.alterDate;
    }

    public void setAlterDate(LocalDateTime alterDate) {
        this.alterDate = alterDate;
    }
}
