package com.bprice.persistance.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;

/**
 * Created by ahmed on 04/03/2020.
 */
@Document(collection = "produitpointvente")
public class ProduitPointVente {
    @Id
    @GeneratedValue(generator = "String2")
    private String idproduitPointVente;
    private String idProduit ;
    private String idPointVente  ;
    private Double prix   ;
    private Double stockReel    ;

    public ProduitPointVente() {
    }

    public String getIdproduitPointVente() {
        return idproduitPointVente;
    }

    public void setIdproduitPointVente(String idproduitPointVente) {
        this.idproduitPointVente = idproduitPointVente;
    }

    public String getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(String idProduit) {
        this.idProduit = idProduit;
    }

    public String getIdPointVente() {
        return idPointVente;
    }

    public void setIdPointVente(String idPointVente) {
        this.idPointVente = idPointVente;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Double getStockReel() {
        return stockReel;
    }

    public void setStockReel(Double stockReel) {
        this.stockReel = stockReel;
    }
}
