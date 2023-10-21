package com.java.seg.challenge.infra.adpaters.database.insurance;

import java.time.LocalDateTime;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_seguro")
    private Integer id;
    @Column(name = "nome_seguro", length = 50, nullable = false)
    private String name;
    @Column(name = "decricao_seguro", length = 150, nullable = false)
    private String description;
    @Column(name = "data_criacao_seguro", nullable = false)
    private LocalDateTime createDate;
    @Column(name = "data_alteracao_seguro", nullable = false)
    private LocalDateTime alterDate;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getAlterDate() {
        return this.alterDate;
    }

    public void setAlterDate(LocalDateTime alterDate) {
        this.alterDate = alterDate;
    }
}
