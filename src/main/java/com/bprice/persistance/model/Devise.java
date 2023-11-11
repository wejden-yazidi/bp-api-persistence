package com.bprice.persistance.model;

import java.util.List;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by ahmed on 25/01/2020.
 */
@Document(collection = "devise")
public class Devise {
    @Id
    @GeneratedValue(generator = "String2")
    private String idDevise;
    private String idPointVente;
    private String code;
    private String designation;
    private Short fDefaut;
    private Double taux;
    private List<BilletMonnaie> refMonetique;

    public Devise() {
    }

    public String getIdDevise() {
        return idDevise;
    }

    public void setIdDevise(String idDevise) {
        this.idDevise = idDevise;
    }

    public String getIdPointVente() {
        return idPointVente;
    }

    public void setIdPointVente(String idPointVente) {
        this.idPointVente = idPointVente;
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

    public Short getfDefaut() {
        return fDefaut;
    }

    public void setfDefaut(Short fDefaut) {
        this.fDefaut = fDefaut;
    }

    public Double getTaux() {
        return taux;
    }

    public void setTaux(Double taux) {
        this.taux = taux;
    }

	public List<BilletMonnaie> getRefMonetique() {
		return refMonetique;
	}

	public void setRefMonetique(List<BilletMonnaie> refMonetique) {
		this.refMonetique = refMonetique;
	}
    
    
}
