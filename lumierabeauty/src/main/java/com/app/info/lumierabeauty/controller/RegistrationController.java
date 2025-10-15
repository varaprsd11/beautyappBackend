package com.app.info.lumierabeauty.controller;

import com.app.info.lumierabeauty.dto.RegistrationRequest;
import com.app.info.lumierabeauty.model.Registration;
import com.app.info.lumierabeauty.service.LumieRegistrationService;
import com.app.info.lumierabeauty.util.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class RegistrationController {
    @Autowired
    private LumieRegistrationService lumieRegistrationService;
    @Autowired
    private Utility utility;


    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegistrationRequest request) {

        Registration saved = lumieRegistrationService.lumieRegisterUser(utility.saveLumUser(request));
        return new ResponseEntity<>("User registered with ID: " + saved,  HttpStatus.CREATED);
    }
}
