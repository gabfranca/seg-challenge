package com.java.seg.challenge.infra.adpaters.rest.in.product.insurance;

import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.seg.challenge.core.model.Insurance;
import com.java.seg.challenge.core.service.insurance.InsuranceHandler;
import com.java.seg.challenge.infra.adpaters.rest.out.dto.result.ResultDTO;
import com.java.seg.challenge.infra.adpaters.rest.out.dto.result.ResultDTOBuilder;

@RestController
@RequestMapping("/v1/products")
public class ProductInsuranceController {
    private final InsuranceHandler handler;

    ProductInsuranceController(InsuranceHandler handler) {
        this.handler = handler;
    }

    @PostMapping("/insurance")
    public @ResponseBody ResultDTO inputInsurance(@RequestBody Insurance request) {

        ResultDTOBuilder result = new ResultDTOBuilder();

        result.builder().withMessage("success").withContent(handler.insert(request));
        return result.build();
    }

    @PatchMapping("/insurance")
    public @ResponseBody ResultDTO updateInsurance(@RequestBody Insurance request) {
        System.out.println(request);

        ResultDTOBuilder result = new ResultDTOBuilder();
        result.builder().withMessage("success").withContent(request);
        return result.build();
    }
}
