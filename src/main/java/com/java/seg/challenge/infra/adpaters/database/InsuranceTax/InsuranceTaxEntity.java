package com.java.seg.challenge.infra.adpaters.database.InsuranceTax;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "seguro_imposto")
public class InsuranceTaxEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_seguro_imposto")
    private Integer id;
    @Column(name = "codigo_seguro", nullable = false)
    private String name;
    @Column(name = "codigo_imposto", nullable = false)
    private String description;
    @Column(name = "valor_taxa_imposto", nullable = false)
    private Double taxValue;
}
