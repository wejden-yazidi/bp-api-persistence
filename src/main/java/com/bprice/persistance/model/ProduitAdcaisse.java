package com.bprice.persistance.model;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "produitAdcaisse")

public class ProduitAdcaisse {
	
	 	@Id
	    @GeneratedValue(generator = "String2")
	    private String idProduit;
	 	private String nomProduit;
	 	private String descriptionProduit ;
	 	private String prixProduit ;
	 	private String typeAbonnement ;
	 	private Short quantiteProduit ;
	 	private String idDetailFacture;
		
	 	
	 	
		public String getIdProduit() {
			return idProduit;
		}
		public void setIdProduit(String idProduit) {
			this.idProduit = idProduit;
		}
		public String getNomProduit() {
			return nomProduit;
		}
		public void setNomProduit(String nomProduit) {
			this.nomProduit = nomProduit;
		}
		public String getDescriptionProduit() {
			return descriptionProduit;
		}
		public void setDescriptionProduit(String descriptionProduit) {
			this.descriptionProduit = descriptionProduit;
		}
		public String getPrixProduit() {
			return prixProduit;
		}
		public void setPrixProduit(String prixProduit) {
			this.prixProduit = prixProduit;
		}
		public String getTypeAbonnement() {
			return typeAbonnement;
		}
		public void setTypeAbonnement(String typeAbonnement) {
			this.typeAbonnement = typeAbonnement;
		}
		public Short getQuantiteProduit() {
			return quantiteProduit;
		}
		public void setQuantiteProduit(Short quantiteProduit) {
			this.quantiteProduit = quantiteProduit;
		}
		public String getIdDetailFacture() {
			return idDetailFacture;
		}
		public void setIdDetailFacture(String idDetailFacture) {
			this.idDetailFacture = idDetailFacture;
		}
	 	

}
