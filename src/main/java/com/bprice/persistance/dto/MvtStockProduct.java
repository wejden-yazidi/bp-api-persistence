package com.bprice.persistance.dto;

import com.bprice.persistance.model.MvtStock;

public class MvtStockProduct {

    private MvtStock mvtStock;
    private String productName;

    public void setMvtStock(MvtStock mvtStock) {
        this.mvtStock = mvtStock;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public MvtStock getMvtStock() {
        return mvtStock;
    }

    public String getProductName() {
        return productName;
    }
}
