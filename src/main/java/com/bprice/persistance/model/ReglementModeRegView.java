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

@Document(collection = "reglementModeRegView")
public class ReglementModeRegView {
	@Id
	@GeneratedValue(generator = "String2")
	private String idReglement;
	private String idClientPartenaire;
	private String idCommande;
	private Float montant;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateReg;
	private Integer num;
	private short isRejete;
	private String idModReg;
	private Date datePourEncaissement;
	private ModeReglement modeReglement;

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

	public Float getMontant() {
		return montant;
	}

	public void setMontant(Float montant) {
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

	public ModeReglement getModeReglement() {
		return modeReglement;
	}

	public void setModeReglement(ModeReglement modeReglement) {
		this.modeReglement = modeReglement;
	}

}
