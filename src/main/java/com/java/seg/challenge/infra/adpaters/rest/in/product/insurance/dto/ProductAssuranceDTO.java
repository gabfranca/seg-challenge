package com.java.seg.challenge.infra.adpaters.rest.in.product.insurance.dto;

public class ProductAssuranceDTO {
    private String name;
    private String category;
    private Double baseValue;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getBaseValue() {
        return baseValue;
    }

    public void setBaseValue(Double baseValue) {
        this.baseValue = baseValue;
    }
}