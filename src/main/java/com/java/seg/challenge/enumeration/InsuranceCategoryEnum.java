package com.java.seg.challenge.enumeration;

import java.util.Arrays;

public enum InsuranceCategoryEnum {
    VIDA("VIDA", 1),
    AUTO("AUTO", 2),
    VIAGEM("VIAGEM", 3),
    RESIDENCIAL("RESIDENCIAL", 4),
    PATRIMONIAL("PATRIMONIAL", 5);

    private String name;
    private Integer id;

    InsuranceCategoryEnum(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public InsuranceCategoryEnum findByName(String name) {
        return Arrays.stream(values())
                .filter(x -> x.getName().equals(name))
                .findFirst().orElse(null);
    }
}
