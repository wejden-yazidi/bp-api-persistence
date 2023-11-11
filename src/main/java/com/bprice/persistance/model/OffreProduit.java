package com.bprice.persistance.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import java.sql.Time;

/**
 * Created by ahmed on 25/01/2020.
 */
@Document(collection = "offreProduit")
public class OffreProduit {
    @Id
    @GeneratedValue(generator = "String2")
    private String idOffreProduit;
    private String idProduit;
    private String idOffre;
    private Integer prix;
    private Time heureDebut;
    private Time heureFin;

    public OffreProduit() {
    }

    public String getIdOffreProduit() {
        return idOffreProduit;
    }

    public void setIdOffreProduit(String idOffreProduit) {
        this.idOffreProduit = idOffreProduit;
    }

    public String getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(String idProduit) {
        this.idProduit = idProduit;
    }

    public String getIdOffre() {
        return idOffre;
    }

    public void setIdOffre(String idOffre) {
        this.idOffre = idOffre;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    public Time getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(Time heureDebut) {
        this.heureDebut = heureDebut;
    }

    public Time getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(Time heureFin) {
        this.heureFin = heureFin;
    }
}
