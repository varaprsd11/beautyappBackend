package com.app.info.lumierabeauty.repository;

import com.app.info.lumierabeauty.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LumRegistrationRepository extends JpaRepository<Registration, Long> {
    Optional<Registration> findByEmail(String email);
}
