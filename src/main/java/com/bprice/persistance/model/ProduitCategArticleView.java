/*
 * creer par Oussama dridi 14 juin 2021
 */
package com.bprice.persistance.model;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="produitCategArticle_view")
public class ProduitCategArticleView {

	 @Id
	    @GeneratedValue(generator = "String2")
	    private String idProduitCateg;
	    private String idCategArticle;
	    private String idProduit;
	    private Integer order;
	    private String idPartenaire;
	    private CategorieArticle categorie;

	    public ProduitCategArticleView() {
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

		public CategorieArticle getCategorie() {
			return categorie;
		}

		public void setCategorie(CategorieArticle categorie) {
			this.categorie = categorie;
		}
	    
	    
}
