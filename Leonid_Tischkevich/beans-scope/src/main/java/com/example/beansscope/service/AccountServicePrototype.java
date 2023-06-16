package com.example.beansscope.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class AccountServicePrototype {
    private String name = "Lori";

    public String getName() {
        return name;
    }

    public void changeName(String name) {
        this.name = name + " + " + name;
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