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

@Document(collection="remiseRechagePartenaire")
public class RemiseRechagePartenaire {
	
	@Id
	@GeneratedValue(generator = "String2")
	private String idRemiseRechagePartenaire;
	private String idPartenaire;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation;
	
	
	private Short isActif;
	private Double min;
	private Double max;
	private Double ValeurRemise;
	public RemiseRechagePartenaire() {
		super();
	}
	public RemiseRechagePartenaire(String idRemiseRechagePartenaire, String idPartenaire, Date dateCreation,
			Short isActif, Double min, Double max, Double valeurRemise) {
		super();
		this.idRemiseRechagePartenaire = idRemiseRechagePartenaire;
		this.idPartenaire = idPartenaire;
		this.dateCreation = dateCreation;
		this.
		
		isActif = isActif;
		this.min = min;
		this.max = max;
		ValeurRemise = valeurRemise;
	}
	public String getIdRemiseRechagePartenaire() {
		return idRemiseRechagePartenaire;
	}
	public void setIdRemiseRechagePartenaire(String idRemiseRechagePartenaire) {
		this.idRemiseRechagePartenaire = idRemiseRechagePartenaire;
	}
	public String getIdPartenaire() {
		return idPartenaire;
	}
	public void setIdPartenaire(String idPartenaire) {
		this.idPartenaire = idPartenaire;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Short getIsActif() {
		return isActif;
	}
	public void setIsActif(Short isActif) {
		this.isActif = isActif;
	}
	public Double getMin() {
		return min;
	}
	public void setMin(Double min) {
		this.min = min;
	}
	public Double getMax() {
		return max;
	}
	public void setMax(Double max) {
		this.max = max;
	}
	public Double getValeurRemise() {
		return ValeurRemise;
	}
	public void setValeurRemise(Double valeurRemise) {
		ValeurRemise = valeurRemise;
	}
	
	

}
