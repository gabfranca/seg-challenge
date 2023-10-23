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
    private Integer categoryCode;
    @Column(name = "codigo_imposto", nullable = false)
    private Integer taxCode;
    @Column(name = "valor_taxa_imposto", nullable = false)
    private Double taxValue;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryCode() {
        return this.categoryCode;
    }

    public void setCategoryCode(Integer categoryCode) {
        this.categoryCode = categoryCode;
    }

    public Integer getTaxCode() {
        return this.taxCode;
    }

    public void setTaxCode(Integer taxCode) {
        this.taxCode = taxCode;
    }

    public Double getTaxValue() {
        return this.taxValue;
    }

    public void setTaxValue(Double value){
         this.taxValue =  value;
    }
}
