package com.example.hellospring.service;

import com.example.hellospring.entity.Account;
import com.example.hellospring.exception.AccountNotFoundException;
import com.example.hellospring.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Long createAccount(String name, String email, Integer bill) {
        Account account = new Account(name, email, bill);
        return accountRepository.save(account).getId();
    }

    public Account getAccountById(Long accountId) {
        return accountRepository.findById(accountId).orElseThrow(()
                -> new AccountNotFoundException("Невозможно найти аккаунт с id: '" + accountId + "'"));
    }

    public List<Account> getAll() {
        return accountRepository.findAll();
    }

    public Account deleteById(Long id) {
        Account account = getAccountById(id);
        accountRepository.deleteById(id);
        return account;
    }
}