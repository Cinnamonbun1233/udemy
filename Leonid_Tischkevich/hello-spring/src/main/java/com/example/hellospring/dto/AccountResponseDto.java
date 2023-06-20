package com.example.hellospring.dto;

import com.example.hellospring.entity.Account;

public class AccountResponseDto {
    private Long accountId;
    private String name;
    private String email;
    private Integer bill;

    public AccountResponseDto(Long accountId, String name, String email, Integer bill) {
        this.accountId = accountId;
        this.name = name;
        this.email = email;
        this.bill = bill;
    }

    public AccountResponseDto(Account account) {
        accountId = account.getId();
        name = account.getName();
        email = account.getEmail();
        bill = account.getBill();
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

    public Integer getBill() {
        return bill;
    }

    public void setBill(Integer bill) {
        this.bill = bill;
    }
}