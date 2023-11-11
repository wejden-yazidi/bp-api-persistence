package com.bprice.persistance.model;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by ahmed on 25/01/2020.
 */
@Document(collection = "taxe")
public class Taxe {
    @Id
    @GeneratedValue(generator = "String2")
    private String idTaxe;
    private String idPointVente;
    private Short fDefault;
    private Short fActif;
    private String typeTaxe;
    private Double valeur;
    private String porteeTaxe;

    public Taxe() {
    }
    
    

    public Taxe(String idPointVente, Short fDefault, Short fActif, String typeTaxe, Double valeur, String porteeTaxe) {
		super();
		this.idPointVente = idPointVente;
		this.fDefault = fDefault;
		this.fActif = fActif;
		this.typeTaxe = typeTaxe;
		this.valeur = valeur;
		this.porteeTaxe = porteeTaxe;
	}



	public String getIdTaxe() {
        return idTaxe;
    }

    public void setIdTaxe(String idTaxe) {
        this.idTaxe = idTaxe;
    }

    public String getIdPointVente() {
        return idPointVente;
    }

    public void setIdPointVente(String idPointVente) {
        this.idPointVente = idPointVente;
    }

    public Short getfDefault() {
        return fDefault;
    }

    public void setfDefault(Short fDefault) {
        this.fDefault = fDefault;
    }

    public Short getfActif() {
        return fActif;
    }

    public void setfActif(Short fActif) {
        this.fActif = fActif;
    }

    public String getTypeTaxe() {
        return typeTaxe;
    }

    public void setTypeTaxe(String typeTaxe) {
        this.typeTaxe = typeTaxe;
    }

    public Double getValeur() {
        return valeur;
    }

    public void setValeur(Double valeur) {
        this.valeur = valeur;
    }

    public String getPorteeTaxe() {
        return porteeTaxe;
    }

    public void setPorteeTaxe(String porteeTaxe) {
        this.porteeTaxe = porteeTaxe;
    }
}
