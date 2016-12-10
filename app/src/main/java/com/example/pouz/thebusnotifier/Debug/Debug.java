package com.example.pouz.thebusnotifier.Debug;

/**
 * Created by PouZ on 2016-12-09.
 */

public class Debug {
    public static boolean DEBUG = true;

    /* 원하는 디버깅 위치에 전역변수 만들어서 ON/OFF 하면 될 듯 */
    public static boolean DEBUG_GG_XML_PARSER = true;
    public static boolean DEBUG_GG_REQUEST = true;
    public static boolean DEBUG_REQUEST = true;

    public static void debugPrintString(String str) {
        if(DEBUG)
            System.out.println("Debug : " + str);
    }

    public static void debugPrintString(boolean debug, String str) {
        if(debug && DEBUG)
            System.out.println("Debug : " + str);
    }

    public static void debugPrintString(String comment, String str) {
        if(DEBUG)
            System.out.println("Debug(" + comment + ") : " + str);
    }

    public static void debugPrintString(boolean debug, String comment, String str) {
        if(debug && DEBUG)
            System.out.println("Debug(" + comment + ") : " + str);
    }
}
