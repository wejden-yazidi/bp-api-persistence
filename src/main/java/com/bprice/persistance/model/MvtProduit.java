/*
 * creer par Oussama dridi 4 mai 2020
 */
package com.bprice.persistance.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.Id;

public class MvtProduit {
	  @Id
	    @GeneratedValue(generator = "String2")
	    private String idMvt;
	    private String idProduitProintVente;
	    @Temporal(TemporalType.TIMESTAMP)
	    private Date dateMvt;
	    private Double quantite;
	    private String sens;
	    
	    
		public MvtProduit(String idProduitProintVente, Date dateMvt, Double quantite, String sens) {
			super();
			this.idProduitProintVente = idProduitProintVente;
			this.dateMvt = dateMvt;
			this.quantite = quantite;
			this.sens = sens;
		}
		public String getIdMvt() {
			return idMvt;
		}
		public void setIdMvt(String idMvt) {
			this.idMvt = idMvt;
		}
		public String getIdProduitProintVente() {
			return idProduitProintVente;
		}
		public void setIdProduitProintVente(String idProduitProintVente) {
			this.idProduitProintVente = idProduitProintVente;
		}
		public Date getDateMvt() {
			return dateMvt;
		}
		public void setDateMvt(Date dateMvt) {
			this.dateMvt = dateMvt;
		}
		public Double getQuantite() {
			return quantite;
		}
		public void setQuantite(Double quantite) {
			this.quantite = quantite;
		}
		public String getSens() {
			return sens;
		}
		public void setSens(String sens) {
			this.sens = sens;
		}
	    
	    

}
