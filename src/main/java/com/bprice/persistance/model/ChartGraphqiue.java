package com.bprice.persistance.model;

import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;


/**
 * Created by ahmed on 25/01/2020.
 */
@Document(collection = "chartGraphqiue")
public class ChartGraphqiue {
    @Id
    @GeneratedValue(generator = "String2")
    private String idChart;
    private String idPartenaire;
    private String couleur1;
    private String couleur2;
    private String iconApp;

    public ChartGraphqiue(String idPartenaire, String couleur1, String couleur2, String iconApp) {
        this.idPartenaire = idPartenaire;
        this.couleur1 = couleur1;
        this.couleur2 = couleur2;
        this.iconApp = iconApp;
    }

    public ChartGraphqiue() {
    }

    public String getIdChart() {
        return idChart;
    }

    public void setIdChart(String idChart) {
        this.idChart = idChart;
    }

    public String getIdPartenaire() {
        return idPartenaire;
    }

    public void setIdPartenaire(String idPartenaire) {
        this.idPartenaire = idPartenaire;
    }

    public String getCouleur1() {
        return couleur1;
    }

    public void setCouleur1(String couleur1) {
        this.couleur1 = couleur1;
    }

    public String getCouleur2() {
        return couleur2;
    }

    public void setCouleur2(String couleur2) {
        this.couleur2 = couleur2;
    }

    public String getIconApp() {
        return iconApp;
    }

    public void setIconApp(String iconApp) {
        this.iconApp = iconApp;
    }
}
