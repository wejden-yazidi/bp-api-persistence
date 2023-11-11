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
@Document(collection = "pointVente")
public class PointVente {
    @Id
    @GeneratedValue(generator = "String2")
    private String idPointVente;
    private String idPartenaire;
    private String designation;
    private Short fActif;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    private String adresse;
    private Integer coordX;
    private Integer coordY;
    private Short fGestionTable;
    private Short fPhotoCateg;
    private Short fClavierVirtuel;
    private Short fImprimCuisine;
    private Short fReImprim;
    private Short fPartageAdition;
    private Short fEntetePied;
    private String enteteTicket;
    private String piedTicket;
    private Short fDetailMontant;
    private Short fAffectEmployetoservice;
    private Short fAutoriserRecharge;
    private String Chiffrevirgule;
    private String fReservation;
    private String typePv;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateMiseCirc;
    private Short farretVenteOnline;
    private Short fEcranCuisine;
    private Short fMobile;
    private Short fImpresCateg;
    private Short fDispCA;

    
    
    public Short getFdetectPack() {
		return fdetectPack;
	}

	public void setFdetectPack(Short fdetectPack) {
		this.fdetectPack = fdetectPack;
	}

	private Short fImprimeAvP;
    private Short fControlCaisse;
    private List<ModeReglement> modeReglements;
    private String defaultouverture;
    private String differenceautorise;
    private Short fprixttc;
    private Short faffectcollab;
    private Short fdetectPack;

    public PointVente() {
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Short getfActif() {
        return fActif;
    }

    public void setfActif(Short fActif) {
        this.fActif = fActif;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Integer getCoordX() {
        return coordX;
    }

    public void setCoordX(Integer coordX) {
        this.coordX = coordX;
    }

    public Integer getCoordY() {
        return coordY;
    }

    public void setCoordY(Integer coordY) {
        this.coordY = coordY;
    }

    public Short getfGestionTable() {
        return fGestionTable;
    }

    public void setfGestionTable(Short fGestionTable) {
        this.fGestionTable = fGestionTable;
    }

    public Short getfPhotoCateg() {
        return fPhotoCateg;
    }

    public void setfPhotoCateg(Short fPhotoCateg) {
        this.fPhotoCateg = fPhotoCateg;
    }

    public Short getfClavierVirtuel() {
        return fClavierVirtuel;
    }

    public void setfClavierVirtuel(Short fClavierVirtuel) {
        this.fClavierVirtuel = fClavierVirtuel;
    }

    public Short getfImprimCuisine() {
        return fImprimCuisine;
    }

    public void setfImprimCuisine(Short fImprimCuisine) {
        this.fImprimCuisine = fImprimCuisine;
    }

    public Short getfReImprim() {
        return fReImprim;
    }

    public void setfReImprim(Short fReImprim) {
        this.fReImprim = fReImprim;
    }

    public Short getfPartageAdition() {
        return fPartageAdition;
    }

    public void setfPartageAdition(Short fPartageAdition) {
        this.fPartageAdition = fPartageAdition;
    }

    public Short getfEntetePied() {
        return fEntetePied;
    }

    public void setfEntetePied(Short fEntetePied) {
        this.fEntetePied = fEntetePied;
    }

    public String getEnteteTicket() {
        return enteteTicket;
    }

    public void setEnteteTicket(String enteteTicket) {
        this.enteteTicket = enteteTicket;
    }

    public String getPiedTicket() {
        return piedTicket;
    }

    public void setPiedTicket(String piedTicket) {
        this.piedTicket = piedTicket;
    }

    public String getChiffrevirgule() {
        return Chiffrevirgule;
    }

    public void setChiffrevirgule(String chiffrevirgule) {
        Chiffrevirgule = chiffrevirgule;
    }


    public Short getfDetailMontant() {
        return fDetailMontant;
    }

    public void setfDetailMontant(Short fDetailMontant) {
        this.fDetailMontant = fDetailMontant;
    }


    public Short getfImprimeAvP() {
        return fImprimeAvP;
    }

    public void setfImprimeAvP(Short fImprimeAvP) {
        this.fImprimeAvP = fImprimeAvP;
    }

    public Short getfControlCaisse() {
        return fControlCaisse;
    }

    public void setfControlCaisse(Short fControlCaisse) {
        this.fControlCaisse = fControlCaisse;
    }

    public List<ModeReglement> getModeReglements() {
        return modeReglements;
    }

    public void setModeReglements(List<ModeReglement> modeReglements) {
        this.modeReglements = modeReglements;
    }

    public String getDefaultouverture() {
        return defaultouverture;
    }

    public void setDefaultouverture(String defaultouverture) {
        this.defaultouverture = defaultouverture;
    }

    public String getDifferenceautorise() {
        return differenceautorise;
    }

    public void setDifferenceautorise(String differenceautorise) {
        this.differenceautorise = differenceautorise;
    }

    public Short getFprixttc() {
        return fprixttc;
    }

    public void setFprixttc(Short fprixttc) {
        this.fprixttc = fprixttc;
    }

    public Short getFaffectcollab() {
        return faffectcollab;
    }

    public void setFaffectcollab(Short faffectcollab) {
        this.faffectcollab = faffectcollab;
    }

    public Short getfAffectEmployetoservice() {
        return fAffectEmployetoservice;
    }

    public void setfAffectEmployetoservice(Short fAffectEmployetoservice) {
        this.fAffectEmployetoservice = fAffectEmployetoservice;
    }

    public Short getfAutoriserRecharge() {
        return fAutoriserRecharge;
    }

    public void setfAutoriserRecharge(Short fAutoriserRecharge) {
        this.fAutoriserRecharge = fAutoriserRecharge;
    }

	public String getfReservation() {
		return fReservation;
	}

	public void setfReservation(String fReservation) {
		this.fReservation = fReservation;
	}

	public String getTypePv() {
		return typePv;
	}

	public void setTypePv(String typePv) {
		this.typePv = typePv;
	}

	public Date getDateMiseCirc() {
		return dateMiseCirc;
	}

	public void setDateMiseCirc(Date dateMiseCirc) {
		this.dateMiseCirc = dateMiseCirc;
	}

	public Short getFarretVenteOnline() {
		return farretVenteOnline;
	}

	public void setFarretVenteOnline(Short farretVenteOnline) {
		this.farretVenteOnline = farretVenteOnline;
	}

	public Short getfEcranCuisine() {
		return fEcranCuisine;
	}

	public void setfEcranCuisine(Short fEcranCuisine) {
		this.fEcranCuisine = fEcranCuisine;
	}

	public Short getfMobile() {
		return fMobile;
	}

	public void setfMobile(Short fMobile) {
		this.fMobile = fMobile;
	}

	public Short getfImpresCateg() {
		return fImpresCateg;
	}

	public void setfImpresCateg(Short fImpresCateg) {
		this.fImpresCateg = fImpresCateg;
	}

	public Short getfDispCA() {
		return fDispCA;
	}

	public void setfDispCA(Short fDispCA) {
		this.fDispCA = fDispCA;
	}
    
	
    
}
