/*
 * creer par Oussama dridi 17 févr. 2020
 */
package com.bprice.persistance.model;


public class JoursRegle {
	private String code;
	private String designation;
	private String debut;
	private String fin;
	private short fAllDay;


	public JoursRegle() {
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDebut() {
		return debut;
	}

	public void setDebut(String debut) {
		this.debut = debut;
	}

	public String getFin() {
		return fin;
	}

	public void setFin(String fin) {
		this.fin = fin;
	}

	public short getfAllDay() {
		return fAllDay;
	}

	public void setfAllDay(short fAllDay) {
		this.fAllDay = fAllDay;
	}
}
