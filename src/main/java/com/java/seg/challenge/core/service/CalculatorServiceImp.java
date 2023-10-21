package com.java.seg.challenge.core.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImp implements CalculatorService {

    @Override
    public Double calculateInsuranceTax(Double value, List<Double> taxes) {
        Double response = value;
        for (Double tax : taxes) {
            response += (value * tax);
        }
        return response;
    }

}
