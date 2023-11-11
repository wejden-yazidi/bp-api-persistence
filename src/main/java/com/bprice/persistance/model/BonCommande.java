package com.bprice.persistance.model;

import com.bprice.persistance.dto.MvtStockProduct;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "boncommande")
public class BonCommande {

    @Id
    @GeneratedValue(generator = "String2")
    private String id;
    private LocalDateTime generatedDate;
    private String referance;
    private List<MvtStockProduct> mvtStockProducts;
    private String idPointVente;
    private String idPartenaire;
    private Double total;
    private Short etat;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getGeneratedDate() {
        return generatedDate;
    }

    public void setGeneratedDate(LocalDateTime generatedDate) {
        this.generatedDate = generatedDate;
    }

    public String getReferance() {
        return referance;
    }

    public void setReferance(String referance) {
        this.referance = referance;
    }

    public String getIdPointVente() {
        return idPointVente;
    }

    public void setIdPointVente(String idPointVente) {
        this.idPointVente = idPointVente;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Short getEtat() {
        return etat;
    }

    public void setEtat(Short etat) {
        this.etat = etat;
    }

    public List<MvtStockProduct> getMvtStockProducts() {
        return mvtStockProducts;
    }

    public void setMvtStockProducts(List<MvtStockProduct> mvtStockProducts) {
        this.mvtStockProducts = mvtStockProducts;
    }

    public String getIdPartenaire() {
        return idPartenaire;
    }

    public void setIdPartenaire(String idPartenaire) {
        this.idPartenaire = idPartenaire;
    }
}
