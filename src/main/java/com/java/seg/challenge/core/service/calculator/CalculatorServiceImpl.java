package com.java.seg.challenge.core.service.calculator;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public Double calculateInsuranceTax(Double value, List<Double> taxes) {
        Double response = value;
        for (Double tax : taxes) {
            response += (value * tax);
        }
        return response;
    }

}
