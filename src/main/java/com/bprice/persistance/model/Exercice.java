package com.bprice.persistance.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//groupe-compta

public class Exercice {
	@Id
	@GeneratedValue(generator="String2")
	private String id ;
	private Boolean isCloture;
	private String codeExercice;
	private Date Annee;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Boolean getIsCloture() {
		return isCloture;
	}
	public void setIsCloture(Boolean isCloture) {
		this.isCloture = isCloture;
	}
	public String getCodeExercice() {
		return codeExercice;
	}
	public void setCodeExercice(String codeExercice) {
		this.codeExercice = codeExercice;
	}
	public Date getAnnee() {
		return Annee;
	}
	public void setAnnee(Date annee) {
		Annee = annee;
	}


}

