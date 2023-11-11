/*
 * creer par Oussama dridi 8 avr. 2020
 */
package com.bprice.persistance.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "notification")
public class Notification {
	@Id
	@GeneratedValue(generator = "String2")
	private String idNotification;
	private String idPartenaire;
	private String typeNotification;
	private String titre;
	private String body;
	private String description;
	private short isActif;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation;
	private Date dateDebut;
	private Date dateFin;
	private Image imageNotif;
	private short isSlider;

	public Notification() {
		super();
	}

	public Notification(String idPartenaire, String typeNotification, String titre, String body, String description,
			short isActif, Date dateCreation, Date dateDebut, Date dateFin, Image imageNotif, short isSlider) {
		super();
		this.idPartenaire = idPartenaire;
		this.typeNotification = typeNotification;
		this.titre = titre;
		this.body = body;
		this.description = description;
		this.isActif = isActif;
		this.dateCreation = dateCreation;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.imageNotif = imageNotif;
		this.isSlider = isSlider;
	}

	public Image getImageNotif() {
		return imageNotif;
	}

	public void setImageNotif(Image imageNotif) {
		this.imageNotif = imageNotif;
	}

	public String getIdPartenaire() {
		return idPartenaire;
	}

	public void setIdPartenaire(String idPartenaire) {
		this.idPartenaire = idPartenaire;
	}

	public String getTypeNotification() {
		return typeNotification;
	}

	public void setTypeNotification(String typeNotification) {
		this.typeNotification = typeNotification;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public short getIsActif() {
		return isActif;
	}

	public void setIsActif(short isActif) {
		this.isActif = isActif;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public String getIdNotification() {
		return idNotification;
	}

	public void setIdNotification(String idNotification) {
		this.idNotification = idNotification;
	}

	public short getIsSlider() {
		return isSlider;
	}

	public void setIsSlider(short isSlider) {
		this.isSlider = isSlider;
	}

}
