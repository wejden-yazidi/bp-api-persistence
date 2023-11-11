package com.bprice.persistance.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;

@Document(collection = "famille")
public class Famille {

    @Id
    @GeneratedValue(generator = "String2")
    private String idFamille;
    private String designation;
    private String idPartenaire;

    public String getIdFamille() {
        return idFamille;
    }

    public void setIdFamille(String idFamille) {
        this.idFamille = idFamille;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getIdPartenaire() {
        return idPartenaire;
    }

    public void setIdPartenaire(String idPartenaire) {
        this.idPartenaire = idPartenaire;
    }
}
