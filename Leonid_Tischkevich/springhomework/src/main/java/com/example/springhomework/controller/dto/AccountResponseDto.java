package com.example.springhomework.controller.dto;

import com.example.springhomework.entity.Account;

import java.util.List;
import java.util.stream.Collectors;

public class AccountResponseDto {
    private Long accountId;
    private String name;
    private String email;
    private List<BillResponseDto> bills;

    public AccountResponseDto(Long accountId, String name, String email, List<BillResponseDto> bills) {
        this.accountId = accountId;
        this.name = name;
        this.email = email;
        this.bills = bills;
    }

    public AccountResponseDto(Account account) {
        accountId = account.getAccountId();
        name = account.getName();
        email = account.getEmail();
        bills = account.getBills().stream()
                .map(BillResponseDto::new)
                .collect(Collectors.toList());
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<BillResponseDto> getBills() {
        return bills;
    }

    public void setBills(List<BillResponseDto> bills) {
        this.bills = bills;
    }
}