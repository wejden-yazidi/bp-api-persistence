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
@Document(collection = "journee")
public class Journee {
    @Id
    @GeneratedValue(generator = "String2")
    private String idJournee;
    private String idPointVente;
    private int nbrJour;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOuverture;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFermeture;
    private Short fCloture;
    private Float chiffreAffaire;
    

    public Journee() {
    }

    public String getIdJournee() {
        return idJournee;
    }

    public void setIdJournee(String idJournee) {
        this.idJournee = idJournee;
    }

    public String getIdPointVente() {
        return idPointVente;
    }

    public void setIdPointVente(String idPointVente) {
        this.idPointVente = idPointVente;
    }

    public int getNbrJour() {
        return nbrJour;
    }

    public void setNbrJour(int nbrJour) {
        this.nbrJour = nbrJour;
    }

    public Date getDateOuverture() {
        return dateOuverture;
    }

    public void setDateOuverture(Date dateOuverture) {
        this.dateOuverture = dateOuverture;
    }

    public Date getDateFermeture() {
        return dateFermeture;
    }

    public void setDateFermeture(Date dateFermeture) {
        this.dateFermeture = dateFermeture;
    }

    public Short getfCloture() {
        return fCloture;
    }

    public void setfCloture(Short fCloture) {
        this.fCloture = fCloture;
    }

	public Float getChiffreAffaire() {
		return chiffreAffaire;
	}

	public void setChiffreAffaire(Float chiffreAffaire) {
		this.chiffreAffaire = chiffreAffaire;
	}


}

