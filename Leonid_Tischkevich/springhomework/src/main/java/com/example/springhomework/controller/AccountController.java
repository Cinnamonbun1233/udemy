package com.example.springhomework.controller;

import com.example.springhomework.controller.dto.AccountRequestDto;
import com.example.springhomework.controller.dto.AccountResponseDto;
import com.example.springhomework.entity.Bill;
import com.example.springhomework.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
public class AccountController {
    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/accounts/{accountId}")
    public AccountResponseDto getAccountById(@PathVariable Long accountId) {
        return new AccountResponseDto(accountService.getAccountById(accountId));
    }

    @PostMapping("/accounts")
    public Long createNewAccount(@RequestBody AccountRequestDto accountRequestDto) {
        return accountService.createNewAccount(accountRequestDto.getName(), accountRequestDto.getEmail(),
                accountRequestDto.getBills().stream()
                        .map(billRequestDto -> new Bill(billRequestDto.getAmount(), billRequestDto.getDefault()))
                        .collect(Collectors.toList()));
    }
}