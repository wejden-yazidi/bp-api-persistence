package com.bprice.persistance.model;

import javax.persistence.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by ahmed on 25/01/2020.
 */
@Document(collection = "utilisateur")
public class Utilisateur {
    @Id
    @GeneratedValue(generator = "String2")
    private String idUtilisateur;
    private String idPointVente;
    private String idPartenaire;
    private String idProfil;
    private String idTypeUtilisateur;
    private String nom;
    private String prenom;
    private String login;
    private String password;
    private String email;
    private String matricule;
    private String identifiant;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    private Short fActif;
    private Short isvalidated;
    private String tel;
    private String adresse;
    private String sexe;
    private String idCard;
    private String tokenFB;
    private String image;
    private AccessPermissions accessPermissions;

    public Utilisateur() {
    }
    
    

    public Utilisateur(String idPartenaire, String idProfil, String idTypeUtilisateur, String nom, String prenom,
			String login, String password, String email, String matricule, String identifiant, Date dateCreation,
			Short fActif) {
		super();
		this.idPartenaire = idPartenaire;
		this.idProfil = idProfil;
		this.idTypeUtilisateur = idTypeUtilisateur;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
		this.email = email;
		this.matricule = matricule;
		this.identifiant = identifiant;
		this.dateCreation = dateCreation;
		this.fActif = fActif;
	}



	public String getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(String idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getIdPartenaire() {
        return idPartenaire;
    }

    public void setIdPartenaire(String idPartenaire) {
        this.idPartenaire = idPartenaire;
    }

    public String getIdProfil() {
        return idProfil;
    }

    public void setIdProfil(String idProfil) {
        this.idProfil = idProfil;
    }

    public String getIdTypeUtilisateur() {
        return idTypeUtilisateur;
    }

    public void setIdTypeUtilisateur(String idTypeUtilisateur) {
        this.idTypeUtilisateur = idTypeUtilisateur;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
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

    public String getIdPointVente() {
        return idPointVente;
    }

    public void setIdPointVente(String idPointVente) {
        this.idPointVente = idPointVente;
    }

    public Short getIsvalidated() {
        return isvalidated;
    }

    public void setIsvalidated(Short isvalidated) {
        this.isvalidated = isvalidated;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }



	public String getTokenFB() {
		return tokenFB;
	}



	public void setTokenFB(String tokenFB) {
		this.tokenFB = tokenFB;
	}



	public String getImage() {
		return image;
	}



	public void setImage(String image) {
		this.image = image;
	}



	public String getIdCard() {
		return idCard;
	}



	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

    public AccessPermissions getAccessPermissions() {
        return accessPermissions;
    }

    public void setAccessPermissions(AccessPermissions accessPermissions) {
        this.accessPermissions = accessPermissions;
    }
}
