/*
 * creer par Oussama dridi 4 avr. 2020
 */
package com.bprice.persistance.model;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="produitFournisseur")
public class ProduitFournisseur {

    @Id
    @GeneratedValue(generator = "String2")
    private String idProduitFournisseur;
    private String idFrounisseur;
    private String idProduit;
    private short FDefaut;
    private short fAlerte;

	public ProduitFournisseur(String idFrounisseur, String idProduit, short fDefaut) {
		super();
		this.idFrounisseur = idFrounisseur;
		this.idProduit = idProduit;
		FDefaut = fDefaut;
	}

	public ProduitFournisseur() {
	}

	public String getIdProduitFournisseur() {
		return idProduitFournisseur;
	}
	public void setIdProduitFournisseur(String idProduitFournisseur) {
		this.idProduitFournisseur = idProduitFournisseur;
	}
	public String getIdFrounisseur() {
		return idFrounisseur;
	}
	public void setIdFrounisseur(String idFrounisseur) {
		this.idFrounisseur = idFrounisseur;
	}
	public String getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(String idProduit) {
		this.idProduit = idProduit;
	}
	public short getFDefaut() {
		return FDefaut;
	}
	public void setFDefaut(short fDefaut) {
		FDefaut = fDefaut;
	}

	public short getfAlerte() {
		return fAlerte;
	}

	public void setfAlerte(short fAlerte) {
		this.fAlerte = fAlerte;
	}
}
