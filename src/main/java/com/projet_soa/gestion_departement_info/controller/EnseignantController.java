package com.projet_soa.gestion_departement_info.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projet_soa.gestion_departement_info.services.EnseignantService;
import com.projet_soa.gestion_departement_info.entities.Enseignant;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/enseignants")
public class EnseignantController {

    @Autowired
    private EnseignantService enseignantService;

    @GetMapping
    public List<Enseignant> getAllEnseignants() {
        return enseignantService.getAllEnseignants();
    }

    @GetMapping("/{id}")
    public Enseignant getEnseignantById(@PathVariable Long id) {
        return enseignantService.getEnseignantById(id);
    }

   @PostMapping
    public Enseignant saveEnseignant(@RequestBody Enseignant enseignant) {
        return enseignantService.saveEnseignant(enseignant);
    }

   @PutMapping("/{id}")
    public Enseignant updateEnseignant(@PathVariable Long id, @RequestBody Enseignant enseignant) {
        return enseignantService.updateEnseignant(id, enseignant);
    }

   @DeleteMapping("/{id}")
    public void deleteEnseignantById(@PathVariable Long id) {
        enseignantService.deleteEnseignantById(id);
    }
}