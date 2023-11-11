package com.bprice.persistance.model;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by ahmed on 25/01/2020.
 */
@Document(collection = "Composition")
public class Composition {
    @Id
    @GeneratedValue(generator = "String2")
    private String idComposition;
    private String idProduit;
    private String designation;

    public Composition() {
    }

    public String getIdComposition() {
        return idComposition;
    }

    public void setIdComposition(String idComposition) {
        this.idComposition = idComposition;
    }

    public String getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(String idProduit) {
        this.idProduit = idProduit;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
