package com.bprice.persistance.model;

import javax.persistence.Id;
// groupe-compta

public class TypeJournal {
	
	@Id
private String id;
private String code;
private Boolean isActif;

public TypeJournal() {
	super();
}
public TypeJournal(String id, String code, Boolean isActif) {
	super();
	this.id = id;
	this.code = code;
	this.isActif = isActif;
}
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
}
