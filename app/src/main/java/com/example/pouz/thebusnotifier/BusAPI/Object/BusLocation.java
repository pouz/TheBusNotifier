package com.example.pouz.thebusnotifier.BusAPI.Object;

/**
 * Created by PouZ on 2016-12-09.
 */

public class BusLocation {
    private String endBus;
    private String lowPlate;
    private String plateNo;
    private String remainSeatCnt;
    private String routeId;
    private String stationId;
    private String stationSeq;

    @Override
    public String toString() {
        return endBus + "/" + lowPlate + "/" + plateNo + "/" + remainSeatCnt + "/" + routeId + "/" + stationId + "/" + stationSeq;
    }

    public String getEndBUs() {
        return endBus;
    }

    public void setEndBUs(String endBUs) {
        this.endBus = endBUs;
    }

    public String getLowPlate() {
        return lowPlate;
    }

    public void setLowPlate(String lowPlate) {
        this.lowPlate = lowPlate;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getRemainSeatCnt() {
        return remainSeatCnt;
    }

    public void setRemainSeatCnt(String remainSeatCnt) {
        this.remainSeatCnt = remainSeatCnt;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getStationSeq() {
        return stationSeq;
    }

    public void setStationSeq(String stationSeq) {
        this.stationSeq = stationSeq;
    }
}
