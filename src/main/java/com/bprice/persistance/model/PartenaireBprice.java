package com.bprice.persistance.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



/**
 * Created by ahmed on 25/01/2020.
 */
@Document(collection = "partenaireBprice")
public class PartenaireBprice {
    @Id
    @GeneratedValue(generator = "String2")
    private String idPartenaire;
    private String idVille;
    private String idChart;
    private String idClientType;
    private String raisonSociale;
    private String abbreviation;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    private Short fActif;
    private String matriculeFiscale;
    private String adresse;
    private String nTel;
    private String siteWeb;
    private String devise;
    private String logo;
    private String idSector;
    private String senderKey;
    private String imagePanormaic;
    private String couleur1;
    private String couleur2;
    private String iconApp;
    private Short stockCentral;
    private String linkAppAndroid;
    private String linkAppiOs;    
    private BigDecimal lat;
    private BigDecimal lng;
    private String nomResponsable ;
    private String prenomResponsable ;
    private String emailResponsable ;
    
    
    public String getLinkAppAndroid() {
		return linkAppAndroid;
	}

	public void setLinkAppAndroid(String linkAppAndroid) {
		this.linkAppAndroid = linkAppAndroid;
	}

	public String getLinkAppiOs() {
		return linkAppiOs;
	}

	public void setLinkAppiOs(String linkAppiOs) {
		this.linkAppiOs = linkAppiOs;
	}

	public PartenaireBprice() {
    }

    public String getIdPartenaire() {
        return idPartenaire;
    }

    public void setIdPartenaire(String idPartenaire) {
        this.idPartenaire = idPartenaire;
    }

    public String getIdVille() {
        return idVille;
    }

    public void setIdVille(String idVille) {
        this.idVille = idVille;
    }

    public String getIdChart() {
        return idChart;
    }

    public void setIdChart(String idChart) {
        this.idChart = idChart;
    }

    public String getIdClientType() {
        return idClientType;
    }

    public void setIdClientType(String idClientType) {
        this.idClientType = idClientType;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Short getfActif() {
        return fActif;
    }

    public void setfActif(Short fActif) {
        this.fActif = fActif;
    }

    public String getMatriculeFiscale() {
        return matriculeFiscale;
    }

    public void setMatriculeFiscale(String matriculeFiscale) {
        this.matriculeFiscale = matriculeFiscale;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getnTel() {
        return nTel;
    }

    public void setnTel(String nTel) {
        this.nTel = nTel;
    }

    public String getSiteWeb() {
        return siteWeb;
    }

    public void setSiteWeb(String siteWeb) {
        this.siteWeb = siteWeb;
    }

    public String getDevise() {
        return devise;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getIdSector() {
        return idSector;
    }

    public void setIdSector(String idSector) {
        this.idSector = idSector;
    }

	public String getSenderKey() {
		return senderKey;
	}

	public void setSenderKey(String senderKey) {
		this.senderKey = senderKey;
	}

	public String getImagePanormaic() {
		return imagePanormaic;
	}

	public void setImagePanormaic(String imagePanormaic) {
		this.imagePanormaic = imagePanormaic;
	}

	public String getCouleur1() {
		return couleur1;
	}

	public void setCouleur1(String couleur1) {
		this.couleur1 = couleur1;
	}

	public String getCouleur2() {
		return couleur2;
	}

	public void setCouleur2(String couleur2) {
		this.couleur2 = couleur2;
	}

	public String getIconApp() {
		return iconApp;
	}

	public void setIconApp(String iconApp) {
		this.iconApp = iconApp;
	}

	public Short getStockCentral() {
		return stockCentral;
	}

	public void setStockCentral(Short stockCentral) {
		this.stockCentral = stockCentral;
	}

	public BigDecimal getLat() {
		return lat;
	}

	public void setLat(BigDecimal lat) {
		this.lat = lat;
	}

	public BigDecimal getLng() {
		return lng;
	}

	public void setLng(BigDecimal lng) {
		this.lng = lng;
	}

	public String getNomResponsable() {
		return nomResponsable;
	}

	public void setNomResponsable(String nomResponsable) {
		this.nomResponsable = nomResponsable;
	}

	public String getPrenomResponsable() {
		return prenomResponsable;
	}

	public void setPrenomResponsable(String prenomResponsable) {
		this.prenomResponsable = prenomResponsable;
	}

	public String getEmailResponsable() {
		return emailResponsable;
	}

	public void setEmailResponsable(String emailResponsable) {
		this.emailResponsable = emailResponsable;
	}
    
    
	
}
