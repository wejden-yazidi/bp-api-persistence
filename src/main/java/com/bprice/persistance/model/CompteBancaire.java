package com.bprice.persistance.model;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//groupe-compta
public class CompteBancaire {

	@GeneratedValue(generator="String2")
	@Id
private String id;
private String code;
private Boolean isActif;
private int numCompte;

public List<Journall> Journall;

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getCode() {
	return code;
}

public void setCode(String code) {
	this.code = code;
}

public Boolean getIsActif() {
	return isActif;
}

public void setIsActif(Boolean isActif) {
	this.isActif = isActif;
}

public int getNumCompte() {
	return numCompte;
}

public void setNumCompte(int numCompte) {
	this.numCompte = numCompte;
}

public List<Journall> getJournall() {
	return Journall;
}

public void setJournall(List<Journall> journall) {
	Journall = journall;
}
}
