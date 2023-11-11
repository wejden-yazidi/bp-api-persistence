package com.bprice.persistance.model;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by ahmed on 25/01/2020.
 */
@Document(collection = "fonc")
public class Fonc {
    @Id
    @GeneratedValue(generator = "String2")
    private String idFonc;
    private String idFoncParent;
    private String designation;
    private String code;
    private String url;
    private Short fBprice;

    public Fonc() {
    }

    public String getIdFonc() {
        return idFonc;
    }

    public void setIdFonc(String idFonc) {
        this.idFonc = idFonc;
    }

    public String getIdFoncParent() {
        return idFoncParent;
    }

    public void setIdFoncParent(String idFoncParent) {
        this.idFoncParent = idFoncParent;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Short getfBprice() {
        return fBprice;
    }

    public void setfBprice(Short fBprice) {
        this.fBprice = fBprice;
    }
}
