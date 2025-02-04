package com.example.user_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

// J'ai implementer la factory comme design pattern pour les deux type de user existant(Regular ou Premium)
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private Enum membershipType; // Regular, Premium
    private boolean isLocked;
    private Integer nombreMaxEmprunt;



}
