package com.bprice.persistance.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;

/**
 * Created by ahmed on 25/01/2020.
 */
@Document(collection = "montantOuverture")
public class MontantOuverture {

    @Id
    @GeneratedValue(generator = "String2")
    private String id;
    private String idSession;
    private Integer qteBillet;
    private Double valeur;

    public MontantOuverture() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdSession() {
        return idSession;
    }

    public void setIdSession(String idSession) {
        this.idSession = idSession;
    }

    public Integer getQteBillet() {
        return qteBillet;
    }

    public void setQteBillet(Integer qteBillet) {
        this.qteBillet = qteBillet;
    }

    public Double getValeur() {
        return valeur;
    }

    public void setValeur(Double valeur) {
        this.valeur = valeur;
    }
}
