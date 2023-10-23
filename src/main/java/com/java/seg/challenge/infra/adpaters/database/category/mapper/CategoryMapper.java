package com.java.seg.challenge.infra.adpaters.database.category.mapper;

import org.springframework.stereotype.Component;

import com.java.seg.challenge.core.model.Category;
import com.java.seg.challenge.infra.adpaters.database.category.CategoryEntity;

@Component
public class CategoryMapper {
    public Category toModel(CategoryEntity entity) {
        Category response = new Category();
        response.setCategoryCode(entity.getId());
        response.setCategoryName(entity.getName());
        response.setCategoryDescription(entity.getDescription());
        response.setAlterDate(entity.getAlterDate());
        response.setCreateDate(entity.getCreateDate());
        return response;
    }

    public CategoryEntity toEntity(Category model) {
        CategoryEntity entity = new CategoryEntity();
        entity.setId(model.getCategoryCode());
        entity.setName(model.CategoryName);
        entity.setDescription(model.getCategoryDescription());
        entity.setCreateDate(model.getCreateDate());
        entity.setAlterDate(model.getAlterDate());
        return entity;
    }
}
