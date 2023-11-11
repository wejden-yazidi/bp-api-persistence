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

@Document(collection="notifHistorique")
public class NotifHistorique {
	@Id
	@GeneratedValue(generator = "String2")
	private String idNotifHistorique;
	private String idNotification;
	private String idPartenaire;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateEnvoi;
	
	
	public NotifHistorique() {
		super();
	}


	public NotifHistorique(String idNotifHistorique, String idNotification, String idPartenaire, Date dateEnvoi) {
		super();
		this.idNotifHistorique = idNotifHistorique;
		this.idNotification = idNotification;
		this.idPartenaire = idPartenaire;
		this.dateEnvoi = dateEnvoi;
	}


	public String getIdNotifHistorique() {
		return idNotifHistorique;
	}


	public void setIdNotifHistorique(String idNotifHistorique) {
		this.idNotifHistorique = idNotifHistorique;
	}


	public String getIdNotification() {
		return idNotification;
	}


	public void setIdNotification(String idNotification) {
		this.idNotification = idNotification;
	}


	public String getIdPartenaire() {
		return idPartenaire;
	}


	public void setIdPartenaire(String idPartenaire) {
		this.idPartenaire = idPartenaire;
	}


	public Date getDateEnvoi() {
		return dateEnvoi;
	}


	public void setDateEnvoi(Date dateEnvoi) {
		this.dateEnvoi = dateEnvoi;
	}
	
	
	

}
