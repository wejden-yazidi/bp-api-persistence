package com.bprice.persistance.model;

public class MvtStockEntrant extends MvtStock {
    private PointVente pointVenteDest;
    private PointVente pointVenteSource;

    public PointVente getPointVenteDest() {
        return pointVenteDest;
    }

    public void setPointVenteDest(PointVente pointVenteDest) {
        this.pointVenteDest = pointVenteDest;
    }

    public PointVente getPointVenteSource() {
        return pointVenteSource;
    }

    public void setPointVenteSource(PointVente pointVenteSource) {
        this.pointVenteSource = pointVenteSource;
    }

    public MvtStockEntrant() {
        super();
    }
}
