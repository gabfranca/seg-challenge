package com.java.seg.challenge.core.service.insurance;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.java.seg.challenge.core.model.Category;
import com.java.seg.challenge.core.model.CategoryTax;
import com.java.seg.challenge.core.model.Insurance;
import com.java.seg.challenge.core.repository.CategoryRepository;
import com.java.seg.challenge.core.repository.CategoryTaxRepository;
import com.java.seg.challenge.core.repository.InsuranceRepository;
import com.java.seg.challenge.core.service.calculator.CalculatorService;

@Service
public class InsuranceHandlerImpl implements InsuranceHandler {
    private final CategoryRepository categoryRepository;
    private final CategoryTaxRepository categoryTaxRepository;
    private final CalculatorService calculatorService;
    private final InsuranceRepository insuranceRepository;

    public InsuranceHandlerImpl(CategoryRepository categoryRepository, CategoryTaxRepository categoryTaxRepository,
            CalculatorService calculatorService, InsuranceRepository insuranceRepository) {
        this.categoryRepository = categoryRepository;
        this.categoryTaxRepository = categoryTaxRepository;
        this.calculatorService = calculatorService;
        this.insuranceRepository = insuranceRepository;
    }

    @Override
    public Insurance insert(Insurance insurance) throws Exception {
        if (insurance.getInsuranceCode() == null) {
            return this.process(insurance);
        } else {
            throw new Exception("not permitted operation");
        }
    }

    @Override
    public Insurance update(Insurance insurance) throws Exception {
        if (insurance.getInsuranceCode() != null) {
            try {
                insuranceRepository.getByCode(insurance.getInsuranceCode());
                return this.process(insurance);
            } catch (Exception e) {
                throw new Exception("insurance not found.");
            }
        } else {
            throw new Exception("not permitted operation.");
        }
    }

    @Override
    public Insurance getByCode(String code) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getByCode'");
    }

    @Override
    public Insurance process(Insurance insurance) {
        Category category = categoryRepository.getByCategoryName(insurance.getCategoryName());
        List<CategoryTax> categoryTaxList = categoryTaxRepository.getByCategoryCode(category.getCategoryCode());
        List<Double> taxes = categoryTaxList.stream().map(x -> (x.getTaxPercentValue()) / 100)
                .collect(Collectors.toList());
        Double calculatedPrice = calculatorService.calculateInsuranceTax(insurance.getBasePrice(), taxes);
        insurance.setTaxedPrice(calculatedPrice);
        insurance.setCategoryCode(category.getCategoryCode());
        insurance = insuranceRepository.createInsurance(insurance);
        insurance.setCategoryName(category.getCategoryName());
        insurance.setCategoryCode(category.getCategoryCode());
        return insurance;
    }

}
