package com.bprice.persistance.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Document(collection = "commande_pointVente_caisse_journee_view")
public class CommandePointVenteCaisseJourneeView {

    @Id
    private String idCommande;
    private String idSession;
    private Float montant;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateGeneration;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    private Short fPaye;
    private Integer numCommande;
    private String idPointVente;
    private Short isForClient;
    private Float reste;
    private PointVente pointVente;
    private Caisse caisse;
    private Journee journee;

    public CommandePointVenteCaisseJourneeView() {
    }

 

    public String getIdCommande() {
		return idCommande;
	}



	public void setIdCommande(String idCommande) {
		this.idCommande = idCommande;
	}



	public String getIdSession() {
        return idSession;
    }

    public void setIdSession(String idSession) {
        this.idSession = idSession;
    }

    public Float getMontant() {
        return montant;
    }

    public void setMontant(Float montant) {
        this.montant = montant;
    }

    public Date getDateGeneration() {
        return dateGeneration;
    }

    public void setDateGeneration(Date dateGeneration) {
        this.dateGeneration = dateGeneration;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Short getfPaye() {
        return fPaye;
    }

    public void setfPaye(Short fPaye) {
        this.fPaye = fPaye;
    }

    public Integer getNumCommande() {
        return numCommande;
    }

    public void setNumCommande(Integer numCommande) {
        this.numCommande = numCommande;
    }

    public Float getReste() {
        return reste;
    }

    public void setReste(Float reste) {
        this.reste = reste;
    }

    public String getIdPointVente() {
        return idPointVente;
    }

    public void setIdPointVente(String idPointVente) {
        this.idPointVente = idPointVente;
    }

    public Short getIsForClient() {
        return isForClient;
    }

    public void setIsForClient(Short isForClient) {
        this.isForClient = isForClient;
    }

    public PointVente getPointVente() {
        return pointVente;
    }

    public void setPointVente(PointVente pointVente) {
        this.pointVente = pointVente;
    }

    public Caisse getCaisse() {
        return caisse;
    }

    public void setCaisse(Caisse caisse) {
        this.caisse = caisse;
    }

    public Journee getJournee() {
        return journee;
    }

    public void setJournee(Journee journee) {
        this.journee = journee;
    }
}
