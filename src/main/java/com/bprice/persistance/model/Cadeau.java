package com.bprice.persistance.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import java.util.Date;

@Document(collection = "cadeau")
public class Cadeau {

    @Id
    @GeneratedValue(generator = "String2")
    private String id;
    private String type ;
    private Date datedebut;
    private Date datefin;
    private String idpartneraire;
    private Double valeur;
    private Short fActif;

    public Cadeau() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDatedebut() {
        return datedebut;
    }

    public void setDatedebut(Date datedebut) {
        this.datedebut = datedebut;
    }

    public Date getDatefin() {
        return datefin;
    }

    public void setDatefin(Date datefin) {
        this.datefin = datefin;
    }

    public String getIdpartneraire() {
        return idpartneraire;
    }

    public void setIdpartneraire(String idpartneraire) {
        this.idpartneraire = idpartneraire;
    }

    public Double getValeur() {
        return valeur;
    }

    public void setValeur(Double valeur) {
        this.valeur = valeur;
    }

    public Short getfActif() {
        return fActif;
    }

    public void setfActif(Short fActif) {
        this.fActif = fActif;
    }
}
