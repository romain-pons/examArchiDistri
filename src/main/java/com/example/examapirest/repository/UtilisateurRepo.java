package com.example.examapirest.repository;

import com.example.examapirest.dto.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepo extends JpaRepository<Utilisateur, Long> {

}
