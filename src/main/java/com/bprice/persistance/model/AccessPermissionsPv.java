package com.bprice.persistance.model;

import java.util.List;

public class AccessPermissionsPv {
    private String pointVente;
    private List<Permissions> permissions;

    public String getPointVente() {
        return pointVente;
    }

    public void setPointVente(String pointVente) {
        this.pointVente = pointVente;
    }

    public List<Permissions> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permissions> permissions) {
        this.permissions = permissions;
    }
}
