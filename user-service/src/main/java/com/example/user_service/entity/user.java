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
    private boolean isLocked = false;
    private Integer nombreMaxEmprunt;

    public Long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public Enum getMemberShipType()
    {
        return membershipType;
    }

    public boolean getLock()
    {
        return isLocked;
    }

    public Integer getNombreMaxEmprunt()
    {
        return nombreMaxEmprunt;
    }

    public void SetEmail(String Email)
    {
        email = Email;
    }

    public void SetId(Long Id)
    {
        id = Id;
    }

    public void SetName(String Name)
    {
        name = Name;
    }

    public void SetNombreMaxEmprunt(Integer a)
    {
        nombreMaxEmprunt = a;
    }

    public void setLocker(boolean lock)
    {
        isLocked = lock;
    }

}
