package com.bprice.persistance.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Created by ahmed on 25/01/2020.
 */
@Document(collection = "reglesFidelite")
public class ReglesFideliteProduit {
    @Id
    @GeneratedValue(generator = "String2")
    private String idRegle;
    private String idPack;
    private String idProduit;
    private Double quantite;
    private Short fPourcentage;
    private Double valeur;
    private Integer palMontantMin;
    private Integer palMontatntMax;
    private List<JoursRegle> joursUtilisation;
    private String typeFid;
    private List<PointVente> pointsVentes;
    private String idPartenaireBprice;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDebut;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFin;
    private Short fAutorisGerant;
    private Short fMoinsCherGratuit;
    private List<ProduitAndQte> produitsCombines;
    private short isActif;

    public ReglesFideliteProduit() {
    }
    
    



	public ReglesFideliteProduit(String idPack, String idProduit, Double quantite, Short fPourcentage, Double valeur,
			Integer palMontantMin, Integer palMontatntMax, List<JoursRegle> joursUtilisation, String typeFid,
			List<PointVente> pointsVentes, String idPartenaireBprice, Date dateDebut, Date dateFin,
			Short fAutorisGerant, Short fMoinsCherGratuit, List<ProduitAndQte> produitsCombines) {
		super();
		this.idPack = idPack;
		this.idProduit = idProduit;
		this.quantite = quantite;
		this.fPourcentage = fPourcentage;
		this.valeur = valeur;
		this.palMontantMin = palMontantMin;
		this.palMontatntMax = palMontatntMax;
		this.joursUtilisation = joursUtilisation;
		this.typeFid = typeFid;
		this.pointsVentes = pointsVentes;
		this.idPartenaireBprice = idPartenaireBprice;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.fAutorisGerant = fAutorisGerant;
		this.fMoinsCherGratuit = fMoinsCherGratuit;
		this.produitsCombines = produitsCombines;
	}





	public String getIdRegle() {
        return idRegle;
    }

    public void setIdRegle(String idRegle) {
        this.idRegle = idRegle;
    }

    public String getIdPack() {
        return idPack;
    }

    public void setIdPack(String idPack) {
        this.idPack = idPack;
    }

    public String getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(String idProduit) {
        this.idProduit = idProduit;
    }

    public Double getQuantite() {
        return quantite;
    }

    public void setQuantite(Double quantite) {
        this.quantite = quantite;
    }

    public Short getfPourcentage() {
        return fPourcentage;
    }

    public void setfPourcentage(Short fPourcentage) {
        this.fPourcentage = fPourcentage;
    }

    public Double getValeur() {
        return valeur;
    }

    public void setValeur(Double valeur) {
        this.valeur = valeur;
    }

    public Integer getPalMontantMin() {
        return palMontantMin;
    }

    public void setPalMontantMin(Integer palMontantMin) {
        this.palMontantMin = palMontantMin;
    }

    public Integer getPalMontatntMax() {
        return palMontatntMax;
    }

    public void setPalMontatntMax(Integer palMontatntMax) {
        this.palMontatntMax = palMontatntMax;
    }



	public List<JoursRegle> getJoursUtilisation() {
		return joursUtilisation;
	}



	public void setJoursUtilisation(List<JoursRegle> joursUtilisation) {
		this.joursUtilisation = joursUtilisation;
	}



	public String getTypeFid() {
		return typeFid;
	}



	public void setTypeFid(String typeFid) {
		this.typeFid = typeFid;
	}



	public List<PointVente> getPointsVentes() {
		return pointsVentes;
	}



	public void setPointsVentes(List<PointVente> pointsVentes) {
		this.pointsVentes = pointsVentes;
	}



	public String getIdPartenaireBprice() {
		return idPartenaireBprice;
	}



	public void setIdPartenaireBprice(String idPartenaireBprice) {
		this.idPartenaireBprice = idPartenaireBprice;
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



	public Short getfAutorisGerant() {
		return fAutorisGerant;
	}



	public void setfAutorisGerant(Short fAutorisGerant) {
		this.fAutorisGerant = fAutorisGerant;
	}



	public Short getfMoinsCherGratuit() {
		return fMoinsCherGratuit;
	}



	public void setfMoinsCherGratuit(Short fMoinsCherGratuit) {
		this.fMoinsCherGratuit = fMoinsCherGratuit;
	}



	public List<ProduitAndQte> getProduitsCombines() {
		return produitsCombines;
	}



	public void setProduitsCombines(List<ProduitAndQte> produitsCombines) {
		this.produitsCombines = produitsCombines;
	}





	public short getIsActif() {
		return isActif;
	}





	public void setIsActif(short isActif) {
		this.isActif = isActif;
	}






    
}
