package com.bprice.persistance.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import java.util.List;

@Document(collection = "produitpointvente_mvtstock_view")
public class ProduitpointventeMvtstockView {
    @org.springframework.data.annotation.Id
    @GeneratedValue(generator = "String2")
    private String _id;
    private String idProduit;
    private String idPointVente;
    private Double prix;
    private Double stockReel;
    private Produit produit;
    private List<MvtStockEntrant> mvts;
    private List<MvtStockEntrant> mvtEntrant;

    public ProduitpointventeMvtstockView() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
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

    public List<MvtStockEntrant> getMvts() {
        return mvts;
    }

    public void setMvts(List<MvtStockEntrant> mvts) {
        this.mvts = mvts;
    }

    public List<MvtStockEntrant> getMvtEntrant() {
        return mvtEntrant;
    }

    public void setMvtEntrant(List<MvtStockEntrant> mvtEntrant) {
        this.mvtEntrant = mvtEntrant;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }
}
