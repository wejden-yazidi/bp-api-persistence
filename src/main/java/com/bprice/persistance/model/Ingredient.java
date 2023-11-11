/*
 * creer par Oussama dridi 7 d�c. 2020
 */
package com.bprice.persistance.model;

import javax.persistence.GeneratedValue;


import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ingredient")
public class Ingredient {
	
	@Id
    @GeneratedValue(generator = "String2")
	 private String idIngredient;
	    private String couleur;
	    private String designation;
	    private String idPartenaire;
	    private short isComps = 0;
	    private String idProduit;
	    private Double qte;
	    
		public Ingredient() {
			super();
		}

		public String getIdIngredient() {
			return idIngredient;
		}

		public void setIdIngredient(String idIngredient) {
			this.idIngredient = idIngredient;
		}

		public String getCouleur() {
			return couleur;
		}

		public void setCouleur(String couleur) {
			this.couleur = couleur;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public String getIdPartenaire() {
			return idPartenaire;
		}

		public void setIdPartenaire(String idPartenaire) {
			this.idPartenaire = idPartenaire;
		}

		public short getIsComps() {
			return isComps;
		}

		public String getIdProduit() {
			return idProduit;
		}

		public Double getQte() {
			return qte;
		}

		public void setIsComps(short isComps) {
			this.isComps = isComps;
		}

		public void setIdProduit(String idProduit) {
			this.idProduit = idProduit;
		}

		public void setQte(Double qte) {
			this.qte = qte;
		}
	    
	    
	    

}
