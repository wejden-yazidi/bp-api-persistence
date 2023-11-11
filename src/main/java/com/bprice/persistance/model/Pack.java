package com.bprice.persistance.model;

import java.util.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by ahmed on 25/01/2020.
 */
@Document(collection = "pack")
public class Pack {
    @Id
    @GeneratedValue(generator = "String2")
    private String idPack;
    private String idPartenaire;
    private String designation;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    private Double prixPack;
    private Short fautoriseGerant;
    private Double taux;
    private List<PointVente> pointVentes;
    private List<ProduitAndQte> produits;
	private List<String> categoriesArticles;
    private Short fRacourci;
	private Double productsprice;

    public Pack() {
    }

    public String getIdPack() {
        return idPack;
    }

	public String getIdPartenaire() {
		return idPartenaire;
	}

	public void setIdPartenaire(String idPartenaire) {
		this.idPartenaire = idPartenaire;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Double getPrixPack() {
		return prixPack;
	}

	public void setPrixPack(Double prixPack) {
		this.prixPack = prixPack;
	}



	public Short getFautoriseGerant() {
		return fautoriseGerant;
	}

	public void setFautoriseGerant(Short fautoriseGerant) {
		this.fautoriseGerant = fautoriseGerant;
	}

	public Double getTaux() {
		return taux;
	}

	public void setTaux(Double taux) {
		this.taux = taux;
	}

	public void setIdPack(String idPack) {
		this.idPack = idPack;
	}

	public List<PointVente> getPointVentes() {
		return pointVentes;
	}

	public void setPointVentes(List<PointVente> pointVentes) {
		this.pointVentes = pointVentes;
	}

	public List<ProduitAndQte> getProduits() {
		return produits;
	}

	public void setProduits(List<ProduitAndQte> produits) {
		this.produits = produits;
	}

	public Short getfRacourci() {
		return fRacourci;
	}

	public void setfRacourci(Short fRacourci) {
		this.fRacourci = fRacourci;
	}

	public List<String> getCategoriesArticles() {
		return categoriesArticles;
	}

	public void setCategoriesArticles(List<String> categoriesArticles) {
		this.categoriesArticles = categoriesArticles;
	}

	public Double getProductsprice() {
		return productsprice;
	}

	public void setProductsprice(Double productsprice) {
		this.productsprice = productsprice;
	}
}
