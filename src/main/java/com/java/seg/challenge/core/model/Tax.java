package com.java.seg.challenge.core.model;

import java.time.LocalDateTime;

public class Tax {
    public Integer TaxCode;
    public String Taxname;
    public String Taxdescription;
    public Double taxValue;
    public LocalDateTime createDate;
    public LocalDateTime alterDate;

    public Integer getTaxCode() {
        return this.TaxCode;
    }

    public void setTaxCode(Integer TaxCode) {
        this.TaxCode = TaxCode;
    }

    public String getTaxname() {
        return this.Taxname;
    }

    public void setTaxname(String Taxname) {
        this.Taxname = Taxname;
    }

    public String getTaxdescription() {
        return this.Taxdescription;
    }

    public void setTaxdescription(String Taxdescription) {
        this.Taxdescription = Taxdescription;
    }

    public Double getTaxValue() {
        return this.taxValue;
    }

    public void setTaxValue(Double taxValue) {
        this.taxValue = taxValue;
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
