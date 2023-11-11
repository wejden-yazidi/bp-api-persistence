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
@Document(collection = "reglement")
public class Reglement {
    @Id
    @GeneratedValue(generator = "String2")
    private String idReglement;
    private String idClientPartenaire;
    private String idCommande;
    private Double montant;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateReg;
    private Integer num;
    private short isRejete;
    private String idModReg;
    private Date datePourEncaissement;
    private String numReg;

    public Reglement() {
    }
    

    public Reglement(String idConsommateur, String idTicket, Double montant, Date dateReg, Integer num, short isRejete,
			String idModReg, Date datePourEncaissement,String numReg) {
		super();
		this.idClientPartenaire = idConsommateur;
		this.idCommande = idTicket;
		this.montant = montant;
		this.dateReg = dateReg;
		this.num = num;
		this.isRejete = isRejete;
		this.idModReg = idModReg;
		this.datePourEncaissement = datePourEncaissement;
		this.numReg = numReg;
	}


	public String getIdReglement() {
        return idReglement;
    }

    public void setIdReglement(String idReglement) {
        this.idReglement = idReglement;
    }



    public String getIdClientPartenaire() {
		return idClientPartenaire;
	}


	public void setIdClientPartenaire(String idClientPartenaire) {
		this.idClientPartenaire = idClientPartenaire;
	}




    public String getIdCommande() {
		return idCommande;
	}


	public void setIdCommande(String idCommande) {
		this.idCommande = idCommande;
	}


	public Double getMontant() {
		return montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}

	public Date getDateReg() {
        return dateReg;
    }

    public void setDateReg(Date dateReg) {
        this.dateReg = dateReg;
    }

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public short getIsRejete() {
		return isRejete;
	}

	public void setIsRejete(short isRejete) {
		this.isRejete = isRejete;
	}

	public String getIdModReg() {
		return idModReg;
	}

	public void setIdModReg(String idModReg) {
		this.idModReg = idModReg;
	}

	public Date getDatePourEncaissement() {
		return datePourEncaissement;
	}

	public void setDatePourEncaissement(Date datePourEncaissement) {
		this.datePourEncaissement = datePourEncaissement;
	}


	public String getNumReg() {
		return numReg;
	}


	public void setNumReg(String numReg) {
		this.numReg = numReg;
	}
    
}
