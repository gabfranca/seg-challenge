package com.java.seg.challenge.infra.adpaters.database.categorytax;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categoria_imposto")
public class CategoryTaxEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_categoria_imposto")
    private Integer id;
    @Column(name = "codigo_categoria", nullable = false)
    private String name;
    @Column(name = "codigo_imposto", nullable = false)
    private String description;
    @Column(name = "valor_taxa_imposto", nullable = false)
    private Double taxValue;
}
