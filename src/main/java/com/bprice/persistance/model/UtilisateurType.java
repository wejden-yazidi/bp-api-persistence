package com.bprice.persistance.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;

/**
 * Created by ahmed on 25/01/2020.
 */
@Document(collection = "utilisateurType")
public class UtilisateurType {
    @Id
    @GeneratedValue(generator = "String2")
    private String idTypeUtilisateur;
    private String code;
    private String designation;
    private String fCaisse;
    private Short fBackoffice;
    private Short fActif;
    private Short fGerant;
    private Short fBprice;
    private Short fAgent;

    public UtilisateurType() {
    }

    
    public UtilisateurType(String code, String designation, String fCaisse, Short fBackoffice, Short fActif,
			Short fGerant, Short fBprice) {
		super();
		this.code = code;
		this.designation = designation;
		this.fCaisse = fCaisse;
		this.fBackoffice = fBackoffice;
		this.fActif = fActif;
		this.fGerant = fGerant;
		this.fBprice = fBprice;
	}


	public String getIdTypeUtilisateur() {
        return idTypeUtilisateur;
    }

    public void setIdTypeUtilisateur(String idTypeUtilisateur) {
        this.idTypeUtilisateur = idTypeUtilisateur;
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

    public String getfCaisse() {
        return fCaisse;
    }

    public void setfCaisse(String fCaisse) {
        this.fCaisse = fCaisse;
    }

    public Short getfBackoffice() {
        return fBackoffice;
    }

    public void setfBackoffice(Short fBackoffice) {
        this.fBackoffice = fBackoffice;
    }

    public Short getfActif() {
        return fActif;
    }

    public void setfActif(Short fActif) {
        this.fActif = fActif;
    }

    public Short getfGerant() {
        return fGerant;
    }

    public void setfGerant(Short fGerant) {
        this.fGerant = fGerant;
    }

	public Short getfBprice() {
		return fBprice;
	}

	public void setfBprice(Short fBprice) {
		this.fBprice = fBprice;
	}

    public Short getfAgent() {
        return fAgent;
    }

    public void setfAgent(Short fAgent) {
        this.fAgent = fAgent;
    }
}
