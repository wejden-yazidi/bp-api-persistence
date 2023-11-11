/*
 * creer par Oussama dridi 4 avr. 2020
 */
package com.bprice.persistance.model;

import java.util.Date;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "fournisseur")
public class Fournisseur {
	@Id
	@GeneratedValue(generator = "String2")
	private String idFournisseur;
	private String idPatenaireBprice;
	private String nom;
	private String societe;
	private String email;
	private String tel;
	private Date dateCreation;
	public Fournisseur(String idPatenaireBprice, String nom, String societe, String email, String tel,
			Date dateCreation) {
		super();
		this.idPatenaireBprice = idPatenaireBprice;
		this.nom = nom;
		this.societe = societe;
		this.email = email;
		this.tel = tel;
		this.dateCreation = dateCreation;
	}
	public Fournisseur(String nom, String societe, String email, String tel,String idPatenaireBprice) {
		this.nom = nom;
		this.societe = societe;
		this.email = email;
		this.tel = tel;
		this.idPatenaireBprice = idPatenaireBprice;
	}

	public Fournisseur() {
	}

	public String getIdFournisseur() {
		return idFournisseur;
	}
	public void setIdFournisseur(String idFournisseur) {
		this.idFournisseur = idFournisseur;
	}
	public String getIdPatenaireBprice() {
		return idPatenaireBprice;
	}
	public void setIdPatenaireBprice(String idPatenaireBprice) {
		this.idPatenaireBprice = idPatenaireBprice;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getSociete() {
		return societe;
	}
	public void setSociete(String societe) {
		this.societe = societe;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	

}
