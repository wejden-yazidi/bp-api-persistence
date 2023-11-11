/*
 * creer par Oussama dridi 17 févr. 2020
 */
package com.bprice.persistance.model;

import java.util.List;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by oussamaon 17/02/2020.
 */
@Document(collection = "regleUtilisationFidelite")
public class RegleUtilisationFidelite {

	@Id
	@GeneratedValue(generator = "String2")
	private String idRegleUtilisationFidelite;
	private String idPointVente;
	private Float minSolde;
	private Integer minPresent;
	private List<JoursRegle> joursUtilisation;
	private short isActive;

	public RegleUtilisationFidelite(String idPointVente, float minSolde, Integer minPresent,
			List<JoursRegle> joursUtilisation) {
		super();
		this.idPointVente = idPointVente;
		this.minSolde = minSolde;
		this.minPresent = minPresent;
		this.joursUtilisation = joursUtilisation;
	}

	public String getIdRegleUtilisationFidelite() {
		return idRegleUtilisationFidelite;
	}

	public void setIdRegleUtilisationFidelite(String idRegleUtilisationFidelite) {
		this.idRegleUtilisationFidelite = idRegleUtilisationFidelite;
	}

	public String getIdPointVente() {
		return idPointVente;
	}

	public void setIdPointVente(String idPointVente) {
		this.idPointVente = idPointVente;
	}


	public Float getMinSolde() {
		return minSolde;
	}

	public void setMinSolde(Float minSolde) {
		this.minSolde = minSolde;
	}

	public Integer getMinPresent() {
		return minPresent;
	}

	public void setMinPresent(Integer minPresent) {
		this.minPresent = minPresent;
	}

	public List<JoursRegle> getJoursUtilisation() {
		return joursUtilisation;
	}

	public void setJoursUtilisation(List<JoursRegle> joursUtilisation) {
		this.joursUtilisation = joursUtilisation;
	}

	public short getIsActive() {
		return isActive;
	}

	public void setIsActive(short isActive) {
		this.isActive = isActive;
	}
}
