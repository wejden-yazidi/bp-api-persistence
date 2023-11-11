package com.bprice.persistance.model;

public class Permissions {
    private String functionName;
    private Short access;
    private Boolean checked;

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public Short getAccess() {
        return access;
    }

    public void setAccess(Short access) {
        this.access = access;
    }

    public Boolean isChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }
}
