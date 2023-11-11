package com.bprice.persistance.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "detailFacture")

public class DetailFacture {
	
	@Id
	@GeneratedValue(generator = "String2") 
	private String idDetail ;
	private Short remise ;
	private String idFacture ;
	
	
	
	
	
	
	
	public String getIdDetail() {
		return idDetail;
	}
	public void setIdDetail(String idDetail) {
		this.idDetail = idDetail;
	}
	public Short getRemise() {
		return remise;
	}
	public void setRemise(Short remise) {
		this.remise = remise;
	}
	public String getIdFacture() {
		return idFacture;
	}
	public void setIdFacture(String idFacture) {
		this.idFacture = idFacture;
	}

	

	

}
