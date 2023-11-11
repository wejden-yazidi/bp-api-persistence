package com.bprice.persistance.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Facture")

public class Facture {
	
	@Id
	@GeneratedValue(generator = "String2") 
	private String idFacture ;
	private String numFacture ;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation;
	private String idPartenaireBprice ;
	public String getIdFacture() {
		return idFacture;
	}
	public void setIdFacture(String idFacture) {
		this.idFacture = idFacture;
	}
	public String getNumFacture() {
		return numFacture;
	}
	public void setNumFacture(String numFacture) {
		this.numFacture = numFacture;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getIdPartenaireBprice() {
		return idPartenaireBprice;
	}
	public void setIdPartenaireBprice(String idPartenaireBprice) {
		this.idPartenaireBprice = idPartenaireBprice;
	}
	
	
	
	
	
	
	
}
