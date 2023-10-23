package com.java.seg.challenge.infra.adpaters.database.insurance;

import com.java.seg.challenge.core.model.Insurance;
import com.java.seg.challenge.core.repository.InsuranceRepository;
import com.java.seg.challenge.infra.adpaters.database.insurance.mapper.InsuranceMapper;

public class InsuranceRepositoryJDBC implements InsuranceRepository {
    private InsuranceRepositoryJPA repository;
    private InsuranceMapper mapper;

    @Override
    public Insurance getByCode(String code) {
        return mapper.toModel(repository.findById(code).get());
    }

    @Override
    public Insurance createInsurance(Insurance insurance) {
        return mapper.toModel(repository.save(mapper.toEntity(insurance)));
    }

    @Override
    public Insurance updateInsurance(Insurance insurance) {
        return mapper.toModel(repository.save(mapper.toEntity(insurance)));

    }

}
