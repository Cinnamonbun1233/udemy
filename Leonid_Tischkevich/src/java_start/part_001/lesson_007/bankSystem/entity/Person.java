package java_start.part_001.lesson_007.bankSystem.entity;

public class Person {
    private String name;
    private String phoneNumber;
    private String surName;

    public Person(String name, String phoneNumber, String surName) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}