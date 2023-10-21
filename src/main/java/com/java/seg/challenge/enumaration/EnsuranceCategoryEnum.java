package com.java.seg.challenge.enumaration;

public enum EnsuranceCategoryEnum {
    VIDA("VIDA",  1),
    AUTO("AUTO", 2),
    VIAGEM("VIAGEM", 3),
    RESIDENCIAL("RESIDENCIAL", 4),
    PATRIMONIAL("PATRIMONIAL", 5);
    
    private String description;
    private Integer id;

    EnsuranceCategoryEnum(String description, Integer id) {
        this.description = description;
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

        public Integer getId() {
        return id;
    }
}
