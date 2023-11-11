/*
 * creer par Oussama dridi 19 mai 2020
 */
package com.bprice.persistance.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="groupeClientPartenaire")
public class GroupeClientPartenaire {
	@Id
	@GeneratedValue(generator = "String2")
	private String idGroupeClientPartenaire;
	private String designation;
	private String idPartenaire;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation;
	private Short isActif;
	private String couleur;
	
	
	public GroupeClientPartenaire() {
		super();
	}

	public GroupeClientPartenaire(String idGroupeClientPartenaire, String designation, String idPartenaire,
			Date dateCreation, Short isActif,String couleur) {
		super();
		this.idGroupeClientPartenaire = idGroupeClientPartenaire;
		this.designation = designation;
		this.idPartenaire = idPartenaire;
		this.dateCreation = dateCreation;
		this.isActif = isActif;
		this.couleur=couleur;
	}

	public String getIdGroupeClientPartenaire() {
		return idGroupeClientPartenaire;
	}

	public void setIdGroupeClientPartenaire(String idGroupeClientPartenaire) {
		this.idGroupeClientPartenaire = idGroupeClientPartenaire;
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

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Short getIsActif() {
		return isActif;
	}

	public void setIsActif(Short isActif) {
		this.isActif = isActif;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	

}
