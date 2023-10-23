package com.java.seg.challenge.core.service.calculator;

import java.util.List;

public interface CalculatorService {
    Double calculateInsuranceTax(Double value, List<Double> taxes);
}
