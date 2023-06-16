package com.example.beansscope.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service("BaseService2")
public class BaseService2 implements CommandLineRunner {
    @Autowired
    private AccountServicePrototype accountServicePrototype;

    @Autowired
    private AccountServiceSingleton accountServiceSingleton;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("----------Prototype----------");
        System.out.println(accountServicePrototype.getName());

        System.out.println("----------Singleton----------");
        System.out.println(accountServiceSingleton.getName());
    }

    @PostConstruct
    public void init() {
        System.out.println("************ " + getClass().getName() + " **** init method ****");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("************ " + getClass().getName() + " **** destroy method ****");
    }
}