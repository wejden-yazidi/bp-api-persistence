package com.bprice.persistance.model;

import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

import javax.persistence.GeneratedValue;


/**
 * Created by ahmed on 25/01/2020.
 */
@Document(collection = "categorieArticle")
public class CategorieArticle {
    @Id
    @GeneratedValue(generator = "String2")
    private String idCategorie;
    private String idPartenaire;
    private String idCetgorieMere;
    private String designation;
    private String description;
    private String photo;
    private Date dateCreation;
    private Short fActif;
    private String couleur;
    private Integer order;
    private Short fMobile;

    public Short getfMobile() {
        return fMobile;
    }

    public void setfMobile(Short fMobile) {
        this.fMobile = fMobile;
    }

    public CategorieArticle() {
    }

    public CategorieArticle(String idPartenaire, String idCetgorieMere, String designation, String photo, Short fActif) {
        this.idPartenaire = idPartenaire;
        this.idCetgorieMere = idCetgorieMere;
        this.designation = designation;
        this.photo = photo;
        this.fActif = fActif;
    }

    public String getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(String idCategorie) {
        this.idCategorie = idCategorie;
    }


    public String getIdPartenaire() {
        return idPartenaire;
    }

    public void setIdPartenaire(String idPartenaire) {
        this.idPartenaire = idPartenaire;
    }

    public String getIdCetgorieMere() {
        return idCetgorieMere;
    }

    public void setIdCetgorieMere(String idCetgorieMere) {
        this.idCetgorieMere = idCetgorieMere;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Short getfActif() {
        return fActif;
    }

    public void setfActif(Short fActif) {
        this.fActif = fActif;
    }

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }
}
