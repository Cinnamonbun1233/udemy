package com.example.springhomework.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class BillRequestDto {
    @JsonProperty("amount")
    private BigDecimal amount;
    @JsonProperty("isDefault")
    private Boolean isDefault;

    public BigDecimal getAmount() {
        return amount;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }
}