package com.java.seg.challenge.infra.adpaters.database.tax;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "imposto")
public class TaxEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_imposto")
    private Integer id;
    @Column(name = "nome_imposto", length = 50, nullable = false)
    private String name;
    @Column(name = "decricao_imposto", length = 150, nullable = false)
    private String description;

    @Column(name = "data_criacao_imposto", nullable = false)
    private LocalDateTime createDate;
    @Column(name = "data_alteracao_imposto", nullable = false)
    private LocalDateTime alterDate;
}
