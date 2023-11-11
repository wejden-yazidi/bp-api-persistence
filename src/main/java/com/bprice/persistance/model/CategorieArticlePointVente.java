package com.bprice.persistance.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;

/**
 * Created by ahmed on 29/03/2020.
 */
@Document(collection = "categorieArticlePointVente")
public class CategorieArticlePointVente {

    @Id
    @GeneratedValue(generator = "String2")
    private String idPointventeCateg;
    private String idCategArticle;
    private String idPointVente;
    private Short fVisible;

    public CategorieArticlePointVente() {
    }

    public String getIdPointventeCateg() {
        return idPointventeCateg;
    }

    public void setIdPointventeCateg(String idPointventeCateg) {
        this.idPointventeCateg = idPointventeCateg;
    }

    public String getIdCategArticle() {
        return idCategArticle;
    }

    public void setIdCategArticle(String idCategArticle) {
        this.idCategArticle = idCategArticle;
    }

    public String getIdPointVente() {
        return idPointVente;
    }

    public void setIdPointVente(String idPointVente) {
        this.idPointVente = idPointVente;
    }

    public Short getfVisible() {
        return fVisible;
    }

    public void setfVisible(Short fVisible) {
        this.fVisible = fVisible;
    }
}
