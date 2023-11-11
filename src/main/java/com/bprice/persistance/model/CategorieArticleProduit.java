/*
 * creer par Oussama dridi 8 févr. 2020
 */
/**
 * Creer par Oussama Dridi le 8 févr. 2020
 */
package com.bprice.persistance.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;

/**
 * @author Oussama Dridi
 *
 */
@Document(collection = "produitCategArticle")
public class CategorieArticleProduit {

    @Id
    @GeneratedValue(generator = "String2")
    private String idProduitCateg;
    private String idCategArticle;
    private String idProduit;
    private Integer order;
    private String idPartenaire;

    public CategorieArticleProduit() {
    }

    public String getIdProduitCateg() {
        return idProduitCateg;
    }

    public void setIdProduitCateg(String idProduitCateg) {
        this.idProduitCateg = idProduitCateg;
    }

    public String getIdCategArticle() {
        return idCategArticle;
    }

    public void setIdCategArticle(String idCateg) {
        this.idCategArticle = idCateg;
    }

    public String getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(String idProduit) {
        this.idProduit = idProduit;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

	public String getIdPartenaire() {
		return idPartenaire;
	}

	public void setIdPartenaire(String idPartenaire) {
		this.idPartenaire = idPartenaire;
	}
    
    
}
