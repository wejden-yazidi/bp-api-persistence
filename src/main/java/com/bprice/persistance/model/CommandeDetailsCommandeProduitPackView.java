/*
 * creer par Oussama dridi 24 juin 2020
 */
package com.bprice.persistance.model;

import javax.persistence.GeneratedValue;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "commandeDetailsCommandeProduitPackView")
public class CommandeDetailsCommandeProduitPackView {
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
	private String idEmploye;
	private Utilisateur employe;
	private Commande commande;
	private Produit produit;
	private Pack pack;
	private Double prixInit;


	public CommandeDetailsCommandeProduitPackView(String idProduit, String idCommande, Double prix, Double quantite,
												  String designation,Double prixInit) {
		super();
		this.idProduit = idProduit;
		this.idCommande = idCommande;
		this.prix = prix;
		this.quantite = quantite;
		this.designation = designation;
		this.prixInit=prixInit;
	}

	

	public CommandeDetailsCommandeProduitPackView() {
		super();
	}



	public CommandeDetailsCommandeProduitPackView(String idCommande, Double prix, Double quantite,
			Utilisateur employe) {
		super();
		this.idCommande = idCommande;
		this.prix = prix;
		this.quantite = quantite;
		this.employe = employe;
		
	}






	public String getIdDetailComm() {
		return idDetailComm;
	}
	public void setIdDetailComm(String idDetailComm) {
		this.idDetailComm = idDetailComm;
	}
	public String getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(String idProduit) {
		this.idProduit = idProduit;
	}
	public String getIdPack() {
		return idPack;
	}
	public void setIdPack(String idPack) {
		this.idPack = idPack;
	}
	public String getIdCommande() {
		return idCommande;
	}
	public void setIdCommande(String idCommande) {
		this.idCommande = idCommande;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public Double getQuantite() {
		return quantite;
	}
	public void setQuantite(Double quantite) {
		this.quantite = quantite;
	}
	public Short getIsAnnule() {
		return isAnnule;
	}
	public void setIsAnnule(Short isAnnule) {
		this.isAnnule = isAnnule;
	}
	public Double getRemise() {
		return remise;
	}
	public void setRemise(Double remise) {
		this.remise = remise;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Double getPrixSansRemise() {
		return prixSansRemise;
	}
	public void setPrixSansRemise(Double prixSansRemise) {
		this.prixSansRemise = prixSansRemise;
	}
	public String getIdEmploye() {
		return idEmploye;
	}
	public void setIdEmploye(String idEmploye) {
		this.idEmploye = idEmploye;
	}
	public Utilisateur getEmploye() {
		return employe;
	}
	public void setEmploye(Utilisateur employe) {
		this.employe = employe;
	}
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public Pack getPack() {
		return pack;
	}
	public void setPack(Pack pack) {
		this.pack = pack;
	}



	public Double getPrixInit() {
		return prixInit;
	}



	public void setPrixInit(Double prixInit) {
		this.prixInit = prixInit;
	}



}