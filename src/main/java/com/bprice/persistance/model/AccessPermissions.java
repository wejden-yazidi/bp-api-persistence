package com.bprice.persistance.model;

import java.util.List;

public class AccessPermissions {
    private List<AccessPermissionsPv> accessPermissionsPv;
    private List<Permissions> settingsPermissions;
    private Boolean adminPermission;

    public List<AccessPermissionsPv> getAccessPermissionsPv() {
        return accessPermissionsPv;
    }

    public void setAccessPermissionsPv(List<AccessPermissionsPv> accessPermissionsPv) {
        this.accessPermissionsPv = accessPermissionsPv;
    }

    public List<Permissions> getSettingsPermissions() {
        return settingsPermissions;
    }

    public void setSettingsPermissions(List<Permissions> settingsPermissions) {
        this.settingsPermissions = settingsPermissions;
    }

    public Boolean getAdminPermission() {
        return adminPermission;
    }

    public void setAdminPermission(Boolean adminPermission) {
        this.adminPermission = adminPermission;
    }
}
