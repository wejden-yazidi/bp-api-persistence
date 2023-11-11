package com.bprice.persistance.model;

import javax.persistence.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by ahmed on 25/01/2020.
 */
@Document(collection = "categorie")
public class Categorie {

    @Id
    @GeneratedValue(generator = "String2")
    private String idCateg;
    private String code;
    private String designation;
    private Short fActif;
    private Short fService;
    private String ajoutePar;
    private String couleur;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;

    public Categorie() {
    }

    public Categorie(String code, String designation, Short fActif, Short fService, String ajoutePar, String couleur, Timestamp dateCreation) {
        this.code = code;
        this.designation = designation;
        this.fActif = fActif;
        this.fService = fService;
        this.ajoutePar = ajoutePar;
        this.couleur = couleur;
        this.dateCreation = dateCreation;
    }

    public String getIdCateg() {
        return idCateg;
    }

    public void setIdCateg(String idCateg) {
        this.idCateg = idCateg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Short getfActif() {
        return fActif;
    }

    public void setfActif(Short fActif) {
        this.fActif = fActif;
    }

    public Short getfService() {
        return fService;
    }

    public void setfService(Short fService) {
        this.fService = fService;
    }

    public String getAjoutePar() {
        return ajoutePar;
    }

    public void setAjoutePar(String ajoutePar) {
        this.ajoutePar = ajoutePar;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
