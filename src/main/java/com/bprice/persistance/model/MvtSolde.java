package com.bprice.persistance.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * Created by ahmed on 08/03/2020.
 */
@Document(collection = "mvtSolde")
public class MvtSolde {
    private String idMvtSolde;
    private String idClientPartenaire;
    private Float montant;
    private String sens;
    private String Source;
    private String typeOperation;
    private String trace;
	private String idReglment;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOperation;

    public MvtSolde() {
    }

    public String getIdMvtSolde() {
        return idMvtSolde;
    }

    public void setIdMvtSolde(String idMvtSolde) {
        this.idMvtSolde = idMvtSolde;
    }

    public String getIdClientPartenaire() {
        return idClientPartenaire;
    }

    public void setIdClientPartenaire(String idClientPartenaire) {
        this.idClientPartenaire = idClientPartenaire;
    }

    public Float getMontant() {
        return montant;
    }

    public void setMontant(Float montant) {
        this.montant = montant;
    }

    public String getSens() {
        return sens;
    }

    public void setSens(String sens) {
        this.sens = sens;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

	public String getTypeOperation() {
		return typeOperation;
	}

	public void setTypeOperation(String typeOperation) {
		this.typeOperation = typeOperation;
	}

	public String getIdReglment() {
		return idReglment;
	}

	public void setIdReglment(String idReglment) {
		this.idReglment = idReglment;
	}

	public String getTrace() {
		return trace;
	}

	public void setTrace(String trace) {
		this.trace = trace;
	}
    
    
}
