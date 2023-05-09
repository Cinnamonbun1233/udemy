package java_start.part_001.lesson_007.bankSystem.service;

import java_start.part_001.lesson_007.bankSystem.entity.Account;

public class TransferService {
    public void transfer(Account accountFrom, Account accountTo, int amount) {
        int billFromAmount = accountFrom.getBill().getAmount();
        int billToAmount = accountTo.getBill().getAmount();
        if (billFromAmount < amount) {
            System.out.println("Перевод невозможен, не хватает средств");
        } else {
            System.out.println("Происходит перевод средств с аккаунта - " + accountFrom.getPerson().getName() +
                    " на аккаунт - " + accountTo.getPerson().getName());
            accountFrom.getBill().setAmount(billFromAmount - amount);
            accountTo.getBill().setAmount(billToAmount + amount);
            System.out.println("Перевод успешно завершен");
        }
    }
}