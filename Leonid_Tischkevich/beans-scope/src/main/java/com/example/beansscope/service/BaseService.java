package com.example.beansscope.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class BaseService implements CommandLineRunner {
    @Autowired
    private AccountServicePrototype accountServicePrototype;

    @Autowired
    private AccountServiceSingleton accountServiceSingleton;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("----------Prototype----------");
        accountServicePrototype.changeName("Baxter");
        System.out.println(accountServicePrototype.getName());

        System.out.println("----------Singleton----------");
        accountServiceSingleton.changeName("Baxter");
        System.out.println(accountServiceSingleton.getName());
    }
}