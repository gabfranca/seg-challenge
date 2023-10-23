package com.java.seg.challenge.core.service.insurance;

import com.java.seg.challenge.core.model.Insurance;

public interface InsuranceHandler {
    public Insurance insert(Insurance insurance);

    public Insurance update(Insurance insurance);

    public Insurance getByCode(String code);
}
