/*
 * creer par Oussama dridi 2 mai 2021
 */
package com.bprice.persistance.model;

import java.util.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "CommandeCommandeDetail")
public class CommandeCommandeDetail {
	@Id
	@GeneratedValue(generator = "String2")
	private String idCommande;
	private String idSession;
	private Double montant;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateGeneration;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation;
	private Short fPaye;
	private Integer numCommande;
	private String idPointVente;
	private Short isForClient;
	private Double reste;
	private String idTable;
	private Integer numTable;
	private Short isAnnule;
	private String idMessageCommande;
	private String typeCommande;

	private String statut;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateLivraison;

	private Double estimationLivraison;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateEndPrepare;

	private List<Client> clients;

	private Commande commande;

	private List<CommandeDetailsProduit> commandeDetails;
	
	private Session session;
	
	private String adresse;
	
	private String idLivreur;
	
	private String nomPrenomLivreur;

	public String getIdCommande() {
		return idCommande;
	}

	public String getIdSession() {
		return idSession;
	}

	public Double getMontant() {
		return montant;
	}

	public Date getDateGeneration() {
		return dateGeneration;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public Short getfPaye() {
		return fPaye;
	}

	public Integer getNumCommande() {
		return numCommande;
	}

	public String getIdPointVente() {
		return idPointVente;
	}

	public Short getIsForClient() {
		return isForClient;
	}

	public Double getReste() {
		return reste;
	}

	public String getIdTable() {
		return idTable;
	}

	public Integer getNumTable() {
		return numTable;
	}

	public Short getIsAnnule() {
		return isAnnule;
	}

	public String getIdMessageCommande() {
		return idMessageCommande;
	}

	public String getTypeCommande() {
		return typeCommande;
	}

	public String getStatut() {
		return statut;
	}

	public Date getDateLivraison() {
		return dateLivraison;
	}

	public Double getEstimationLivraison() {
		return estimationLivraison;
	}

	public Date getDateEndPrepare() {
		return dateEndPrepare;
	}

	public List<Client> getClients() {
		return clients;
	}

	public Commande getCommande() {
		return commande;
	}

	public List<CommandeDetailsProduit> getCommandeDetails() {
		return commandeDetails;
	}

	public void setIdCommande(String idCommande) {
		this.idCommande = idCommande;
	}

	public void setIdSession(String idSession) {
		this.idSession = idSession;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}

	public void setDateGeneration(Date dateGeneration) {
		this.dateGeneration = dateGeneration;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public void setfPaye(Short fPaye) {
		this.fPaye = fPaye;
	}

	public void setNumCommande(Integer numCommande) {
		this.numCommande = numCommande;
	}

	public void setIdPointVente(String idPointVente) {
		this.idPointVente = idPointVente;
	}

	public void setIsForClient(Short isForClient) {
		this.isForClient = isForClient;
	}

	public void setReste(Double reste) {
		this.reste = reste;
	}

	public void setIdTable(String idTable) {
		this.idTable = idTable;
	}

	public void setNumTable(Integer numTable) {
		this.numTable = numTable;
	}

	public void setIsAnnule(Short isAnnule) {
		this.isAnnule = isAnnule;
	}

	public void setIdMessageCommande(String idMessageCommande) {
		this.idMessageCommande = idMessageCommande;
	}

	public void setTypeCommande(String typeCommande) {
		this.typeCommande = typeCommande;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public void setDateLivraison(Date dateLivraison) {
		this.dateLivraison = dateLivraison;
	}

	public void setEstimationLivraison(Double estimationLivraison) {
		this.estimationLivraison = estimationLivraison;
	}

	public void setDateEndPrepare(Date dateEndPrepare) {
		this.dateEndPrepare = dateEndPrepare;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public void setCommandeDetails(List<CommandeDetailsProduit> commandeDetails) {
		this.commandeDetails = commandeDetails;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public String getAdresse() {
		return adresse;
	}

	public String getIdLivreur() {
		return idLivreur;
	}

	public String getNomPrenomLivreur() {
		return nomPrenomLivreur;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public void setIdLivreur(String idLivreur) {
		this.idLivreur = idLivreur;
	}

	public void setNomPrenomLivreur(String nomPrenomLivreur) {
		this.nomPrenomLivreur = nomPrenomLivreur;
	}

	
	
}
