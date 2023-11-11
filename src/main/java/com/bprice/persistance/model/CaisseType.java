package com.bprice.persistance.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;


/**
 * Created by ahmed on 25/01/2020.
 */
@Document(collection = "caisseType")
public class CaisseType {
    @Id
    @GeneratedValue(generator = "String2")
    private String idTypeCaisse;
    private String code;
    private String designation;


    public String getIdTypeCaisse() {
        return idTypeCaisse;
    }

    public void setIdTypeCaisse(String idTypeCaisse) {
        this.idTypeCaisse = idTypeCaisse;
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
