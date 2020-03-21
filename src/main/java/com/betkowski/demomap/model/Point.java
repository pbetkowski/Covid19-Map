package com.betkowski.demomap.model;

public class Point {

    private Double lon;
    private Double lat;
    private String text;

    public Point(Double lat, Double lon, String text) {
        this.lat = lat;
        this.lon = lon;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }
}
