/*
 * creer par Oussama dridi 14 févr. 2020
 */
package com.bprice.persistance.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.Id;

public class ClientPartenaire {
	@Id
	@GeneratedValue(generator = "String2")
	private String idClientPartenaire;
	private String idClient;
	private String idPartenaire;
	private String qrCodePartn;
	private Double soldePartn;
	private short isActif;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation;
	private String idJournee;
	private String nom;
	private String prenom;
	private Integer nbrAlimentationFidelite;
	private String tokenNotification;
	private String password;
	private short isconnected;
	private String srcCreation;
	private String idGroupeClientPartenaire;	
	private String raisonsocial;
	private String matfiscale;
	private String adress;
	private String image;


	public ClientPartenaire(String idClient, String idPartenaire, String qrCodePartn, Double soldePartn, short isActif,
			Date dateCreation, String idJournee, String nom, String prenom, String raisonsocial, String matfiscale, String adress ) {
		super();
		this.idClient = idClient;
		this.idPartenaire = idPartenaire;
		this.qrCodePartn = qrCodePartn;
		this.soldePartn = soldePartn;
		this.isActif = isActif;
		this.dateCreation = dateCreation;
		this.idJournee = idJournee;
		this.nom = nom;
		this.prenom = prenom;
		this.raisonsocial=raisonsocial;
		this.matfiscale=matfiscale;
		this.adress=adress;
	}
	
	public ClientPartenaire(){
		
	}

	public String getIdClientPartenaire() {
		return idClientPartenaire;
	}

	public void setIdClientPartenaire(String idClientPartenaire) {
		this.idClientPartenaire = idClientPartenaire;
	}

	public String getIdClient() {
		return idClient;
	}

	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}

	public String getIdPartenaire() {
		return idPartenaire;
	}

	public void setIdPartenaire(String idPartenaire) {
		this.idPartenaire = idPartenaire;
	}

	public String getQrCodePartn() {
		return qrCodePartn;
	}

	public void setQrCodePartn(String qrCodePartn) {
		this.qrCodePartn = qrCodePartn;
	}

	public Double getSoldePartn() {
		return soldePartn;
	}

	public void setSoldePartn(Double soldePartn) {
		this.soldePartn = soldePartn;
	}

	public short getIsActif() {
		return isActif;
	}

	public void setIsActif(short isActif) {
		this.isActif = isActif;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getIdJournee() {
		return idJournee;
	}

	public void setIdJournee(String idJournee) {
		this.idJournee = idJournee;
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

	public Integer getNbrAlimentationFidelite() {
		return nbrAlimentationFidelite;
	}

	public void setNbrAlimentationFidelite(Integer nbrAlimentationFidelite) {
		this.nbrAlimentationFidelite = nbrAlimentationFidelite;
	}

	public String getTokenNotification() {
		return tokenNotification;
	}

	public void setTokenNotification(String tokenNotification) {
		this.tokenNotification = tokenNotification;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public short getIsconnected() {
		return isconnected;
	}

	public void setIsconnected(short isconnected) {
		this.isconnected = isconnected;
	}

	public String getSrcCreation() {
		return srcCreation;
	}

	public void setSrcCreation(String srcCreation) {
		this.srcCreation = srcCreation;
	}

	public String getIdGroupeClientPartenaire() {
		return idGroupeClientPartenaire;
	}

	public void setIdGroupeClientPartenaire(String idGroupeClientPartenaire) {
		this.idGroupeClientPartenaire = idGroupeClientPartenaire;
	}

	public String getRaisonsocial() {
		return raisonsocial;
	}

	public void setRaisonsocial(String raisonsocial) {
		this.raisonsocial = raisonsocial;
	}

	public String getMatfiscale() {
		return matfiscale;
	}

	public void setMatfiscale(String matfiscale) {
		this.matfiscale = matfiscale;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
	
	



}
