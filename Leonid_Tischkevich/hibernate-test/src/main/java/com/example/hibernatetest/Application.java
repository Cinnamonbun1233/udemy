package com.example.hibernatetest;

import com.example.hibernatetest.dao.AccountDao;
import com.example.hibernatetest.entity.Account;
import com.example.hibernatetest.entity.Bill;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, JpaRepositoriesAutoConfiguration.class})
public class Application implements CommandLineRunner {
    public Application(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    private final AccountDao accountDao;

    @Override
    public void run(String... args) {
        Account account = new Account("Lori", 15);
        List<Bill> bills = new ArrayList<>();
        bills.add(new Bill(10));
        bills.add(new Bill(11));
        bills.add(new Bill(12));
        bills.add(new Bill(13));
        bills.add(new Bill(14));
        account.setBills(bills);

        Account savedAccount = accountDao.save(account);
        Account accountFromDB = accountDao.findById(savedAccount.getAccountId());

        System.out.println(accountFromDB);
        System.out.println(accountFromDB.getBills());
    }
}