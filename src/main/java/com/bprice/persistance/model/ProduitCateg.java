package com.bprice.persistance.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;

/**
 * Created by ahmed on 25/01/2020.
 */
@Document(collection = "produitCateg")
public class ProduitCateg {
    @Id
    @GeneratedValue(generator = "String2")
    private String idProduitCateg;
    private String idCateg;
    private String idProduit;

    public ProduitCateg() {
    }

    public String getIdProduitCateg() {
        return idProduitCateg;
    }

    public void setIdProduitCateg(String idProduitCateg) {
        this.idProduitCateg = idProduitCateg;
    }

    public String getIdCateg() {
        return idCateg;
    }

    public void setIdCateg(String idCateg) {
        this.idCateg = idCateg;
    }

    public String getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(String idProduit) {
        this.idProduit = idProduit;
    }
}
