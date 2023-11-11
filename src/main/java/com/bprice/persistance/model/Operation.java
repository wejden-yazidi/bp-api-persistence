package com.bprice.persistance.model;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


/**
 * Created by ahmed on 25/01/2020.
 */
@Document(collection = "operation")
public class Operation {
    @Id
    @GeneratedValue(generator = "String2")
    private String idOperation;
    private String idTypeOperation;
    private String idCaisse;
    private String caiIdCaisse;
    private Date dateOperation;
    private String statut;
    private String idPointVente;
    private String commenatire;
    private String idUtilisateur;
    private String idFournisseur;
    private Integer numCommande;
    private Double montant;
    private String idSession;
    private String idEmploye;

    public Operation() {
    }

    public String getIdOperation() {
        return idOperation;
    }

    public void setIdOperation(String idOperation) {
        this.idOperation = idOperation;
    }

    public String getIdTypeOperation() {
        return idTypeOperation;
    }

    public void setIdTypeOperation(String idTypeOperation) {
        this.idTypeOperation = idTypeOperation;
    }

    public String getIdCaisse() {
        return idCaisse;
    }

    public void setIdCaisse(String idCaisse) {
        this.idCaisse = idCaisse;
    }

    public String getCaiIdCaisse() {
        return caiIdCaisse;
    }

    public void setCaiIdCaisse(String caiIdCaisse) {
        this.caiIdCaisse = caiIdCaisse;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

	public String getIdPointVente() {
		return idPointVente;
	}

	public void setIdPointVente(String idPointVente) {
		this.idPointVente = idPointVente;
	}

	public String getCommenatire() {
		return commenatire;
	}

	public void setCommenatire(String commenatire) {
		this.commenatire = commenatire;
	}

	public String getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(String idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

    public String getIdFournisseur() {
        return idFournisseur;
    }

    public void setIdFournisseur(String idFournisseur) {
        this.idFournisseur = idFournisseur;
    }

    public Integer getNumCommande() {
        return numCommande;
    }

    public void setNumCommande(Integer numCommande) {
        this.numCommande = numCommande;
    }

	public Double getMontant() {
		return montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}

	public String getIdSession() {
		return idSession;
	}

	public void setIdSession(String idSession) {
		this.idSession = idSession;
	}

	public String getIdEmploye() {
		return idEmploye;
	}

	public void setIdEmploye(String idEmploye) {
		this.idEmploye = idEmploye;
	}
    
    
}
