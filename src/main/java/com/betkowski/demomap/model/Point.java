package com.betkowski.demomap.model;

public class Point {

    private String lon;
    private String lat;
    private String country;
    private String confirmed;
    private String deaths;
    private String recovered;

    @Override
    public String toString() {
        return "Point{" +
                "lon='" + lon + '\'' +
                ", lat='" + lat + '\'' +
                ", country='" + country + '\'' +
                ", confirmed='" + confirmed + '\'' +
                ", deaths='" + deaths + '\'' +
                ", recovered='" + recovered + '\'' +
                '}';
    }

    public Point(String lon, String lat, String country) {
        this.lon = lon;
        this.lat = lat;
        this.country = country;
    }

    public Point(String lon, String lat, String country, String confirmed, String deaths, String recovered) {
        this.lon = lon;
        this.lat = lat;
        this.country = country;
        this.confirmed = confirmed;
        this.deaths = deaths;
        this.recovered = recovered;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }

    public String getDeaths() {
        return deaths;
    }

    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }
}
