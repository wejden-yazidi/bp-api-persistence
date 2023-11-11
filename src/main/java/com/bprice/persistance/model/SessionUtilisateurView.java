/*
 * creer par Oussama dridi 15 avr. 2020
 */
package com.bprice.persistance.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sessionUtilisateurView")
public class SessionUtilisateurView {
	@Id
	@GeneratedValue(generator = "String2")
	private String idSession;
	private String idUtilisateur;
	private String idJournee;
	private String idCaisse;
	private Double montantOuverture;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateDebut;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateFin;
	private Short fFerme;
	private Float montantTiroirCalculeSystem;
	private Float montantCloture;
	private Float ChiffreAffaireSession;
	private Utilisateur utilisateur;

	public SessionUtilisateurView() {
		super();
	}

	public String getIdSession() {
		return idSession;
	}

	public void setIdSession(String idSession) {
		this.idSession = idSession;
	}

	public String getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(String idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getIdJournee() {
		return idJournee;
	}

	public void setIdJournee(String idJournee) {
		this.idJournee = idJournee;
	}

	public String getIdCaisse() {
		return idCaisse;
	}

	public void setIdCaisse(String idCaisse) {
		this.idCaisse = idCaisse;
	}

	public Double getMontantOuverture() {
		return montantOuverture;
	}

	public void setMontantOuverture(Double montantOuverture) {
		this.montantOuverture = montantOuverture;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public Short getfFerme() {
		return fFerme;
	}

	public void setfFerme(Short fFerme) {
		this.fFerme = fFerme;
	}

	public Float getMontantTiroirCalculeSystem() {
		return montantTiroirCalculeSystem;
	}

	public void setMontantTiroirCalculeSystem(Float montantTiroirCalculeSystem) {
		this.montantTiroirCalculeSystem = montantTiroirCalculeSystem;
	}

	public Float getMontantCloture() {
		return montantCloture;
	}

	public void setMontantCloture(Float montantCloture) {
		this.montantCloture = montantCloture;
	}

	public Float getChiffreAffaireSession() {
		return ChiffreAffaireSession;
	}

	public void setChiffreAffaireSession(Float chiffreAffaireSession) {
		ChiffreAffaireSession = chiffreAffaireSession;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

}
