package com.example.pouz.thebusnotifier.BusAPI.Object;

/**
 * Created by PouZ on 2016-12-07.
 */

public class Route {
    private String routeID;
    private String routeName;
    private String routeType;

    private String startStationID;
    private String startStationName;
    private String startStationNumber;

    private String endStationID;
    private String endStationName;
    private String endStationNumber;

    private String upFirstTime;
    private String upLastTime;
    private String downFirstTime;
    private String downLastTime;

    private String peekAlloc;
    private String nPeekAlloc;

    private String companyID;
    private String companyName;
    private String regionName;
    private String districtCode;

    @Override
    public String toString() {
        return routeID + " " +
                routeName + " " +
                routeType + " " +
                startStationID + " " +
                startStationName + " " +
                startStationNumber + " " +
                endStationID + " " +
                endStationName + " " +
                endStationNumber + " " +
                upFirstTime + " " +
                upLastTime + " " +
                downFirstTime + " " +
                downLastTime + " " +
                nPeekAlloc + " " +
                companyID + " " +
                companyName + " " +
                regionName + " " +
                districtCode;
    }

    // Getter and Setter
    public String getRouteID() {
        return routeID;
    }

    public void setRouteID(String routeID) {
        this.routeID = routeID;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public String getRouteType() {
        return routeType;
    }

    public void setRouteType(String routeType) {
        this.routeType = routeType;
    }

    public String getStartStationID() {
        return startStationID;
    }

    public void setStartStationID(String startStationID) {
        this.startStationID = startStationID;
    }

    public String getStartStationName() {
        return startStationName;
    }

    public void setStartStationName(String startStationName) {
        this.startStationName = startStationName;
    }

    public String getStartStationNumber() {
        return startStationNumber;
    }

    public void setStartStationNumber(String startStationNumber) {
        this.startStationNumber = startStationNumber;
    }

    public String getEndStationID() {
        return endStationID;
    }

    public void setEndStationID(String endStationID) {
        this.endStationID = endStationID;
    }

    public String getEndStationName() {
        return endStationName;
    }

    public void setEndStationName(String endStationName) {
        this.endStationName = endStationName;
    }

    public String getEndStationNumber() {
        return endStationNumber;
    }

    public void setEndStationNumber(String endStationNumber) {
        this.endStationNumber = endStationNumber;
    }

    public String getUpFirstTime() {
        return upFirstTime;
    }

    public void setUpFirstTime(String upFirstTime) {
        this.upFirstTime = upFirstTime;
    }

    public String getUpLastTime() {
        return upLastTime;
    }

    public void setUpLastTime(String upLastTime) {
        this.upLastTime = upLastTime;
    }

    public String getDownFirstTime() {
        return downFirstTime;
    }

    public void setDownFirstTime(String downFirstTime) {
        this.downFirstTime = downFirstTime;
    }

    public String getDownLastTime() {
        return downLastTime;
    }

    public void setDownLastTime(String downLastTime) {
        this.downLastTime = downLastTime;
    }

    public String getPeekAlloc() {
        return peekAlloc;
    }

    public void setPeekAlloc(String peekAlloc) {
        this.peekAlloc = peekAlloc;
    }

    public String getnPeekAlloc() {
        return nPeekAlloc;
    }

    public void setnPeekAlloc(String nPeekAlloc) {
        this.nPeekAlloc = nPeekAlloc;
    }

    public String getCompanyID() {
        return companyID;
    }

    public void setCompanyID(String companyID) {
        this.companyID = companyID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }
}
