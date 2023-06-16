package com.example.springbeans.controller;

import com.example.springbeans.service.HelloXmlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XmlController {
    private final HelloXmlService helloXmlService;

    @Autowired
    public XmlController(HelloXmlService helloXmlService) {
        this.helloXmlService = helloXmlService;
    }

    @GetMapping("/xml")
    public String helloXml() {
        return helloXmlService.hello();
    }
}