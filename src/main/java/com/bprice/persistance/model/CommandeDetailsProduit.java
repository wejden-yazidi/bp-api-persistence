/*
 * creer par Oussama dridi 2 mai 2021
 */
package com.bprice.persistance.model;

import javax.persistence.GeneratedValue;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "CommandeDetailsProduit")
public class CommandeDetailsProduit {
	@org.springframework.data.annotation.Id
	@GeneratedValue(generator = "String2")
	private String idDetailComm;

	private String idProduit;
	private String idPack;
	private String idCommande;
	private Double prix;
	private Double quantite;
	private Short isAnnule;
	private Double remise;
	private String designation;
	private Double prixSansRemise;

	private String nomProduit;
	private CommandeDetails commandeDetails;

	public String getIdDetailComm() {
		return idDetailComm;
	}

	public String getNomProduit() {
		return nomProduit;
	}

	public CommandeDetails getCommandeDetails() {
		return commandeDetails;
	}

	public void setIdDetailComm(String idDetailComm) {
		this.idDetailComm = idDetailComm;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public void setCommandeDetails(CommandeDetails commandeDetails) {
		this.commandeDetails = commandeDetails;
	}

	public String getIdProduit() {
		return idProduit;
	}

	public String getIdPack() {
		return idPack;
	}

	public String getIdCommande() {
		return idCommande;
	}

	public Double getPrix() {
		return prix;
	}

	public Double getQuantite() {
		return quantite;
	}

	public Short getIsAnnule() {
		return isAnnule;
	}

	public Double getRemise() {
		return remise;
	}

	public String getDesignation() {
		return designation;
	}

	public Double getPrixSansRemise() {
		return prixSansRemise;
	}

	public void setIdProduit(String idProduit) {
		this.idProduit = idProduit;
	}

	public void setIdPack(String idPack) {
		this.idPack = idPack;
	}

	public void setIdCommande(String idCommande) {
		this.idCommande = idCommande;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public void setQuantite(Double quantite) {
		this.quantite = quantite;
	}

	public void setIsAnnule(Short isAnnule) {
		this.isAnnule = isAnnule;
	}

	public void setRemise(Double remise) {
		this.remise = remise;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setPrixSansRemise(Double prixSansRemise) {
		this.prixSansRemise = prixSansRemise;
	}

}
