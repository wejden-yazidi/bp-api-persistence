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
@Document(collection = "VReservationTable")
public class VReservationTable {
	
	@Id
	@GeneratedValue(generator = "String2")
	private String idReservation;
	private String idConsommateur;
	private String idTable;
	private String idSession;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateReseravation;
	private Integer nbrPers;
	private Short fTraite;
	private String src;
	private String idEmployeeService;
	private String idPointVente;
	List<ProduitAndQte> produitsQtes;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateFinReseravation;	
	private TableCaisse tableCaisse;
	private Utilisateur employee;
	private String  nom;
	private String prenom;
	private String nTel;
	private String qrCode;
	private String commentaire;

	public VReservationTable() {
	}

	public VReservationTable(String idConsommateur, String idTable, String idSession, Date dateReseravation, Integer nbrPers,
			Short fTraite, String src, String idEmployeeService, String idPointVente) {
		super();
		this.idConsommateur = idConsommateur;
		this.idTable = idTable;
		this.idSession = idSession;
		this.dateReseravation = dateReseravation;
		this.nbrPers = nbrPers;
		this.fTraite = fTraite;
		this.src = src;
		this.idEmployeeService = idEmployeeService;
		this.idPointVente = idPointVente;
	}

	public String getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(String idReservation) {
		this.idReservation = idReservation;
	}

	public String getIdConsommateur() {
		return idConsommateur;
	}

	public void setIdConsommateur(String idConsommateur) {
		this.idConsommateur = idConsommateur;
	}

	public String getIdTable() {
		return idTable;
	}

	public void setIdTable(String idTable) {
		this.idTable = idTable;
	}

	public String getIdSession() {
		return idSession;
	}

	public void setIdSession(String idSession) {
		this.idSession = idSession;
	}

	public Date getDateReseravation() {
		return dateReseravation;
	}

	public void setDateReseravation(Date dateReseravation) {
		this.dateReseravation = dateReseravation;
	}

	public Integer getNbrPers() {
		return nbrPers;
	}

	public void setNbrPers(Integer nbrPers) {
		this.nbrPers = nbrPers;
	}

	public Short getfTraite() {
		return fTraite;
	}

	public void setfTraite(Short fTraite) {
		this.fTraite = fTraite;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getIdEmployeeService() {
		return idEmployeeService;
	}

	public void setIdEmployeeService(String idEmployeeService) {
		this.idEmployeeService = idEmployeeService;
	}

	public String getIdPointVente() {
		return idPointVente;
	}

	public void setIdPointVente(String idPointVente) {
		this.idPointVente = idPointVente;
	}

	public List<ProduitAndQte> getProduitsQtes() {
		return produitsQtes;
	}

	public void setProduitsQtes(List<ProduitAndQte> produitsQtes) {
		this.produitsQtes = produitsQtes;
	}

	public Date getDateFinReseravation() {
		return dateFinReseravation;
	}

	public void setDateFinReseravation(Date dateFinReseravation) {
		this.dateFinReseravation = dateFinReseravation;
	}

	public TableCaisse getTableCaisse() {
		return tableCaisse;
	}

	public void setTableCaisse(TableCaisse tableCaisse) {
		this.tableCaisse = tableCaisse;
	}

	public Utilisateur getEmployee() {
		return employee;
	}

	public void setEmployee(Utilisateur employee) {
		this.employee = employee;
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

	public String getnTel() {
		return nTel;
	}

	public void setnTel(String nTel) {
		this.nTel = nTel;
	}

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	
	
	
	
	
	
}
