package com.example.springhomework.utils;

import com.example.springhomework.entity.Account;
import com.example.springhomework.entity.Bill;
import com.example.springhomework.exceptions.NotDefaultBillException;

public class AccountUtils {
    public static Bill findDefaultBill(Account accountFrom) {
        return accountFrom.getBills().stream()
                .filter(Bill::getDefault)
                .findAny()
                .orElseThrow(() -> new NotDefaultBillException("Невозможно найти счёт по умолчанию для аккаунта c id: '"
                        + accountFrom.getAccountId() + "'"));
    }
}