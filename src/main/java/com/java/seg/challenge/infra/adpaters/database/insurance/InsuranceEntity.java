package com.java.seg.challenge.infra.adpaters.database.insurance;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "seguro")
public class InsuranceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "codigo_seguro")
    private String id;
    @Column(name = "nome_seguro", nullable = false)
    private String name;
    @Column(name = "valor_base", nullable = false)
    private Double basePrice;
    @Column(name = "valor_tarifado", nullable = false)
    private Double taxedPrice;
    @Column(name = "codigo_categoria", nullable = false)
    private Double categoryId;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBasePrice() {
        return this.basePrice;
    }

    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    public Double getTaxedPrice() {
        return this.taxedPrice;
    }

    public void setTaxedPrice(Double taxedPrice) {
        this.taxedPrice = taxedPrice;
    }

    public Double getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Double categoryId) {
        this.categoryId = categoryId;
    }
}
