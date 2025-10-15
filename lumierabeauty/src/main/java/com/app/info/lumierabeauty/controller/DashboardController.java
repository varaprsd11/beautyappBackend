package com.app.info.lumierabeauty.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("api/v1/")
public class DashboardController {

    @GetMapping
    public String healthCheck(){
        return "Success";
    }
}
