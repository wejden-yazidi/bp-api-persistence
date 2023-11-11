/*
 * creer par Oussama dridi 4 avr. 2020
 */
package com.bprice.persistance.model;

public class ProduitAndQte {

	private String idProduit;
	private Double quantite;
	
	
	
	public ProduitAndQte() {
		super();
	}

	public ProduitAndQte(String idProduit, Double quantite) {
		super();
		this.idProduit = idProduit;
		this.quantite = quantite;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idProduit == null) ? 0 : idProduit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProduitAndQte other = (ProduitAndQte) obj;
		if (idProduit == null) {
			if (other.idProduit != null)
				return false;
		} else if (!idProduit.equals(other.idProduit))
			return false;
		return true;
	}
	
	
	
}
