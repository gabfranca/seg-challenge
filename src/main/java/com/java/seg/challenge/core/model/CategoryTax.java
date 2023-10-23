package com.java.seg.challenge.core.model;

public class CategoryTax {
    private Integer CategoryTaxCode;
    private Integer CategoryCode;
    private Integer TaxCode;
    private Double TaxPercentValue;

    public Integer getCategoryTaxCode() {
        return this.CategoryTaxCode;
    }

    public void setCategoryTaxCode(Integer CategoryTaxCode) {
        this.CategoryTaxCode = CategoryTaxCode;
    }

    public Integer getCategoryCode() {
        return this.CategoryCode;
    }

    public void setCategoryCode(Integer CategoryCode) {
        this.CategoryCode = CategoryCode;
    }

    public Integer getTaxCode() {
        return this.TaxCode;
    }

    public void setTaxCode(Integer TaxCode) {
        this.TaxCode = TaxCode;
    }

    public Double getTaxPercentValue() {
        return this.TaxPercentValue;
    }

    public void setTaxPercentValue(Double TaxPercentValue) {
        this.TaxPercentValue = TaxPercentValue;
    }
}
