package com.example.pouz.thebusnotifier.BusAPI.Object;

/**
 * Created by PouZ on 2016-12-09.
 */

public class Information {
    private String errMsg;
    private String returnCode;
    private String resultCode;

    private String areaDownloadUrl;
    private String routeDownloadUrl;
    private String routeLineDownloadUrl;
    private String routeStationDownloadUrl;
    private String stationDownloadUrl;

    @Override
    public String toString() {
        return errMsg + " " + returnCode + " " + resultCode + " " + areaDownloadUrl + " " + routeDownloadUrl + " " + routeLineDownloadUrl + " " + routeStationDownloadUrl + " " + stationDownloadUrl;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getAreaDownloadUrl() {
        return areaDownloadUrl;
    }

    public void setAreaDownloadUrl(String areaDownloadUrl) {
        this.areaDownloadUrl = areaDownloadUrl;
    }

    public String getRouteDownloadUrl() {
        return routeDownloadUrl;
    }

    public void setRouteDownloadUrl(String routeDownloadUrl) {
        this.routeDownloadUrl = routeDownloadUrl;
    }

    public String getRouteLineDownloadUrl() {
        return routeLineDownloadUrl;
    }

    public void setRouteLineDownloadUrl(String routeLineDownloadUrl) {
        this.routeLineDownloadUrl = routeLineDownloadUrl;
    }

    public String getRouteStationDownloadUrl() {
        return routeStationDownloadUrl;
    }

    public void setRouteStationDownloadUrl(String routeStationDownloadUrl) {
        this.routeStationDownloadUrl = routeStationDownloadUrl;
    }

    public String getStationDownloadUrl() {
        return stationDownloadUrl;
    }

    public void setStationDownloadUrl(String stationDownloadUrl) {
        this.stationDownloadUrl = stationDownloadUrl;
    }
}
