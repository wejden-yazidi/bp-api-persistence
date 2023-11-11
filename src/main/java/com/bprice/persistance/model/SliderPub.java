package com.bprice.persistance.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by ahmed on 25/01/2020.
 */
@Document(collection = "sliderPub")
public class SliderPub {
	@Id
	@GeneratedValue(generator = "String2")
	private String idSlider;
	private String idCaisse;
	private String description;
	private String url;
	private String type;
	private Short fActif;
	private String ajoutePar;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation;

	public SliderPub() {
		super();
	}

	public SliderPub(String idCaisse, String description, String url, String type, Short fActif, String ajoutePar,
			Date dateCreation) {
		super();
		this.idCaisse = idCaisse;
		this.description = description;
		this.url = url;
		this.type = type;
		this.fActif = fActif;
		this.ajoutePar = ajoutePar;
		this.dateCreation = dateCreation;
	}

	public String getIdSlider() {
		return idSlider;
	}

	public void setIdSlider(String idSlider) {
		this.idSlider = idSlider;
	}

	public String getIdCaisse() {
		return idCaisse;
	}

	public void setIdCaisse(String idCaisse) {
		this.idCaisse = idCaisse;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Short getfActif() {
		return fActif;
	}

	public void setfActif(Short fActif) {
		this.fActif = fActif;
	}

	public String getAjoutePar() {
		return ajoutePar;
	}

	public void setAjoutePar(String ajoutePar) {
		this.ajoutePar = ajoutePar;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

}
