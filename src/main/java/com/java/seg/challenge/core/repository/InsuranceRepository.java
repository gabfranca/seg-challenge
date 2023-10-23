package com.java.seg.challenge.core.repository;

import com.java.seg.challenge.core.model.Insurance;

public interface InsuranceRepository {

    public Insurance getByCode(String code);

    public Insurance createInsurance(Insurance insurance);

    public Insurance updateInsurance(Insurance insurance);
}
