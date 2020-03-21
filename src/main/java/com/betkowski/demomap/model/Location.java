
package com.betkowski.demomap.model;

import java.util.List;

public class Location {

    private Coordinates mCoordinates;

    @Override
    public String toString() {
        return "Location{" +
                "mCoordinates=" + mCoordinates +
                ", mCountry='" + mCountry + '\'' +
                ", mCountryCode='" + mCountryCode + '\'' +
                ", mId=" + mId +
                ", mLastUpdated='" + mLastUpdated + '\'' +
                ", mLatest=" + mLatest +
                ", mLocations=" + mLocations +
                ", mProvince='" + mProvince + '\'' +
                '}';
    }

    private String mCountry;

    private String mCountryCode;

    private Long mId;

    private String mLastUpdated;

    private Latest mLatest;

    private List<Location> mLocations;

    private String mProvince;

    public Coordinates getCoordinates() {
        return mCoordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        mCoordinates = coordinates;
    }

    public String getCountry() {
        return mCountry;
    }

    public void setCountry(String country) {
        mCountry = country;
    }

    public String getCountryCode() {
        return mCountryCode;
    }

    public void setCountryCode(String countryCode) {
        mCountryCode = countryCode;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getLastUpdated() {
        return mLastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        mLastUpdated = lastUpdated;
    }

    public Latest getLatest() {
        return mLatest;
    }

    public void setLatest(Latest latest) {
        mLatest = latest;
    }

    public List<Location> getLocations() {
        return mLocations;
    }

    public void setLocations(List<Location> locations) {
        mLocations = locations;
    }

    public String getProvince() {
        return mProvince;
    }

    public void setProvince(String province) {
        mProvince = province;
    }

}
