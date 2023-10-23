package com.java.seg.challenge.core.service.insurance;

import org.springframework.stereotype.Service;

import com.java.seg.challenge.core.model.Category;
import com.java.seg.challenge.core.model.Insurance;
import com.java.seg.challenge.core.repository.CategoryRepository;
import com.java.seg.challenge.core.repository.CategoryTaxRepository;

@Service
public class InsuranceHandlerImpl implements InsuranceHandler {
    private final CategoryRepository categoryRepository;
    private final CategoryTaxRepository categoryTaxRepository;

    public InsuranceHandlerImpl(CategoryRepository categoryRepository, CategoryTaxRepository categoryTaxRepository) {
        this.categoryRepository = categoryRepository;
        this.categoryTaxRepository = categoryTaxRepository;

    }

    @Override
    public Insurance insert(Insurance insurance) {
        Category category = categoryRepository.getByCategoryName(insurance.getCategoryName());
        CategoryTaxRepository categoryTaxRepository = categoryTaxRepository
                .getByCategoryCode(category.getCategoryCode());
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }

    @Override
    public Insurance update(Insurance insurance) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Insurance getByCode(String code) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getByCode'");
    }

}
