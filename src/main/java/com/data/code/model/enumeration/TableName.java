package com.data.code.model.enumeration;

public enum TableName {
    PILOT("PILOT"),
    RESULT("RESULT"),
    PILOT_STANDINGS("PILOT_STANDINGS"),
    CIRCUIT("CIRCUIT");

    private String name;

    TableName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
