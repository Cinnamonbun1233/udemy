package com.javastart.springmvc.controller;

import com.javastart.springmvc.entity.dto.AccountRequestDto;
import com.javastart.springmvc.entity.dto.AccountResponseDto;
import com.javastart.springmvc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {
    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello";
    }

    @RequestMapping(value = "/accounts", method = RequestMethod.POST)
    public Long createNewAccount(@RequestBody AccountRequestDto accountRequestDto) {
        return accountService.createNewAccount(accountRequestDto.getName(), accountRequestDto.getEmail());
    }

    @RequestMapping(value = "/accounts/{accountsId}", method = RequestMethod.GET)
    public AccountResponseDto findAccountById(@PathVariable Long accountId) {
        return new AccountResponseDto(accountService.findAccountById(accountId));
    }
}
