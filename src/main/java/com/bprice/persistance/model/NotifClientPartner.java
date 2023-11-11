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

@Document(collection = "notifClientPartenaire")
public class NotifClientPartner {

	@Id
	@GeneratedValue(generator = "String2")
	private String idNotifClientPartenaire;

	private String idClientPartenaire;
	private String idNotification;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateEnvoi;

	public NotifClientPartner() {
		super();
	}

	public NotifClientPartner(String idClientPartenaire, String idNotification, Date dateEnvoi) {
		super();
		this.idClientPartenaire = idClientPartenaire;
		this.idNotification = idNotification;
		this.dateEnvoi = dateEnvoi;
	}

	public String getIdNotifClientPartenaire() {
		return idNotifClientPartenaire;
	}

	public void setIdNotifClientPartenaire(String idNotifClientPartenaire) {
		this.idNotifClientPartenaire = idNotifClientPartenaire;
	}

	public String getIdClientPartenaire() {
		return idClientPartenaire;
	}

	public void setIdClientPartenaire(String idClientPartenaire) {
		this.idClientPartenaire = idClientPartenaire;
	}

	public String getIdNotification() {
		return idNotification;
	}

	public void setIdNotification(String idNotification) {
		this.idNotification = idNotification;
	}

	public Date getDateEnvoi() {
		return dateEnvoi;
	}

	public void setDateEnvoi(Date dateEnvoi) {
		this.dateEnvoi = dateEnvoi;
	}

}
