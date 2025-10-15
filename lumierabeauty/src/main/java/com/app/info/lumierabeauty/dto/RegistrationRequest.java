package com.app.info.lumierabeauty.dto;

import com.app.info.lumierabeauty.model.Registration;
import lombok.*;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class RegistrationRequest {
    private String fullname;
    private String email;
    private String phonenumber;
    private String password;
    private Registration.Role role;
}
