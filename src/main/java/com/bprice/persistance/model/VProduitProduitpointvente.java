package com.bprice.persistance.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.List;

/**
 * Created by ahmed on 08/03/2020.
 */
@Document(collection = "v_produit_produitpointvente")
public class VProduitProduitpointvente {
    @Id
    private String idProduit;
    private String idCateg;
    private String idPartenaire;
    private String code;
    private String designation;
    private String description;
    private String composition;
    private Integer stockReel;
    private Integer stockAlert;
    private Integer stockQteDepart;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    private String ajoutePar;
    private String reference;
    private Double prixHt;
    private Double prixTtc;
    private String urlImg;
    private Short fVendu;
    private Short fAchete;
    private String typeProduit;
    private String codeBarre;
    private String referenceInterne;
    private Short fRacourci;
    private String couleur;
    private String mesure;
    private short FAutorisGerant;
    private Double tva;
    private ProduitPointVente produitpointvente;
	private List<Ingredient> ingredients;

    public VProduitProduitpointvente() {
    }

    public String getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(String idProduit) {
        this.idProduit = idProduit;
    }

    public String getIdCateg() {
        return idCateg;
    }

    public void setIdCateg(String idCateg) {
        this.idCateg = idCateg;
    }

    public String getIdPartenaire() {
        return idPartenaire;
    }

    public void setIdPartenaire(String idPartenaire) {
        this.idPartenaire = idPartenaire;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public Integer getStockReel() {
        return stockReel;
    }

    public void setStockReel(Integer stockReel) {
        this.stockReel = stockReel;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getAjoutePar() {
        return ajoutePar;
    }

    public void setAjoutePar(String ajoutePar) {
        this.ajoutePar = ajoutePar;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

 

    public Double getPrixHt() {
		return prixHt;
	}

	public void setPrixHt(Double prixHt) {
		this.prixHt = prixHt;
	}

	public Double getPrixTtc() {
		return prixTtc;
	}

	public void setPrixTtc(Double prixTtc) {
		this.prixTtc = prixTtc;
	}

	public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public Short getfVendu() {
        return fVendu;
    }

    public void setfVendu(Short fVendu) {
        this.fVendu = fVendu;
    }

    public Short getfAchete() {
        return fAchete;
    }

    public void setfAchete(Short fAchete) {
        this.fAchete = fAchete;
    }

    public String getTypeProduit() {
        return typeProduit;
    }

    public void setTypeProduit(String typeProduit) {
        this.typeProduit = typeProduit;
    }

    public String getCodeBarre() {
        return codeBarre;
    }

    public void setCodeBarre(String codeBarre) {
        this.codeBarre = codeBarre;
    }

    public String getReferenceInterne() {
        return referenceInterne;
    }

    public void setReferenceInterne(String referenceInterne) {
        this.referenceInterne = referenceInterne;
    }

    public Short getfRacourci() {
        return fRacourci;
    }

    public void setfRacourci(Short fRacourci) {
        this.fRacourci = fRacourci;
    }

    public ProduitPointVente getProduitpointvente() {
        return produitpointvente;
    }

    public void setProduitpointvente(ProduitPointVente produitpointvente) {
        this.produitpointvente = produitpointvente;
    }

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

    public Integer getStockAlert() {
        return stockAlert;
    }

    public void setStockAlert(Integer stockAlert) {
        this.stockAlert = stockAlert;
    }

    public Integer getStockQteDepart() {
        return stockQteDepart;
    }

    public void setStockQteDepart(Integer stockQteDepart) {
        this.stockQteDepart = stockQteDepart;
    }

    public String getMesure() {
        return mesure;
    }

    public void setMesure(String mesure) {
        this.mesure = mesure;
    }

    public short getFAutorisGerant() {
        return FAutorisGerant;
    }

    public void setFAutorisGerant(short FAutorisGerant) {
        this.FAutorisGerant = FAutorisGerant;
    }

    public Double getTva() {
        return tva;
    }

    public void setTva(Double tva) {
        this.tva = tva;
    }

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
    
}
