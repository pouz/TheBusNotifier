package com.example.pouz.thebusnotifier.BusAPI.Object;

/**
 * Created by PouZ on 2016-12-09.
 */

public class Bus {
    private String delayYn1;
    private String delayYn2;
    private String drvEnd;
    private String flag;
    private String locationNo1;
    private String locationNo2;
    private String lowPlate1;
    private String lowPlate2;
    private String platNo1;
    private String platNo2;
    private String predictTime1;
    private String predictTime2;
    private String remainSeatCnt1;
    private String remainSeatCnt2;
    private String routeId;
    private String staOrder;
    private String stationId;

    @Override
    public String toString() {
        return delayYn1 + " " +
                delayYn2 + " " +
                drvEnd + " " +
                flag + " " +
                locationNo1 + " " +
                locationNo2 + " " +
                lowPlate1 + " " +
                lowPlate2 + " " +
                platNo1 + " " +
                platNo2 + " " +
                predictTime1 + " " +
                predictTime2 + " " +
                remainSeatCnt1 + " " +
                remainSeatCnt2 + " " +
                routeId + " " +
                staOrder + " " +
                stationId;
    }

    public String getDelayYn1() {
        return delayYn1;
    }

    public void setDelayYn1(String delayYn1) {
        this.delayYn1 = delayYn1;
    }

    public String getDelayYn2() {
        return delayYn2;
    }

    public void setDelayYn2(String delayYn2) {
        this.delayYn2 = delayYn2;
    }

    public String getDrvEnd() {
        return drvEnd;
    }

    public void setDrvEnd(String drvEnd) {
        this.drvEnd = drvEnd;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getLocationNo1() {
        return locationNo1;
    }

    public void setLocationNo1(String locationNo1) {
        this.locationNo1 = locationNo1;
    }

    public String getLocationNo2() {
        return locationNo2;
    }

    public void setLocationNo2(String locationNo2) {
        this.locationNo2 = locationNo2;
    }

    public String getLowPlate1() {
        return lowPlate1;
    }

    public void setLowPlate1(String lowPlate1) {
        this.lowPlate1 = lowPlate1;
    }

    public String getLowPlate2() {
        return lowPlate2;
    }

    public void setLowPlate2(String lowPlate2) {
        this.lowPlate2 = lowPlate2;
    }

    public String getPlatNo1() {
        return platNo1;
    }

    public void setPlatNo1(String platNo1) {
        this.platNo1 = platNo1;
    }

    public String getPlatNo2() {
        return platNo2;
    }

    public void setPlatNo2(String platNo2) {
        this.platNo2 = platNo2;
    }

    public String getPredictTime1() {
        return predictTime1;
    }

    public void setPredictTime1(String predictTime1) {
        this.predictTime1 = predictTime1;
    }

    public String getPredictTime2() {
        return predictTime2;
    }

    public void setPredictTime2(String predictTime2) {
        this.predictTime2 = predictTime2;
    }

    public String getRemainSeatCnt1() {
        return remainSeatCnt1;
    }

    public void setRemainSeatCnt1(String remainSeatCnt1) {
        this.remainSeatCnt1 = remainSeatCnt1;
    }

    public String getRemainSeatCnt2() {
        return remainSeatCnt2;
    }

    public void setRemainSeatCnt2(String remainSeaCnt2) {
        this.remainSeatCnt2 = remainSeaCnt2;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getStaOrder() {
        return staOrder;
    }

    public void setStaOrder(String staOrder) {
        this.staOrder = staOrder;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }
}
