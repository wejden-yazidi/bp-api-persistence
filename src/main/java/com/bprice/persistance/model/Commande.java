package com.bprice.persistance.model;

import java.util.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by ahmed on 25/01/2020.
 */
@Document(collection = "commande")
public class Commande {
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
	private Short isNumReinsial;
	private String statut;
	private Double remiseTot;
	private Short isRemise;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateLivraison;
	
	private Double estimationLivraison;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateEndPrepare;
	
	
	private List<Client> clients;
	
	private String adresse;
	
	private String idLivreur;
	
	private String nomPrenomLivreur;
	
	private String typeRemise;

	public Commande() {

	}

	public Commande(String idSession, Double montant, Date dateGeneration, Date dateCreation, Short fPaye,
			Integer numTicket, String idPointVente, Short isForClient, Double reste) {
		super();
		this.idSession = idSession;
		this.montant = montant;
		this.dateGeneration = dateGeneration;
		this.dateCreation = dateCreation;
		this.fPaye = fPaye;
		this.numCommande = numTicket;
		this.idPointVente = idPointVente;
		this.isForClient = isForClient;
		this.reste = reste;
	}

	public String getIdSession() {
		return idSession;
	}

	public void setIdSession(String idSession) {
		this.idSession = idSession;
	}

	public Double getMontant() {
		return montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}

	public Date getDateGeneration() {
		return dateGeneration;
	}

	public void setDateGeneration(Date dateGeneration) {
		this.dateGeneration = dateGeneration;
	}

	public Short getfPaye() {
		return fPaye;
	}

	public void setfPaye(Short fPaye) {
		this.fPaye = fPaye;
	}

	public String getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(String idCommande) {
		this.idCommande = idCommande;
	}

	public Integer getNumCommande() {
		return numCommande;
	}

	public void setNumCommande(Integer numCommande) {
		this.numCommande = numCommande;
	}

	public String getIdPointVente() {
		return idPointVente;
	}

	public void setIdPointVente(String idPointVente) {
		this.idPointVente = idPointVente;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Short getIsForClient() {
		return isForClient;
	}

	public void setIsForClient(Short isForClient) {
		this.isForClient = isForClient;
	}

	public Double getReste() {
		return reste;
	}

	public void setReste(Double reste) {
		this.reste = reste;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public String getIdTable() {
		return idTable;
	}

	public void setIdTable(String idTable) {
		this.idTable = idTable;
	}

	public Integer getNumTable() {
		return numTable;
	}

	public void setNumTable(Integer numTable) {
		this.numTable = numTable;
	}

	public Short getIsAnnule() {
		return isAnnule;
	}

	public void setIsAnnule(Short isAnnule) {
		this.isAnnule = isAnnule;
	}

	public String getIdMessageCommande() {
		return idMessageCommande;
	}

	public void setIdMessageCommande(String idMessageCommande) {
		this.idMessageCommande = idMessageCommande;
	}

	public String getTypeCommande() {
		return typeCommande;
	}

	public void setTypeCommande(String typeCommande) {
		this.typeCommande = typeCommande;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public Date getDateLivraison() {
		return dateLivraison;
	}

	public void setDateLivraison(Date dateLivraison) {
		this.dateLivraison = dateLivraison;
	}

	public Double getEstimationLivraison() {
		return estimationLivraison;
	}

	public void setEstimationLivraison(Double estimationLivraison) {
		this.estimationLivraison = estimationLivraison;
	}

	public Date getDateEndPrepare() {
		return dateEndPrepare;
	}

	public void setDateEndPrepare(Date dateEndPrepare) {
		this.dateEndPrepare = dateEndPrepare;
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

	public Short getIsNumReinsial() {
		return isNumReinsial;
	}

	public void setIsNumReinsial(Short isNumReinsial) {
		this.isNumReinsial = isNumReinsial;
	}

	public Double getRemiseTot() {
		return remiseTot;
	}

	public void setRemiseTot(Double remiseTot) {
		this.remiseTot = remiseTot;
	}

	public Short getIsRemise() {
		return isRemise;
	}

	public void setIsRemise(Short isRemise) {
		this.isRemise = isRemise;
	}

	public String getTypeRemise() {
		return typeRemise;
	}

	public void setTypeRemise(String typeRemise) {
		this.typeRemise = typeRemise;
	}


	

}
