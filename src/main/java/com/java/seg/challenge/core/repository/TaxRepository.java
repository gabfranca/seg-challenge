package com.java.seg.challenge.core.repository;

import com.java.seg.challenge.core.model.Tax;

public interface TaxRepository {
    public Tax getByInsuranceCode(Integer id);

    public Tax insertInsurance(Tax insurance);

    public Tax updateInsurance(Tax insurance);
}
