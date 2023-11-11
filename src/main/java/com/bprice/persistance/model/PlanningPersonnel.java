package com.bprice.persistance.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import java.sql.Time;

/**
 * Created by ahmed on 25/01/2020.
 */
@Document(collection = "planningPersonnel")
public class PlanningPersonnel {
    @Id
    @GeneratedValue(generator = "String2")
    private String idPlanningPersonnel;
    private String idUtilisateur;
    private String designation;
    private Time heureDebut;
    private Time heureFin;

    public PlanningPersonnel() {
    }

    public String getIdPlanningPersonnel() {
        return idPlanningPersonnel;
    }

    public void setIdPlanningPersonnel(String idPlanningPersonnel) {
        this.idPlanningPersonnel = idPlanningPersonnel;
    }

    public String getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(String idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Time getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(Time heureDebut) {
        this.heureDebut = heureDebut;
    }

    public Time getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(Time heureFin) {
        this.heureFin = heureFin;
    }
}
