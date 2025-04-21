package com.example.ressourceRelationnelle.Modele;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    public Utilisateur(){}

    public Utilisateur(Long id, String email){
        this.id = id;
        this.email = email;
    }

    public Long getId(){return this.id;}
    public String getEmail(){return this.email;}

    public void setEmail(String email){this.email = email; }
}
