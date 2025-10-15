package com.app.info.lumierabeauty.service.impl;

import com.app.info.lumierabeauty.dto.RegistrationRequest;
import com.app.info.lumierabeauty.model.Registration;
import com.app.info.lumierabeauty.repository.LumRegistrationRepository;
import com.app.info.lumierabeauty.service.LumieRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LumieRegistrationServiceImpl implements LumieRegistrationService {


    @Autowired
    private LumRegistrationRepository repo;


    @Override
    public Registration lumieRegisterUser(Registration request) {
        Registration saved = null;
        try {
            if (repo.findByEmail(request.getEmail()).isPresent()) {
                throw new Exception("user registed alredy "); // Email already exists
            }
             saved = repo.save(request);
        }catch (Exception e){
            e.printStackTrace();
        }
        return saved;
    }
}
