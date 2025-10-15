package com.app.info.lumierabeauty.util;

import com.app.info.lumierabeauty.dto.RegistrationRequest;
import com.app.info.lumierabeauty.model.Registration;

public class Utility {
    public Registration saveLumUser(RegistrationRequest request){
        Registration lumUser = new Registration();
        lumUser.setFullname(request.getFullname());
        lumUser.setRole(request.getRole());
        lumUser.setEmail(request.getEmail());
        lumUser.setPassword(request.getPassword());
        lumUser.setPhonenumber(request.getPhonenumber());

        return lumUser;
    }
}
