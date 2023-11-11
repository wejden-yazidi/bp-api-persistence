/*
 * creer par Oussama dridi 30 nov. 2020
 */
package com.bprice.persistance.model;

import java.util.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "MessageCommande_view")
public class MessageCommandeView {
    @Id
    @GeneratedValue(generator = "String2")
    private String idMessage;
    private String idPointVente;
    private String idPartenaire;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateEnvoie;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTraite;
    private String body;
    private String idClientPartenaire;
    private String nom;
    private String prenom;
    private String ntel;
    private Short ftraite;
    private List<CommandeDetails> details;
    private Double total;
    private Commande commande;
    
	public MessageCommandeView() {
		super();
	}
	public String getIdMessage() {
		return idMessage;
	}
	public void setIdMessage(String idMessage) {
		this.idMessage = idMessage;
	}
	public String getIdPointVente() {
		return idPointVente;
	}
	public void setIdPointVente(String idPointVente) {
		this.idPointVente = idPointVente;
	}
	public String getIdPartenaire() {
		return idPartenaire;
	}
	public void setIdPartenaire(String idPartenaire) {
		this.idPartenaire = idPartenaire;
	}
	public Date getDateEnvoie() {
		return dateEnvoie;
	}
	public void setDateEnvoie(Date dateEnvoie) {
		this.dateEnvoie = dateEnvoie;
	}
	public Date getDateTraite() {
		return dateTraite;
	}
	public void setDateTraite(Date dateTraite) {
		this.dateTraite = dateTraite;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getIdClientPartenaire() {
		return idClientPartenaire;
	}
	public void setIdClientPartenaire(String idClientPartenaire) {
		this.idClientPartenaire = idClientPartenaire;
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
	public String getNtel() {
		return ntel;
	}
	public void setNtel(String ntel) {
		this.ntel = ntel;
	}
	public Short getFtraite() {
		return ftraite;
	}
	public void setFtraite(Short ftraite) {
		this.ftraite = ftraite;
	}
	public List<CommandeDetails> getDetails() {
		return details;
	}
	public void setDetails(List<CommandeDetails> details) {
		this.details = details;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
    
    
    

}
