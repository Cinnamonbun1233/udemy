package com.example.springbeans.service;

public class JavaConfigService {
    private final String timeOfInitialization;
    private Integer dayOfMonth;

    public JavaConfigService(String timeOfInitialization) {
        this.timeOfInitialization = timeOfInitialization;
    }

    public void setDayOfMonth(Integer dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public String hello() {
        return "Hello from java config!" + "\ntime: " + timeOfInitialization + "\ndayOfMonth: " + dayOfMonth;
    }
}