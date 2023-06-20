package com.example.springhomework.service;

import com.example.springhomework.entity.Account;
import com.example.springhomework.entity.Bill;
import com.example.springhomework.exceptions.NotDefaultBillException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

import static com.example.springhomework.utils.AccountUtils.findDefaultBill;

@Service
public class TransferService {
    private final AccountService accountService;

    @Autowired
    public TransferService(AccountService accountService) {
        this.accountService = accountService;
    }

    public Object transfer(Long accountIdFrom, Long accountIdTo, BigDecimal amount) {
        Account accountFrom = accountService.getAccountById(accountIdFrom);
        Account accountTo = accountService.getAccountById(accountIdTo);
        Bill billFrom = findDefaultBill(accountFrom);
        Bill billTo = findDefaultBill(accountTo);
        billFrom.setAmount(billFrom.getAmount().subtract(amount));
        billTo.setAmount(billTo.getAmount().add(amount));
        accountService.updateAccount(accountFrom);
        accountService.updateAccount(accountTo);
        return "Done";
    }
}