package com.bprice.persistance.model;

import java.util.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//groupe-compta
public class Compte {
	
	@Id
	@GeneratedValue(generator="String2")
private String id;
private String idParent;
private int numCompte;
private Boolean isActif;
private Date dateCreation;

public List<Journall> Journall;

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getIdParent() {
	return idParent;
}

public void setIdParent(String idParent) {
	this.idParent = idParent;
}

public int getNumCompte() {
	return numCompte;
}

public void setNumCompte(int numCompte) {
	this.numCompte = numCompte;
}

public Boolean getIsActif() {
	return isActif;
}

public void setIsActif(Boolean isActif) {
	this.isActif = isActif;
}

public Date getDateCreation() {
	return dateCreation;
}

public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
}

public List<Journall> getJournall() {
	return Journall;
}

public void setJournall(List<Journall> journall) {
	Journall = journall;
}
}
