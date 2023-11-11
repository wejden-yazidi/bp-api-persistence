package com.bprice.persistance.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import java.util.List;

@Document(collection = "Zone66")
public class Zone {

    @Id
    @GeneratedValue(generator = "String2")
    private String idZone;
    private String idPointVente;
    private String name;
    private List<String> idEmployer;
    private List<String> tableCaissesIds;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTableCaissesIds() {
        return tableCaissesIds;
    }

    public void setTableCaissesIds(List<String> tableCaissesIds) {
        this.tableCaissesIds = tableCaissesIds;
    }

    public String getIdZone() {
        return idZone;
    }

    public void setIdZone(String idZone) {
        this.idZone = idZone;
    }

    public String getIdPointVente() {
        return idPointVente;
    }

    public void setIdPointVente(String idPointVente) {
        this.idPointVente = idPointVente;
    }

    public List<String> getIdEmployer() {
        return idEmployer;
    }

    public void setIdEmployer(List<String> idEmployer) {
        this.idEmployer = idEmployer;
    }
}
