package com.example.hellospring.controller;

import com.example.hellospring.dto.AccountRequestDto;
import com.example.hellospring.dto.AccountResponseDto;
import com.example.hellospring.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class AccountController {
    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/hello")
    public String helloSpring() {
        return "Hello Spring!";
    }

    @PostMapping("/accounts")
    public Long createAccount(@RequestBody AccountRequestDto accountRequestDto) {
        return accountService.createAccount(accountRequestDto.getName(), accountRequestDto.getEmail(), accountRequestDto.getBill());
    }

    @GetMapping("/accounts/{id}")
    public AccountResponseDto getAccount(@PathVariable Long id) {
        return new AccountResponseDto(accountService.getAccountById(id));
    }

    @GetMapping("/accounts")
    public List<AccountResponseDto> getAllAccounts() {
        return accountService.getAll().stream()
                .map(AccountResponseDto::new)
                .collect(Collectors.toList());
    }

    @DeleteMapping("/accounts/{id}")
    public AccountResponseDto deleteAccountById(@PathVariable Long id) {
        return new AccountResponseDto(accountService.deleteById(id));
    }

    @GetMapping("/string")
    public String getString(@RequestParam(name = "ABC", required = false, defaultValue = "DEF") String line) {
        return "Hi-hi";
    }
}