/*
 * creer par Oussama dridi 22 févr. 2020
 */
package com.bprice.persistance.model;

import java.util.Date;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "OneTimePwd")
public class OneTimePwd {

	@Id
	@GeneratedValue(generator = "String2")
	private String id;

	private String destination;

	private String password;

	private String idApplication;

	private String originatorSMS;

	private int etat;

	private Date dateCreation;

	private Date dateExpiration;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIdApplication() {
		return idApplication;
	}

	public void setIdApplication(String idApplication) {
		this.idApplication = idApplication;
	}

	public String getOriginatorSMS() {
		return originatorSMS;
	}

	public void setOriginatorSMS(String originatorSMS) {
		this.originatorSMS = originatorSMS;
	}

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateExpiration() {
		return dateExpiration;
	}

	public void setDateExpiration(Date dateExpiration) {
		this.dateExpiration = dateExpiration;
	}
	
	
	
}
