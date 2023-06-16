package com.example.springbeans.service;

public class HelloXmlService {
    private UtilsService utilsService;

    public String hello() {
        return utilsService.append("Hello from XML");
    }

    public void setUtilsService(UtilsService utilsService) {
        this.utilsService = utilsService;
    }
}