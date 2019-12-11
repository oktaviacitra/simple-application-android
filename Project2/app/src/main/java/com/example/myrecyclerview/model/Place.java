package com.example.myrecyclerview.model;

public class Place {
    private int id;
    private String name;
    private String detail;
    private double latitude;
    private double longitude;
    private String site;

    public Place() {
    }

    public Place(int id, String name, String detail, double latitude, double longitude, String site) {
        this.id = id;
        this.name = name;
        this.detail = detail;
        this.latitude = latitude;
        this.longitude = longitude;
        this.site = site;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
}
