package com.java.seg.challenge.core.model;

public class Insurance {
    private String InsuranceCode;
    private String InsuranceName;
    private String CategoryName;
    private Integer CategoryCode;
    private Double basePrice;
    private Double taxedPrice;

    public String getInsuranceCode() {
        return this.InsuranceCode;
    }

    public void setInsuranceCode(String InsuranceCode) {
        this.InsuranceCode = InsuranceCode;
    }

    public String getInsuranceName() {
        return this.InsuranceName;
    }

    public void setInsuranceName(String IsuranceName) {
        this.InsuranceName = IsuranceName;
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

    public Integer getCategoryCode() {
        return this.CategoryCode;
    }

    public void setCategoryCode(Integer CategoryCode) {
        this.CategoryCode = CategoryCode;
    }

}
