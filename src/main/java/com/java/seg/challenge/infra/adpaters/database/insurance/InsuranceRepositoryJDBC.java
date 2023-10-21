package com.java.seg.challenge.infra.adpaters.database.insurance;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.seg.challenge.core.model.Insurance;
import com.java.seg.challenge.core.repository.InsuranceRepository;
import com.java.seg.challenge.infra.adpaters.database.insurance.mapper.InsuranceMapper;

public class InsuranceRepositoryJDBC implements InsuranceRepository {
    private JpaRepository repository;
    private InsuranceMapper mapper;

    @Override
    public Insurance getByInsuranceCode(Integer id) {
        Optional<InsuranceEntity> response = repository.findById(id);
        return mapper.toModel(response.get());
    }

    @Override
    public Insurance insertInsurance(Insurance insurance) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertInsurance'");
    }

    @Override
    public Insurance updateInsurance(Insurance insurance) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateInsurance'");
    }

}
