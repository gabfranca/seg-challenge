package com.java.seg.challenge.infra.adpaters.database.category;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.java.seg.challenge.core.model.Category;
import com.java.seg.challenge.core.repository.CategoryRepository;
import com.java.seg.challenge.infra.adpaters.database.category.mapper.CategoryMapper;

@Service
public class CategoryRepositoryJDBC implements CategoryRepository {

    private final CategoryRepositoryJPA repository;
    private final CategoryMapper mapper;

    public CategoryRepositoryJDBC(CategoryRepositoryJPA repository, CategoryMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Category getByCategoryCode(Integer id) {
        Optional<CategoryEntity> response = repository.findById(id);
        return mapper.toModel(response.get());
    }

    @Override
    public Category getByCategoryName(String name) {
        Optional<CategoryEntity> response = repository.findByName(name);
        return mapper.toModel(response.get());
    }

    @Override
    public Category insertCategory(Category Category) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertCategory'");
    }

    @Override
    public Category updateCategory(Category Category) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateCategory'");
    }

}
