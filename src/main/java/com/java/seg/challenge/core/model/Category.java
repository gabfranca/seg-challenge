package com.java.seg.challenge.core.model;

import java.time.LocalDateTime;

public class Category {
    public Integer CategoryCode;
    public String CategoryName;
    public String CategoryDescription;
    public LocalDateTime createDate;
    public LocalDateTime alterDate;

    public Integer getCategoryCode() {
        return this.CategoryCode;
    }

    public void setCategoryCode(Integer CategoryCode) {
        this.CategoryCode = CategoryCode;
    }

    public String getCategoryName() {
        return this.CategoryName;
    }

    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    public String getCategoryDescription() {
        return this.CategoryDescription;
    }

    public void setCategoryDescription(String CategoryDescription) {
        this.CategoryDescription = CategoryDescription;
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
