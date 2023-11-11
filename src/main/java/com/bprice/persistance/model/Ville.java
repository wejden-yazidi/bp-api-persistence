package com.bprice.persistance.model;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by ahmed on 25/01/2020.
 */
@Document(collection = "ville")
public class Ville {
    @Id
    @GeneratedValue(generator = "String2")
    private String idVille;
    private String idPays;
    private String code;
    private String designation;

    public Ville() {
    }
    
    

    public Ville(String idPays, String code, String designation) {
		super();
		this.idPays = idPays;
		this.code = code;
		this.designation = designation;
	}



	public String getIdVille() {
        return idVille;
    }

    public void setIdVille(String idVille) {
        this.idVille = idVille;
    }

    public String getIdPays() {
        return idPays;
    }

    public void setIdPays(String idPays) {
        this.idPays = idPays;
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
}
