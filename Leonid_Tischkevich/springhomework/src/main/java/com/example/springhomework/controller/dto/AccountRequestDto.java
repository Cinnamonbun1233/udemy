package com.example.springhomework.controller.dto;

import java.util.List;

public class AccountRequestDto {
    private String name;
    private String email;
    private List<BillRequestDto> bills;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<BillRequestDto> getBills() {
        return bills;
    }
}