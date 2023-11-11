/*
 * creer par Oussama dridi 15 avr. 2020
 */
package com.bprice.persistance.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reglementCommandeView")
public class ReglementCommandeView {
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
	private String numReg;
	private Commande commande;
	public ReglementCommandeView() {
		super();
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
	public String getNumReg() {
		return numReg;
	}
	public void setNumReg(String numReg) {
		this.numReg = numReg;
	}
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	
	

}
