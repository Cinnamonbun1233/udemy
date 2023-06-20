package com.javastart.springmvc.service;

import com.javastart.springmvc.entity.Account;
import com.javastart.springmvc.repository.AccountRepository;

public class AccountService {
    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Long createNewAccount(String name, String email) {
        return accountRepository.save(new Account(name, email)).getAccountId();
    }

    public Account findAccountById(Long accountId) {
        return accountRepository.findOne(accountId);
    }
}