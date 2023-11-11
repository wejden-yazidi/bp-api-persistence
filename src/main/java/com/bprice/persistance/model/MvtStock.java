package com.bprice.persistance.model;


import javax.persistence.GeneratedValue;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by ahmed on 25/01/2020.
 */
@Document(collection = "mvtStock")
public class MvtStock {
    @Id
    @GeneratedValue(generator = "String2")
    private String idMvt;
    private String idProduitProintVente;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateMvt;
    private Integer quantite;
    private Double valeur;
    private String sens;
    private String idCaisseEn;
    private String idUser;
    private String idFournisseur;
    private String idPointVenteSource;
    private String idPointVenteDest;
    private String motif;
    private String type;
    private Boolean isConversion;
    private String mesureConversion;
    private Double qteConversion;
    private Double prixVente;
    private Boolean isGenereBail;

    public MvtStock() {
    }

	public MvtStock(String idProduitProintVente, Date dateMvt, Integer quantite, Double valeur, String sens,
			String idCaisseEn, String idUser, String idFournisseur, String idPointVenteSource, String idPointVenteDest,
			String motif, String type) {
		super();
		this.idProduitProintVente = idProduitProintVente;
		this.dateMvt = dateMvt;
		this.quantite = quantite;
		this.valeur = valeur;
		this.sens = sens;
		this.idCaisseEn = idCaisseEn;
		this.idUser = idUser;
		this.idFournisseur = idFournisseur;
		this.idPointVenteSource = idPointVenteSource;
		this.idPointVenteDest = idPointVenteDest;
		this.motif = motif;
		this.type = type;
	}

	public String getIdMvt() {
		return idMvt;
	}

	public void setIdMvt(String idMvt) {
		this.idMvt = idMvt;
	}

	public String getIdProduitProintVente() {
		return idProduitProintVente;
	}

	public void setIdProduitProintVente(String idProduitProintVente) {
		this.idProduitProintVente = idProduitProintVente;
	}

	public Date getDateMvt() {
		return dateMvt;
	}

	public void setDateMvt(Date dateMvt) {
		this.dateMvt = dateMvt;
	}

	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}

	public Double getValeur() {
		return valeur;
	}

	public void setValeur(Double valeur) {
		this.valeur = valeur;
	}

	public String getSens() {
		return sens;
	}

	public void setSens(String sens) {
		this.sens = sens;
	}

	public String getIdCaisseEn() {
		return idCaisseEn;
	}

	public void setIdCaisseEn(String idCaisseEn) {
		this.idCaisseEn = idCaisseEn;
	}

	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}

	public String getIdFournisseur() {
		return idFournisseur;
	}

	public void setIdFournisseur(String idFournisseur) {
		this.idFournisseur = idFournisseur;
	}

	public String getIdPointVenteSource() {
		return idPointVenteSource;
	}

	public void setIdPointVenteSource(String idPointVenteSource) {
		this.idPointVenteSource = idPointVenteSource;
	}

	public String getIdPointVenteDest() {
		return idPointVenteDest;
	}

	public void setIdPointVenteDest(String idPointVenteDest) {
		this.idPointVenteDest = idPointVenteDest;
	}

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getConversion() {
		return isConversion;
	}

	public void setConversion(Boolean conversion) {
		isConversion = conversion;
	}

	public String getMesureConversion() {
		return mesureConversion;
	}

	public void setMesureConversion(String mesureConversion) {
		this.mesureConversion = mesureConversion;
	}

	public Double getQteConversion() {
		return qteConversion;
	}

	public void setQteConversion(Double qteConversion) {
		this.qteConversion = qteConversion;
	}

	public Double getPrixVente() {
		return prixVente;
	}

	public void setPrixVente(Double prixVente) {
		this.prixVente = prixVente;
	}

	public Boolean getGenereBail() {
		return isGenereBail;
	}

	public void setGenereBail(Boolean genereBail) {
		isGenereBail = genereBail;
	}
}
