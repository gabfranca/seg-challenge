package com.java.seg.challenge.infra.adpaters.rest.in.product.insurance;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.seg.challenge.core.service.CalculatorService;
import com.java.seg.challenge.core.service.CalculatorServiceImp;
import com.java.seg.challenge.infra.adpaters.rest.in.product.insurance.dto.ProductAssuranceDTO;
import com.java.seg.challenge.infra.adpaters.rest.out.dto.result.ResultDTO;
import com.java.seg.challenge.infra.adpaters.rest.out.dto.result.ResultDTOBuilder;

@RestController
@RequestMapping("/v1/products")
public class ProductInsuranceController {
    private final CalculatorServiceImp calculatorService;

    ProductInsuranceController(CalculatorServiceImp calculatorService) {
        this.calculatorService = calculatorService;
    }

    @PostMapping("/insurance")
    public @ResponseBody ResultDTO inputInsurance(@RequestBody ProductAssuranceDTO request) {
        System.out.println(request);

        ResultDTOBuilder result = new ResultDTOBuilder();
        List<Double> taxes = new ArrayList<>();
        taxes.add(0.01);
        taxes.add(0.02);
        taxes.add(0.03);
        Double calculated = calculatorService.calculateInsuranceTax(request.getBaseValue(), taxes);
        request.setBaseValue(calculated);
        result.builder().withMessage("success").withContent(request);
        return result.build();
    }

    @PatchMapping("/insurance")
    public @ResponseBody ResultDTO updateInsurance(@RequestBody ProductAssuranceDTO request) {
        System.out.println(request);

        ResultDTOBuilder result = new ResultDTOBuilder();
        result.builder().withMessage("success").withContent(request);
        return result.build();
    }
}
