package com.example.pouz.thebusnotifier.XMLParser;

import com.example.pouz.thebusnotifier.BusAPI.Object.Bus;
import com.example.pouz.thebusnotifier.BusAPI.Object.BusLocation;
import com.example.pouz.thebusnotifier.BusAPI.Object.Information;
import com.example.pouz.thebusnotifier.Debug.Debug;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

/**
 * Created by PouZ on 2016-12-08.
 */

public class GGXMLParser {

    public Information baseInfoItemParser(String baseInfoItemRequested) throws IOException, XmlPullParserException {
        Information baseInfoItem = new Information();
        XmlPullParserFactory parserCreator = XmlPullParserFactory.newInstance();
        XmlPullParser parser = parserCreator.newPullParser();

        Debug.debugPrintString("GGXMLParser.BaseInfoItemParser", baseInfoItemRequested);

        parser.setInput(new StringReader(baseInfoItemRequested)); // String을 Reader형태로 해주는 클래스(IO나 File Reader처럼 해주는 듯하다)
        parser.next();

        int parserEvent = parser.getEventType();
        String preName = null;

        while(parserEvent != XmlPullParser.END_DOCUMENT) {
            switch(parserEvent) {
                case XmlPullParser.START_DOCUMENT:
                    break;

                case XmlPullParser.START_TAG:
                    preName = parser.getName();
                    break;

                case XmlPullParser.END_TAG:
                    preName = null;
                    break;

                case XmlPullParser.TEXT:
                    Debug.debugPrintString("GGXMLParser.baseInfoItemParser switch case TEXT preName", preName);
                    Debug.debugPrintString("GGXMLParser.baseInfoItemParser switch case TEXT getText", parser.getText());
                    if(preName == null) break;
                    else if(preName.equals("errMsg")) baseInfoItem.setErrMsg(parser.getText());
                    else if(preName.equals("returnCode")) baseInfoItem.setReturnCode(parser.getText());
                    else if(preName.equals("resultCode")) baseInfoItem.setResultCode(parser.getText());
                    else if(preName.equals("areaDownloadUrl")) baseInfoItem.setAreaDownloadUrl(parser.getText());
                    else if(preName.equals("routeDownloadUrl")) baseInfoItem.setRouteDownloadUrl(parser.getText());
                    else if(preName.equals("routeLineDownloadUrl")) baseInfoItem.setRouteLineDownloadUrl(parser.getText());
                    else if(preName.equals("routeStationDownloadUrl")) baseInfoItem.setRouteStationDownloadUrl(parser.getText());
                    else if(preName.equals("stationDownloadUrl")) baseInfoItem.setStationDownloadUrl(parser.getText());
                    break;
            }
            parserEvent = parser.next();
        }
        Debug.debugPrintString("GGXMLParser.baseInfoItemParser", baseInfoItem.toString());
        return baseInfoItem;
    }

    public ArrayList<Bus> busArrivalListParser(String busArrivalListRequested) throws IOException, XmlPullParserException {
        ArrayList<Bus> busArrivalArrayList = new ArrayList();
        XmlPullParserFactory parserCreator = XmlPullParserFactory.newInstance();
        XmlPullParser parser = parserCreator.newPullParser();

        Debug.debugPrintString("GGXMLParser.busArrivalListParser", busArrivalListRequested);

        parser.setInput(new StringReader(busArrivalListRequested)); // String을 Reader형태로 해주는 클래스(IO나 File Reader처럼 해주는 듯하다)
        parser.next();

        int parserEvent = parser.getEventType();
        String preName = null;

        Bus bus = new Bus();

        while(parserEvent != XmlPullParser.END_DOCUMENT) {
            switch(parserEvent) {
                case XmlPullParser.START_TAG:
                    preName = parser.getName();
                    break;

                case XmlPullParser.END_TAG:
                    preName = null;
                    break;

                case XmlPullParser.TEXT:
                    Debug.debugPrintString("GGXMLParser.busArrivalListParser switch case TEXT preName", preName);
                    Debug.debugPrintString("GGXMLParser.busArrivalListParser switch case TEXT getText", parser.getText());
                    if(preName == null) break;
                    else if(preName.equals("delayYn1")) bus.setDelayYn1(parser.getText());
                    else if(preName.equals("delayYn2")) bus.setDelayYn2(parser.getText());
                    else if(preName.equals("drvEnd")) bus.setDrvEnd(parser.getText());
                    else if(preName.equals("flag")) bus.setFlag(parser.getText());
                    else if(preName.equals("locationNo1")) bus.setLocationNo1(parser.getText());
                    else if(preName.equals("locationNo2")) bus.setLocationNo2(parser.getText());
                    else if(preName.equals("lowPlate1")) bus.setLowPlate1(parser.getText());
                    else if(preName.equals("lowPlate2")) bus.setLowPlate2(parser.getText());
                    else if(preName.equals("plateNo1")) bus.setPlatNo1(parser.getText());
                    else if(preName.equals("plateNo2")) bus.setPlatNo2(parser.getText());
                    else if(preName.equals("predictTime1")) bus.setPredictTime1(parser.getText());
                    else if(preName.equals("predictTime2")) bus.setPredictTime2(parser.getText());
                    else if(preName.equals("remainSeatCnt1")) bus.setRemainSeatCnt1(parser.getText());
                    else if(preName.equals("remainSeatCnt2")) bus.setRemainSeatCnt2(parser.getText());
                    else if(preName.equals("routeId")) bus.setRouteId(parser.getText());
                    else if(preName.equals("staOrder")) bus.setStaOrder(parser.getText());
                    else if(preName.equals("stationId")) {
                        bus.setStationId(parser.getText());
                        busArrivalArrayList.add(bus);
                        bus = new Bus();
                    }

                    break;
            }
            parserEvent = parser.next();
        }

        int i=0;
        while(i != busArrivalArrayList.size()) {
            Debug.debugPrintString(Debug.DEBUG_GG_XML_PARSER, "busArrivalListParser", busArrivalArrayList.get(i).toString());
            i++;
        }

        return busArrivalArrayList;
    }

