package com.example.pouz.thebusnotifier.BusAPI.Object;

/**
 * Created by PouZ on 2016-12-07.
 */

public class RouteStation {
    private String routeID;
    private String stationID;
    private String upDown;
    private String stationOrder;
    private String routeName;
    private String stationName;

    @Override
    public String toString() {
        return routeID + " " + stationID + " " + upDown + " " + stationOrder + " " + routeName + " " + stationName;
    }

    // Getter and Setter
    public String getRouteID() {
        return routeID;
    }

    public void setRouteID(String routeID) {
        this.routeID = routeID;
    }

    public String getStationID() {
        return stationID;
    }

    public void setStationID(String stationID) {
        this.stationID = stationID;
    }

    public String getUpDown() {
        return upDown;
    }

    public void setUpDown(String upDown) {
        this.upDown = upDown;
    }

    public String getStationOrder() {
        return stationOrder;
    }

    public void setStationOrder(String stationOrder) {
        this.stationOrder = stationOrder;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }
}
