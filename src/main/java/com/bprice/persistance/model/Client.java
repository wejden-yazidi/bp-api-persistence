package com.bprice.persistance.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by ahmed on 25/01/2020.
 */
@Document(collection = "client")
public class Client {
    @Id
    @GeneratedValue(generator = "String2")
    private String idClient;
    private String nom;
    private String prenom;
    private String cin;
    private Date dateNaissance;
    private String genre;
    private String email;
    private String nTel;
    private Short fActive;
    private String type; //PP : personne physique / PM P.morale
    private String matfiscale;
    private String raisonsocial;
    private String numpatente;
    private String siegesocial;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    private String qrCodeBprice;
    private Double soldeBprice;
    private String adress;

    public Client() {
    }

    public Client(String nom, String prenom, String cin, Date dateNaissance, String genre, String email, String nTel, Short fActive, Timestamp dateCreation,String qrCodeBprice) {
        this.nom = nom;
        this.prenom = prenom;
        
        this.dateNaissance = dateNaissance;
        this.genre = genre;
        this.email = email;
        this.nTel = nTel;
        this.fActive = fActive;
      
        this.dateCreation = dateCreation;
        this.qrCodeBprice=qrCodeBprice;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getnTel() {
        return nTel;
    }

    public void setnTel(String nTel) {
        this.nTel = nTel;
    }

    public Short getfActive() {
        return fActive;
    }

    public void setfActive(Short fActive) {
        this.fActive = fActive;
    }



    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

	public String getQrCodeBprice() {
		return qrCodeBprice;
	}

	public void setQrCodeBprice(String qrCodeBprice) {
		this.qrCodeBprice = qrCodeBprice;
	}

	public String getIdClient() {
		return idClient;
	}

	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}

	public Double getSoldeBprice() {
		return soldeBprice;
	}

	public void setSoldeBprice(Double soldeBprice) {
		this.soldeBprice = soldeBprice;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMatfiscale() {
		return matfiscale;
	}

	public void setMatfiscale(String matfiscale) {
		this.matfiscale = matfiscale;
	}

	public String getRaisonsocial() {
		return raisonsocial;
	}

	public void setRaisonsocial(String raisonsocial) {
		this.raisonsocial = raisonsocial;
	}

	public String getNumpatente() {
		return numpatente;
	}

	public void setNumpatente(String numpatente) {
		this.numpatente = numpatente;
	}

	public String getSiegesocial() {
		return siegesocial;
	}

	public void setSiegesocial(String siegesocial) {
		this.siegesocial = siegesocial;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	


}
