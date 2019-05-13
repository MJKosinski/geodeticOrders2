package com.geohor.geodeticordersbook.myenum;

public enum UserType {

    GEODESY("Geodeta"),
    GENERAL_CONTRACTOR("Generalny Wykonawca"),
    SUBCONTRACTOR("Podwykonawca");

private final String title;

    UserType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
