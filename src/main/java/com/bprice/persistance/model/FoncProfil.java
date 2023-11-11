package com.bprice.persistance.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;


/**
 * Created by ahmed on 25/01/2020.
 */
@Document(collection = "foncProfil")
public class FoncProfil {
    @org.springframework.data.annotation.Id
    @GeneratedValue(generator = "String2")
    private String idFoncProfil;
    private String idProfil;
    private String idFonc;

    public FoncProfil() {
    }

    public String getIdFoncProfil() {
        return idFoncProfil;
    }

    public void setIdFoncProfil(String idFoncProfil) {
        this.idFoncProfil = idFoncProfil;
    }

    public String getIdProfil() {
        return idProfil;
    }

    public void setIdProfil(String idProfil) {
        this.idProfil = idProfil;
    }

    public String getIdFonc() {
        return idFonc;
    }

    public void setIdFonc(String idFonc) {
        this.idFonc = idFonc;
    }
}
