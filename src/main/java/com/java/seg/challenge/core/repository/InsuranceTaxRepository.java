package com.java.seg.challenge.core.repository;

import java.util.List;

import com.java.seg.challenge.core.model.InsuranceTax;

public interface InsuranceTaxRepository {
    public List<InsuranceTax> getByInsuranceCode(Integer id);
    public List<InsuranceTax> getByInsuranceTaxCode(Integer id);
}
