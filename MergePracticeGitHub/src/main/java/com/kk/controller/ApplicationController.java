package com.kk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {

    @GetMapping
    public String sayHello(){
        return "Kartik Kadam here...";
    }

    @GetMapping("/address")
    public  String sayAddress(){
        return "NANDED | MAHARASHTRA | INDIA | ASIA .";
    }

    @GetMapping("/surname")
    public  String saySurName(){
        return "KADAM";
    }
}
