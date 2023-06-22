package com.example.hellospring.service;

import com.example.hellospring.entity.Account;
import com.example.hellospring.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService2 {
    private final AccountRepository accountRepository;

    @Autowired
    public AccountService2(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void saveAccount2() {
        Account account3 = new Account("Account3", "email@abc.ru", 10000);
        accountRepository.save(account3);
    }
}