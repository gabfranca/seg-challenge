package com.java.seg.challenge.core.repository;

import com.java.seg.challenge.core.model.Insurance;

public interface InsuranceRepository {
       public Insurance getByInsuranceCode(Integer id);
       public Insurance insertInsurance(Insurance insurance);
       public Insurance updateInsurance(Insurance insurance);
}
