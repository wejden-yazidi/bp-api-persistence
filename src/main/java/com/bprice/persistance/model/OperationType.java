package com.bprice.persistance.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;

/**
 * Created by ahmed on 25/01/2020.
 */
@Document(collection = "operationType")
public class OperationType {
    @Id
    @GeneratedValue(generator = "String2")
    private String idTypeOperation;
    private String designation;
    private Short fActif;

    public OperationType() {
    }

    public String getIdTypeOperation() {
        return idTypeOperation;
    }

    public void setIdTypeOperation(String idTypeOperation) {
        this.idTypeOperation = idTypeOperation;
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
}
