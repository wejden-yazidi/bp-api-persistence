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
@Document(collection = "offre")
public class Offre {
    @Id
    @GeneratedValue(generator = "String2")
    private String idOffre;
    private String designation;
    private Short fOuvert;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDebut;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFin;

    public Offre() {
    }

    public String getIdOffre() {
        return idOffre;
    }

    public void setIdOffre(String idOffre) {
        this.idOffre = idOffre;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Short getfOuvert() {
        return fOuvert;
    }

    public void setfOuvert(Short fOuvert) {
        this.fOuvert = fOuvert;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }
}
