package com.java.seg.challenge.core.service.insurance;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.java.seg.challenge.core.model.Category;
import com.java.seg.challenge.core.model.CategoryTax;
import com.java.seg.challenge.core.model.Insurance;
import com.java.seg.challenge.core.repository.CategoryRepository;
import com.java.seg.challenge.core.repository.CategoryTaxRepository;
import com.java.seg.challenge.core.service.calculator.CalculatorService;

@Service
public class InsuranceHandlerImpl implements InsuranceHandler {
    private final CategoryRepository categoryRepository;
    private final CategoryTaxRepository categoryTaxRepository;
    private final CalculatorService calculatorService;

    public InsuranceHandlerImpl(CategoryRepository categoryRepository, CategoryTaxRepository categoryTaxRepository,
            CalculatorService calculatorService) {
        this.categoryRepository = categoryRepository;
        this.categoryTaxRepository = categoryTaxRepository;
        this.calculatorService = calculatorService;
    }

    @Override
    public Insurance insert(Insurance insurance) {
        Category category = categoryRepository.getByCategoryName(insurance.getCategoryName());
        List<CategoryTax> categoryTaxList = categoryTaxRepository.getByCategoryCode(category.getCategoryCode());
        List<Double> taxes = categoryTaxList.stream().map(x -> (x.TaxPercentValue) / 100).collect(Collectors.toList());
        Double calculatedPrice = calculatorService.calculateInsuranceTax(insurance.getBasePrice(), taxes);
        insurance.setTaxedPrice(calculatedPrice);
        return insurance;
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