    public Bus busArrivalItemParser(String busArrivalItemRequested) throws XmlPullParserException, IOException {
        Bus bus = new Bus();

        XmlPullParserFactory parserCreator = XmlPullParserFactory.newInstance();
        XmlPullParser parser = parserCreator.newPullParser();

        Debug.debugPrintString("GGXMLParser.busArrivalItemParser", busArrivalItemRequested);

        parser.setInput(new StringReader(busArrivalItemRequested)); // String을 Reader형태로 해주는 클래스(IO나 File Reader처럼 해주는 듯하다)
        parser.next();

        int parserEvent = parser.getEventType();
        String preName = null;

        while(parserEvent != XmlPullParser.END_DOCUMENT) {
            switch(parserEvent) {
                case XmlPullParser.START_DOCUMENT:
                    break;

                case XmlPullParser.START_TAG:
                    preName = parser.getName();
                    break;

                case XmlPullParser.END_TAG:
                    preName = null;
                    break;

                case XmlPullParser.TEXT:
                    Debug.debugPrintString("GGXMLParser.busArrivalItemParser switch case TEXT preName", preName);
                    Debug.debugPrintString("GGXMLParser.busArrivalItemParser switch case TEXT getText", parser.getText());
                    if(preName == null) break;
                    else if(preName.equals("delayYn1")) bus.setDelayYn1(parser.getText());
                    else if(preName.equals("delayYn2")) bus.setDelayYn2(parser.getText());
                    else if(preName.equals("drvEnd")) bus.setDrvEnd(parser.getText());
                    else if(preName.equals("flag")) bus.setFlag(parser.getText());
                    else if(preName.equals("locationNo1")) bus.setLocationNo1(parser.getText());
                    else if(preName.equals("locationNo2")) bus.setLocationNo2(parser.getText());
                    else if(preName.equals("lowPlate1")) bus.setLowPlate1(parser.getText());
                    else if(preName.equals("lowPlate2")) bus.setLowPlate2(parser.getText());
                    else if(preName.equals("plateNo1")) bus.setPlatNo1(parser.getText());
                    else if(preName.equals("plateNo2")) bus.setPlatNo2(parser.getText());
                    else if(preName.equals("predictTime1")) bus.setPredictTime1(parser.getText());
                    else if(preName.equals("predictTime2")) bus.setPredictTime2(parser.getText());
                    else if(preName.equals("remainSeatCnt1")) bus.setRemainSeatCnt1(parser.getText());
                    else if(preName.equals("remainSeatCnt2")) bus.setRemainSeatCnt2(parser.getText());
                    else if(preName.equals("routeId")) bus.setRouteId(parser.getText());
                    else if(preName.equals("staOrder")) bus.setStaOrder(parser.getText());
                    else if(preName.equals("stationId")) bus.setStationId(parser.getText());
                    break;
            }
            parserEvent = parser.next();
        }
        Debug.debugPrintString("GGXMLParser.busArrivalItemParser", bus.toString());
        return bus;
    }

    public ArrayList<BusLocation> busLocationListParser(String busLocationListRequested) throws XmlPullParserException, IOException {
        ArrayList<BusLocation> busLocationArrayList = new ArrayList();

        XmlPullParserFactory parserCreator = XmlPullParserFactory.newInstance();
        XmlPullParser parser = parserCreator.newPullParser();

        Debug.debugPrintString("GGXMLParser.busLocationListParser", busLocationListRequested);

        parser.setInput(new StringReader(busLocationListRequested)); // String을 Reader형태로 해주는 클래스(IO나 File Reader처럼 해주는 듯하다)
        parser.next();

        int parserEvent = parser.getEventType();
        String preName = null;

        BusLocation busLocation = new BusLocation();

        while(parserEvent != XmlPullParser.END_DOCUMENT) {
            switch(parserEvent) {
                case XmlPullParser.START_TAG:
                    preName = parser.getName();
                    break;

                case XmlPullParser.END_TAG:
                    preName = null;
                    break;

                case XmlPullParser.TEXT:
                    Debug.debugPrintString("GGXMLParser.busLocationListParser switch case TEXT preName", preName);
                    Debug.debugPrintString("GGXMLParser.busLocationListParser switch case TEXT getText", parser.getText());
                    if(preName == null) break;
                    else if(preName.equals("endBus")) busLocation.setEndBUs(parser.getText());
                    else if(preName.equals("lowPlate")) busLocation.setLowPlate(parser.getText());
                    else if(preName.equals("plateNo")) busLocation.setPlateNo(parser.getText());
                    else if(preName.equals("remainSeatCnt")) busLocation.setRemainSeatCnt(parser.getText());
                    else if(preName.equals("routeId")) busLocation.setRouteId(parser.getText());
                    else if(preName.equals("stationId")) busLocation.setStationId(parser.getText());
                    else if(preName.equals("stationSeq")) {
                        busLocation.setStationSeq(parser.getText());
                        busLocationArrayList.add(busLocation);
                        busLocation = new BusLocation();
                    }

                    break;
            }

            parserEvent = parser.next();
        }

        int i=0;
        while(i != busLocationArrayList.size()) {
            Debug.debugPrintString(Debug.DEBUG_GG_XML_PARSER, "busLocationListParser", busLocationArrayList.get(i).toString());
            i++;
        }

        return busLocationArrayList;
    }
}
