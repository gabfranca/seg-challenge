package com.java.seg.challenge.infra.adpaters.database.insurance.mapper;

import com.java.seg.challenge.core.model.Insurance;
import com.java.seg.challenge.infra.adpaters.database.insurance.InsuranceEntity;

public class InsuranceMapper {
    public Insurance toModel(InsuranceEntity entity) {
        Insurance response = new Insurance();
        response.setInsuranceCode(entity.getId());
        response.setInsuranceName(entity.getName());
        response.setInsuranceDescription(entity.getDescription());
        response.setAlterDate(entity.getAlterDate());
        response.setCreateDate(entity.getCreateDate());
        return response;
    }

    public InsuranceEntity toEntity(Insurance model) {
        InsuranceEntity entity = new InsuranceEntity();
        entity.setId(model.getInsuranceCode());
        entity.setName(model.insuranceName);
        entity.setDescription(model.getInsuranceDescription());
        entity.setCreateDate(model.getCreateDate());
        entity.setAlterDate(model.getAlterDate());
        return entity;
    }
}
