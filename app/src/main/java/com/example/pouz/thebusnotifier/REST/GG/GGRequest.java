package com.example.pouz.thebusnotifier.REST.GG;

import com.example.pouz.thebusnotifier.REST.Request;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

/**
 * Created by PouZ on 2016-12-07.
 */

public class GGRequest extends Request{
    private static String URL = "http://openapi.gbis.go.kr/ws/rest/";
    private static String ServiceKey = "?serviceKey=t9RpwS82HM%2FqnI85yMbVsYl8lE2FN5ZTqKW4qptb5y3gjQ2kVYo8DYYs1QmlMavIVGp4Gm1qIqVIi1yIxjx%2B6g%3D%3D"; // serviceKey

    /* SERVICE TYPE*/
    private String BASE_INFO_ITEM = URL + "baseinfoservice" + ServiceKey;
    private String BUS_ARRIVAL_LIST = URL + "busarrivalservice/station" + ServiceKey;
    private String BUS_ARRIVAL_ITEM = URL + "busarrivalservice" + ServiceKey;
    private String BUS_LOCATION_LIST = URL + "buslocationservice" + ServiceKey;

    @Override
    protected String doInBackground(String... strings) {
        return super.doInBackground(strings);
    }

    public String getBaseInfoItem() throws IOException, ExecutionException, InterruptedException {
        String result;
        result = execute(BASE_INFO_ITEM).get();
        return  result;
    }

    public String getBusArrivalList(String stationID) throws IOException, ExecutionException, InterruptedException {
        String result;
        result = execute(BUS_ARRIVAL_LIST, "&stationId=", stationID).get();
        return  result;

    }

    public String getBusArrivalItem(String stationID, String routeID) throws IOException, ExecutionException, InterruptedException {
        String result;
        result = execute(BUS_ARRIVAL_ITEM, "&stationId=", stationID, "&routeId=", routeID).get();
        return  result;
    }

    public String getBusLocationList(String routeID) throws IOException, ExecutionException, InterruptedException {
        String result;
        result = execute(BUS_LOCATION_LIST, "&routeId=", routeID).get();
        return  result;
    }
}
