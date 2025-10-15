package com.app.info.lumierabeauty.service;

import com.app.info.lumierabeauty.dto.RegistrationRequest;
import com.app.info.lumierabeauty.model.Registration;
import org.springframework.stereotype.Service;

@Service
public interface LumieRegistrationService {
    Registration lumieRegisterUser(Registration request);
}
