package com.java.seg.challenge.infra.adpaters.database.categorytax;

import java.util.ArrayList;
import java.util.List;

import com.java.seg.challenge.core.model.CategoryTax;
import com.java.seg.challenge.core.repository.CategoryTaxRepository;
import com.java.seg.challenge.infra.adpaters.database.categorytax.mapper.CategoryTaxMapper;

public class CategoryTaxRepositoryJDBC implements CategoryTaxRepository {

    private CategoryTaxRepositoryJPA repository;

    private CategoryTaxMapper mapper;

    @Override
    public List<CategoryTax> getByCategoryCode(Integer id) {
        List<CategoryTax> response = new ArrayList<CategoryTax>();
        List<CategoryTaxEntity> categoryTaxEntityList = repository.findByCategoryCode(id);
        for (CategoryTaxEntity categoryTaxEntity : categoryTaxEntityList) {
            response.add(mapper.toModel(categoryTaxEntity));
        }
        return response;
    }

    @Override
    public List<CategoryTax> getByCategoryTaxCode(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getByCategoryTaxCode'");
    }

}
