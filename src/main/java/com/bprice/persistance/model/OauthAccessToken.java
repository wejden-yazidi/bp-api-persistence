/*
 * creer par Oussama dridi 22 févr. 2020
 */
package com.bprice.persistance.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "OauthAccessToken")
public class OauthAccessToken {

	@Id
	@GeneratedValue(generator = "String2")
	private String id;

	private String accessToken;

	private String clientId;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateExpiration;
	
	
	

	public OauthAccessToken(String accessToken, String clientId, Date dateCreation, Date dateExpiration) {
		super();
		this.accessToken = accessToken;
		this.clientId = clientId;
		this.dateCreation = dateCreation;
		this.dateExpiration = dateExpiration;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
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
