package com.bprice.persistance.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by ahmed on 25/01/2020.
 */
@Document(collection = "profil")
public class Profil {
    @Id
    @GeneratedValue(generator = "String2")
    private String idProfil;
    private String designation;
    private Short fActif;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;

    public Profil() {
    }

    public String getIdProfil() {
        return idProfil;
    }

    public void setIdProfil(String idProfil) {
        this.idProfil = idProfil;
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

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
