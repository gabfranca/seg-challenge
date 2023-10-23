package com.java.seg.challenge.infra.adpaters.database.insurance.mapper;

import com.java.seg.challenge.core.model.Insurance;
import com.java.seg.challenge.infra.adpaters.database.insurance.InsuranceEntity;

public class InsuranceMapper {
    public Insurance toModel(InsuranceEntity entity) {
        Insurance response = new Insurance();
        response.setInsuranceCode(entity.getId());
        response.setIsuranceName(entity.getName());
        response.setBasePrice(entity.getBasePrice());
        response.setTaxedPrice(entity.getTaxedPrice());
        return response;
    }

    public InsuranceEntity toEntity(Insurance model) {
        InsuranceEntity entity = new InsuranceEntity();
        entity.setId(model.getInsuranceCode());
        entity.setName(model.getCategoryName());
        entity.setBasePrice(model.getBasePrice());
        entity.setTaxedPrice(model.getTaxedPrice());
        return entity;
    }
}
