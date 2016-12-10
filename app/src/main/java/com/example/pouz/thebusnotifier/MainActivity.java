package com.example.pouz.thebusnotifier;

import android.os.Bundle;
import android.app.Activity;

import com.example.pouz.thebusnotifier.BusAPI.Object.Bus;
import com.example.pouz.thebusnotifier.BusAPI.Object.BusLocation;
import com.example.pouz.thebusnotifier.BusAPI.Object.Information;
import com.example.pouz.thebusnotifier.Debug.Debug;
import com.example.pouz.thebusnotifier.REST.GG.GGRequest;
import com.example.pouz.thebusnotifier.XMLParser.GGXMLParser;

import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/**
 * Created by PouZ on 2016-12-05.
 */

public class MainActivity extends Activity {
    @Override

    // Activity 전환시 Activity클래스의 onCreate를 override하여 Bundle(저장된 인스턴스 상황)을 전달하여 새로운 액티비티를 만든다?
    // keyword : class Bundle, class Activity.onCreate
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        GGRequest ggRequest = new GGRequest();

        setContentView(R.layout.main_activity);


        try {
            GGXMLParser ggxml = new GGXMLParser();
            String xml;

            xml = ggRequest.getBaseInfoItem();
            Information info = ggxml.baseInfoItemParser(xml);

            //Debug.debugPrintString("MainActivity", xml);


            //xml = ggRequest.getBusArrivalList("207000023");
            //ArrayList<Bus> busArrivalArrayList = ggxml.busArrivalListParser(xml);

            //xml = ggRequest.getBusArrivalItem("207000023", "100100013");
            //Bus bus = ggxml.busArrivalItemParser(xml);

            //xml = ggRequest.getBusLocationList("100100013");
            //ArrayList<BusLocation> busLocation = ggxml.busLocationListParser(xml);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
