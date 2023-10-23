package com.java.seg.challenge.infra.adpaters.database.insurance.mapper;

import org.springframework.stereotype.Component;

import com.java.seg.challenge.core.model.Insurance;
import com.java.seg.challenge.infra.adpaters.database.category.CategoryEntity;
import com.java.seg.challenge.infra.adpaters.database.insurance.InsuranceEntity;

@Component
public class InsuranceMapper {
    public Insurance toModel(InsuranceEntity entity) {
        Insurance response = new Insurance();
        response.setInsuranceCode(entity.getId());
        response.setInsuranceName(entity.getName());
        response.setBasePrice(entity.getBasePrice());
        response.setTaxedPrice(entity.getTaxedPrice());
        return response;
    }

    public InsuranceEntity toEntity(Insurance model) {
        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setId(model.getCategoryCode());
        InsuranceEntity entity = new InsuranceEntity();
        entity.setId(model.getInsuranceCode());
        entity.setName(model.getInsuranceName());
        entity.setBasePrice(model.getBasePrice());
        entity.setTaxedPrice(model.getTaxedPrice());
        entity.setCategory(categoryEntity);
        return entity;
    }
}
