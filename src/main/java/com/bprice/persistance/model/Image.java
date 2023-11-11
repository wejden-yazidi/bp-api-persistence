/*
 * creer par Oussama dridi 8 avr. 2020
 */
package com.bprice.persistance.model;

public class Image {

	private String url;
	private String designation;
	private String description;
	private Integer ordre;
	private short isCouverture;

	public Image() {
		super();
	}

	public Image(String url, String designation, String description, Integer ordre, short isCouverture) {
		super();
		this.url = url;
		this.designation = designation;
		this.description = description;
		this.ordre = ordre;
		this.isCouverture = isCouverture;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getOrdre() {
		return ordre;
	}

	public void setOrdre(Integer ordre) {
		this.ordre = ordre;
	}

	public short getIsCouverture() {
		return isCouverture;
	}

	public void setIsCouverture(short isCouverture) {
		this.isCouverture = isCouverture;
	}

}
