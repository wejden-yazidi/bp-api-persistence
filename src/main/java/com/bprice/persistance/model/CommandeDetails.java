package com.bprice.persistance.model;

import java.util.List;

import javax.persistence.GeneratedValue;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by ahmed on 25/01/2020.
 */
@Document(collection = "commandeDetails")
public class CommandeDetails {
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
	private String ingredient;
	private Short isTraite;
	private List<String> idsIngrdComp;


	public CommandeDetails() {
	}

	public CommandeDetails(String idProduit, String idTicket, Double prix, Double quantite) {
		super();
		this.idProduit = idProduit;
		this.idCommande = idTicket;
		this.prix = prix;
		this.quantite = quantite;
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

	public String getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(String idCommande) {
		this.idCommande = idCommande;
	}

	public Double getQuantite() {
		return quantite;
	}

	public void setQuantite(Double quantite) {
		this.quantite = quantite;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public Short getIsAnnule() {
		return isAnnule;
	}

	public void setIsAnnule(Short isAnnule) {
		this.isAnnule = isAnnule;
	}

	public String getIdPack() {
		return idPack;
	}

	public void setIdPack(String idPack) {
		this.idPack = idPack;
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

	
	public String getIngredient() {
		return ingredient;
	}

	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idProduit == null) ? 0 : idProduit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CommandeDetails other = (CommandeDetails) obj;
		if (idProduit == null) {
			if (other.idProduit != null)
				return false;
		} else if (!idProduit.equals(other.idProduit))
			return false;
		return true;
	}

	public Short getIsTraite() {
		return isTraite;
	}

	public void setIsTraite(Short isTraite) {
		this.isTraite = isTraite;
	}

	public List<String> getIdsIngrdComp() {
		return idsIngrdComp;
	}

	public void setIdsIngrdComp(List<String> idsIngrdComp) {
		this.idsIngrdComp = idsIngrdComp;
	}
	

}
