package com.bprice.persistance.model;

import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;


/**
 * Created by ahmed on 25/01/2020.
 */
@Document(collection = "modeReglement")
public class ModeReglement {
    @Id
    @GeneratedValue(generator = "String2")
    private String idModeReglement;
    private String code;
    private String designation;
    private short FNum;
    private short FFidelite;
    private short FDate;
    private short FValidation;
    private String idPointVente;
    private short isactif;
    private short fdefault;
	private String couleur;

    public ModeReglement() {
    }

    public String getIdModeReglement() {
        return idModeReglement;
    }

    public void setIdModeReglement(String idModeReglement) {
        this.idModeReglement = idModeReglement;
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

	public short getFNum() {
		return FNum;
	}

	public void setFNum(short fNum) {
		FNum = fNum;
	}

	public Short getFFidelite() {
		return FFidelite;
	}

	public void setFFidelite(short fFidelite) {
		FFidelite = fFidelite;
	}

	public short getFDate() {
		return FDate;
	}

	public void setFDate(short fDate) {
		FDate = fDate;
	}

	public short getFValidation() {
		return FValidation;
	}

	public void setFValidation(short fValidation) {
		FValidation = fValidation;
	}

    public String getIdPointVente() {
        return idPointVente;
    }

    public void setIdPointVente(String idPointVente) {
        this.idPointVente = idPointVente;
    }

    public short getIsactif() {
        return isactif;
    }

    public void setIsactif(short isactif) {
        this.isactif = isactif;
    }

    public short getFdefault() {
        return fdefault;
    }

    public void setFdefault(short fdefault) {
        this.fdefault = fdefault;
    }

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
    
}
