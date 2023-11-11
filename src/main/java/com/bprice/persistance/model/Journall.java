package com.bprice.persistance.model;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Journall {

	// groupe-compta
	
@Id
@GeneratedValue(generator="String2")
	private String id;
	private Boolean isActif;
   // public TypeJournal typeJournal;
    

public Journall() {
		super();
	}

public Journall(String id, Boolean isActif, TypeJournal typeJournal) {
		super();
		this.id = id;
		this.isActif = isActif;
		//this.typeJournal = typeJournal;
	}

public String getId() {
	return id;
}

/*public TypeJournal getTypeJournal() {
	return typeJournal;
}

public void setTypeJournal(TypeJournal typeJournal) {
	this.typeJournal = typeJournal;
}
*/
public void setId(String id) {
	this.id = id;
}

public Boolean getIsActif() {
	return isActif;
}

public void setIsActif(Boolean isActif) {
	this.isActif = isActif;
}






}
