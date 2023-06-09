package lesson_007.service;

import lesson_007.entity.Account;
import lesson_007.entity.Bill;

public class PaymentService {
    public void pay(Account account, int amount) {
        Bill bill = account.getBill();
        if (bill.getAmount() < amount) {
            System.out.println("Платеж невозможен, недостаточно средств");
        } else {
            int currentBillAmount = bill.getAmount();
            System.out.println("Происходит операция платежа, текущее значение счета: " + currentBillAmount);
            bill.setAmount(currentBillAmount - amount);
            System.out.println("Платеж завершен, новое значение счета: " + bill.getAmount());
        }
    }
}