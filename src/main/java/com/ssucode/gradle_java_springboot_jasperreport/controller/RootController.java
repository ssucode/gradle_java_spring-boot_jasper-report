package com.ssucode.gradle_java_springboot_jasperreport.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
    
    @GetMapping(value = "/")
    public String root() {
        return "Jasper Report!";
    }
}
