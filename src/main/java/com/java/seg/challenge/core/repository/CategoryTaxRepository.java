package com.java.seg.challenge.core.repository;

import java.util.List;

import com.java.seg.challenge.core.model.CategoryTax;

public interface CategoryTaxRepository {
    public List<CategoryTax> getByCategoryCode(Integer id);

    public List<CategoryTax> getByCategoryTaxCode(Integer id);
}
