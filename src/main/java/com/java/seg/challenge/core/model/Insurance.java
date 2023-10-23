package com.java.seg.challenge.core.model;

public class Insurance {
    public String InsuranceCode;
    public String IsuranceName;
    public String CategoryName;
    public Double basePrice;
    public Double taxedPrice;

    public String getInsuranceCode() {
        return this.InsuranceCode;
    }

    public void setInsuranceCode(String InsuranceCode) {
        this.InsuranceCode = InsuranceCode;
    }

    public String getIsuranceName() {
        return this.IsuranceName;
    }

    public void setIsuranceName(String IsuranceName) {
        this.IsuranceName = IsuranceName;
    }

    public String getCategoryName() {
        return this.CategoryName;
    }

    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    public Double getBasePrice() {
        return this.basePrice;
    }

    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    public Double getTaxedPrice() {
        return this.taxedPrice;
    }

    public void setTaxedPrice(Double taxedPrice) {
        this.taxedPrice = taxedPrice;
    }

}
