/*
 * creer par Oussama dridi 25 févr. 2020
 */
package com.bprice.persistance.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "MvtCarte")
public class MvtCarte {

	@Id
	@GeneratedValue(generator = "String2")
	private String idMvtCarte;
	private String idClientPartenaire;
	private String operation;
	private String typeOp;
	private String idReglment;
	private String idEmetteur;
	private Float valeur;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOp;
	
	

	public MvtCarte(String idClientPartenaire, String operation, String typeOp, String idReglment, String idEmetteur,
			Float valeur, Date dateOp) {
		super();
		this.idClientPartenaire = idClientPartenaire;
		this.operation = operation;
		this.typeOp = typeOp;
		this.idReglment = idReglment;
		this.idEmetteur = idEmetteur;
		this.valeur = valeur;
		this.dateOp = dateOp;
	}

	public String getIdMvtCarte() {
		return idMvtCarte;
	}

	public void setIdMvtCarte(String idMvtCarte) {
		this.idMvtCarte = idMvtCarte;
	}

	public String getIdClientPartenaire() {
		return idClientPartenaire;
	}

	public void setIdClientPartenaire(String idClientPartenaire) {
		this.idClientPartenaire = idClientPartenaire;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getTypeOp() {
		return typeOp;
	}

	public void setTypeOp(String typeOp) {
		this.typeOp = typeOp;
	}

	public String getIdReglment() {
		return idReglment;
	}

	public void setIdReglment(String idReglment) {
		this.idReglment = idReglment;
	}

	public String getIdEmetteur() {
		return idEmetteur;
	}

	public void setIdEmetteur(String idEmetteur) {
		this.idEmetteur = idEmetteur;
	}

	public Float getValeur() {
		return valeur;
	}

	public void setValeur(Float valeur) {
		this.valeur = valeur;
	}

	public Date getDateOp() {
		return dateOp;
	}

	public void setDateOp(Date dateOp) {
		this.dateOp = dateOp;
	}

}
