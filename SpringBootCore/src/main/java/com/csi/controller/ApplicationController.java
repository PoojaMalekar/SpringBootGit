package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {
    @GetMapping
    public String satHello(){
        return "Welcome to CSI PUNE";
    }
    @GetMapping("/services")
    public String services(){
        return "SOFTWARE DEVLOPMENT";
    }
    @GetMapping("/address")
    public String address(){
        return "Marunji";
    }
    @GetMapping("/name")
    public String name(){
        return "pooja";
    }
}
