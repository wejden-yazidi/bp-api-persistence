package com.bprice.persistance.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.Id;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by ahmed on 25/01/2020.
 */
@Document(collection = "caisse")
public class Caisse {
    @Id
    @GeneratedValue(generator = "String2")
    private String idCaisse;
    private String idrelatedCaisse;
    private String idTypeCaisse;
    private String idPointVente;
    private int numCaisse;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    private String reference;
    private Short fActif;
    private Short isCuis;

    public Caisse() {
    }

    public Caisse(String idTypeCaisse, String idPointVente, int numCaisse, Timestamp dateCreation, String reference, Short fActif) {
        this.idTypeCaisse = idTypeCaisse;
        this.idPointVente = idPointVente;
        this.numCaisse = numCaisse;
        this.dateCreation = dateCreation;
        this.reference = reference;
        this.fActif = fActif;
    }

    public String getIdCaisse() {
        return idCaisse;
    }

    public void setIdCaisse(String idCaisse) {
        this.idCaisse = idCaisse;
    }

    public String getIdTypeCaisse() {
        return idTypeCaisse;
    }

    public void setIdTypeCaisse(String idTypeCaisse) {
        this.idTypeCaisse = idTypeCaisse;
    }

    public String getIdPointVente() {
        return idPointVente;
    }

    public void setIdPointVente(String idPointVente) {
        this.idPointVente = idPointVente;
    }

    public int getNumCaisse() {
        return numCaisse;
    }

    public void setNumCaisse(int numCaisse) {
        this.numCaisse = numCaisse;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Short getfActif() {
        return fActif;
    }

    public void setfActif(Short fActif) {
        this.fActif = fActif;
    }

    public String getIdrelatedCaisse() {
        return idrelatedCaisse;
    }

    public void setIdrelatedCaisse(String idrelatedCaisse) {
        this.idrelatedCaisse = idrelatedCaisse;
    }

	public Short getIsCuis() {
		return isCuis;
	}

	public void setIsCuis(Short isCuis) {
		this.isCuis = isCuis;
	}
    
    
}
