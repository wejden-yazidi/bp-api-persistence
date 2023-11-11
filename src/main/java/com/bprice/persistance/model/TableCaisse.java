package com.bprice.persistance.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

import javax.persistence.GeneratedValue;

/**
 * Created by ahmed on 25/01/2020.
 */
@Document(collection = "tableCaisse")
public class TableCaisse {
    @Id
    @GeneratedValue(generator = "String2")
    private String idTable;
    private String idPointVente;
    private Integer numTable;
    private Integer capaciteTable;
    private String typeTable;
    private String etat;
    private String description;
    private Commande commande;
    private List<CommandeDetails> commandeDetails;

    public TableCaisse() {
    }

    



	public TableCaisse(String idPointVente, Integer numTable, Integer capaciteTable, String typeTable) {
		super();
		this.idPointVente = idPointVente;
		this.numTable = numTable;
		this.capaciteTable = capaciteTable;
		this.typeTable = typeTable;
	}





	public String getIdTable() {
        return idTable;
    }

    public void setIdTable(String idTable) {
        this.idTable = idTable;
    }

    public String getIdPointVente() {
        return idPointVente;
    }

    public void setIdPointVente(String idPointVente) {
        this.idPointVente = idPointVente;
    }

    public Integer getNumTable() {
        return numTable;
    }

    public void setNumTable(Integer numTable) {
        this.numTable = numTable;
    }

    public Integer getCapaciteTable() {
        return capaciteTable;
    }

    public void setCapaciteTable(Integer capaciteTable) {
        this.capaciteTable = capaciteTable;
    }


	public String getTypeTable() {
		return typeTable;
	}


	public void setTypeTable(String typeTable) {
		this.typeTable = typeTable;
	}





	public String getEtat() {
		return etat;
	}





	public void setEtat(String etat) {
		this.etat = etat;
	}





	public String getDescription() {
		return description;
	}





	public void setDescription(String description) {
		this.description = description;
	}





	public Commande getCommande() {
		return commande;
	}





	public void setCommande(Commande commande) {
		this.commande = commande;
	}





	public List<CommandeDetails> getCommandeDetails() {
		return commandeDetails;
	}





	public void setCommandeDetails(List<CommandeDetails> commandeDetails) {
		this.commandeDetails = commandeDetails;
	}





	
	
	
}
