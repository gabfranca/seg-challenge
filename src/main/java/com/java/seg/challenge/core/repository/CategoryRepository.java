package com.java.seg.challenge.core.repository;

import com.java.seg.challenge.core.model.Category;

public interface CategoryRepository {
       public Category getByCategoryCode(Integer id);

       public Category getByCategoryName(String id);

       public Category insertCategory(Category Category);

       public Category updateCategory(Category Category);
}
