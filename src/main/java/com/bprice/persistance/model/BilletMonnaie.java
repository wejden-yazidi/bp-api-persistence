package com.bprice.persistance.model;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;


public class BilletMonnaie {
    @Id
    @GeneratedValue(generator = "String2")
    private String idBilletMonnaie;
    private String designation;
    private String image;
    private Float valeur;
    private Short fbillet;
 
    
    
//	public BilletMonnaie(String designation, String image, Float valeur) {
//		super();
//		this.designation = designation;
//		this.image = image;
//		this.valeur = valeur;
//	}

	public BilletMonnaie() {
	}

	public String getIdBilletMonnaie() {
		return idBilletMonnaie;
	}
	public void setIdBilletMonnaie(String idBilletMonnaie) {
		this.idBilletMonnaie = idBilletMonnaie;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Float getValeur() {
		return valeur;
	}
	public void setValeur(Float valeur) {
		this.valeur = valeur;
	}

	public Short getFbillet() {
		return fbillet;
	}

	public void setFbillet(Short fbillet) {
		this.fbillet = fbillet;
	}
}
