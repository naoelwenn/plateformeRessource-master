package com.example.ressourceRelationnelle.Service;

import com.example.ressourceRelationnelle.DataAccess.UtilisateurRepository;
import com.example.ressourceRelationnelle.Modele.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    public List<Utilisateur> getAllUtilisateur(){
        return utilisateurRepository.findAll();
    }
}
