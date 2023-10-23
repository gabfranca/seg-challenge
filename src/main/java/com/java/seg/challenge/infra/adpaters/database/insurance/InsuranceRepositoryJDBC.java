package com.java.seg.challenge.infra.adpaters.database.insurance;

import org.springframework.stereotype.Service;

import com.java.seg.challenge.core.model.Insurance;
import com.java.seg.challenge.core.repository.InsuranceRepository;
import com.java.seg.challenge.infra.adpaters.database.insurance.mapper.InsuranceMapper;

@Service
public class InsuranceRepositoryJDBC implements InsuranceRepository {
    private InsuranceRepositoryJPA repository;
    private InsuranceMapper mapper;

    public InsuranceRepositoryJDBC(InsuranceRepositoryJPA repository, InsuranceMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

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
