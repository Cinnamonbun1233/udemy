package java_start.module_001.lesson_007.bankSystem;

import java_start.module_001.lesson_007.bankSystem.entity.Account;
import java_start.module_001.lesson_007.bankSystem.entity.Bill;
import java_start.module_001.lesson_007.bankSystem.entity.Person;
import java_start.module_001.lesson_007.bankSystem.service.DepositService;
import java_start.module_001.lesson_007.bankSystem.service.PaymentService;
import java_start.module_001.lesson_007.bankSystem.service.TransferService;

public class Main {
    public static void main(String[] args) {
        Person loriPerson = new Person("Lori", "+123456789", "Cat");
        Bill loriBill = new Bill(10000);
        Account loriAccount = new Account(loriPerson, loriBill);

        Person martinPerson = new Person("Martin", "+987654321", "Dog");
        Bill martinBill = new Bill(8000);
        Account martinAccount = new Account(martinPerson, martinBill);

        PaymentService paymentService = new PaymentService();
        paymentService.pay(loriAccount, 1000);
        paymentService.pay(martinAccount, 1500);

        DepositService depositService = new DepositService();
        depositService.deposit(loriAccount, 3000);
        depositService.deposit(martinAccount, 3500);

        TransferService transferService = new TransferService();
        transferService.transfer(loriAccount, martinAccount, 3000);
    }
}