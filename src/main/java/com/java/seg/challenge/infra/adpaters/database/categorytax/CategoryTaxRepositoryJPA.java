package com.java.seg.challenge.infra.adpaters.database.categorytax;

import java.util.List;

 
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryTaxRepositoryJPA extends JpaRepository<CategoryTaxEntity, Integer>{
    List<CategoryTaxEntity> findByCategoryCode(Integer categoryCode);
}
