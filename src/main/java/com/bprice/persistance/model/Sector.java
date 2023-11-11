package com.bprice.persistance.model;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by ahmed on 25/01/2020.
 */
@Document(collection = "sector")
public class Sector {
	@Id
	@GeneratedValue(generator = "String2")
	private String idClientType;
	private String code;
	private String designation;
	private Short fActif;

	public Sector() {
	}

	public Sector(String code, String designation, Short fActif) {
		super();
		this.code = code;
		this.designation = designation;
		this.fActif = fActif;
	}

	public String getIdClientType() {
		return idClientType;
	}

	public void setIdClientType(String idClientType) {
		this.idClientType = idClientType;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Short getfActif() {
		return fActif;
	}

	public void setfActif(Short fActif) {
		this.fActif = fActif;
	}
}
