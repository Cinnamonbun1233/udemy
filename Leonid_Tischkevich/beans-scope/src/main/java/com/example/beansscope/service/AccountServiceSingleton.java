package com.example.beansscope.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class AccountServiceSingleton {
    private String name = "Lori";

    public String getName() {
        return name;
    }

    public void changeName(String name) {
        this.name = name + " + " + name;
    }
}