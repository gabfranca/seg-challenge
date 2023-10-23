package com.java.seg.challenge.infra.adpaters.rest.in.product.insurance;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public ResponseEntity<ResultDTO> inputInsurance(@RequestBody Insurance request) {
        ResultDTOBuilder result = new ResultDTOBuilder();
        try {
            result.builder().withMessage("created with success.").withContent(handler.insert(request));
        } catch (Exception e) {
            result.builder().withMessage("failed to process: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result.build());
        }
        return ResponseEntity.status(HttpStatus.OK).body(result.build());

    }

    @PatchMapping("/insurance")
    public ResponseEntity<ResultDTO> updateInsurance(@RequestBody Insurance request) {
        ResultDTOBuilder result = new ResultDTOBuilder();
        try {
            result.builder().withMessage("updated with success").withContent(handler.update(request));
        } catch (Exception e) {
            result.builder().withMessage("failed to process: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result.build());
        }
        return ResponseEntity.status(HttpStatus.OK).body(result.build());
    }
}
