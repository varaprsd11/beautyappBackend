package com.app.info.lumierabeauty.model;

import jakarta.persistence.*;
import lombok.*;


@Data
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Entity
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullname;
    private String email;
    private String phonenumber;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    // Enum defined inside the class
    public enum Role {
        USER,
        ADMIN,
        MODERATOR
    }
}
