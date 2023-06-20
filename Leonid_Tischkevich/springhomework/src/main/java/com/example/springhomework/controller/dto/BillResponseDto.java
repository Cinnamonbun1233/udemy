package com.example.springhomework.controller.dto;

import com.example.springhomework.entity.Bill;

import java.math.BigDecimal;

public class BillResponseDto {
    private Long billId;
    private BigDecimal amount;
    private Boolean isDefault;

    public BillResponseDto(Long billId, BigDecimal amount, Boolean isDefault) {
        this.billId = billId;
        this.amount = amount;
        this.isDefault = isDefault;
    }

    public BillResponseDto(Bill bill) {
        billId = bill.getBillId();
        amount = bill.getAmount();
        isDefault = bill.getDefault();
    }

    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }
}