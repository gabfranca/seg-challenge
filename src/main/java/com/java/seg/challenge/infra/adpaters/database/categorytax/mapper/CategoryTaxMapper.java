package com.java.seg.challenge.infra.adpaters.database.categorytax.mapper;

import org.springframework.stereotype.Component;

import com.java.seg.challenge.core.model.CategoryTax;
import com.java.seg.challenge.infra.adpaters.database.categorytax.CategoryTaxEntity;

@Component
public class CategoryTaxMapper {
    public CategoryTax toModel(CategoryTaxEntity entity) {
        CategoryTax categoryTax = new CategoryTax();
        categoryTax.setCategoryTaxCode(entity.getId());
        categoryTax.setCategoryCode(entity.getCategoryCode());
        categoryTax.setTaxPercentValue(entity.getTaxValue());
        return categoryTax;
    }

    public CategoryTaxEntity toEntity(CategoryTax model) {
        CategoryTaxEntity categoryTaxEntity = new CategoryTaxEntity();
        categoryTaxEntity.setId(model.getCategoryCode());
        categoryTaxEntity.setCategoryCode(model.getCategoryCode());
        categoryTaxEntity.setTaxValue(model.getTaxPercentValue());
        return categoryTaxEntity;
    }

}
