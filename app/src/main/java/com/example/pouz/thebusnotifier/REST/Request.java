package com.example.pouz.thebusnotifier.REST;

import android.os.AsyncTask;

import com.example.pouz.thebusnotifier.Debug.Debug;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by PouZ on 2016-12-07.
 */

public class Request extends AsyncTask<String, Void, String> {

    /* SERVICE LOCAL */
    protected static int SERVICE_TYPE_GG = 1; /* 경기 */
    //protected static int SERVICE_TYPE_SW = 2; /* 서울 */

    // Constructor
    protected Request() {
    }

    @Override
    protected String doInBackground(String... strings) {
        try {
            return getRest(strings);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    protected String getRest(String... appends) throws IOException {
        StringBuilder fullURL = new StringBuilder();

        // 차후에는 숫자로 바꾸고 case 문을 쓰는게 노멀한가?
        // SW와 GG가 서비스키가 다르다면 여기서 분기 줘야함

        for(String str:appends) {
            fullURL.append(str);
        }

        if(Debug.DEBUG_REQUEST) {
            System.out.println("Final Constructor URL in Request.class");
            System.out.println(fullURL.toString());
        }

        URL url = new URL(fullURL.toString());
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();

        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/XML");
        if(Debug.DEBUG_REQUEST) {
            System.out.println("Response Code in Request.class");
            System.out.println(conn.getResponseCode());
        }

        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <=300)
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        else
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));

        StringBuilder sb = new StringBuilder();
        String line;
        while((line = rd.readLine()) != null)
            sb.append(line);

        rd.close();
        conn.disconnect();
        if(Debug.DEBUG_REQUEST)
            System.out.println(sb.toString());

        return sb.toString();
    }
}