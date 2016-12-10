package com.example.pouz.thebusnotifier.InfoUpdate;

import android.os.AsyncTask;

import com.example.pouz.thebusnotifier.BusAPI.Object.Information;

/**
 * Created by PouZ on 2016-12-10.
 */

public class GGInfoUpdate extends AsyncTask<String, Void, Integer> {
    // 최초 시행 여부는 인트로에서 해결하는게 맞아 보임
    // 단순 .execution()으로 업데이트를 백그라운드로 지원하고,
    // 완료될 시 Toast 로 알려주는 역할이면 충분할 듯 하다.

    // GGInforParser를 static Inner Class 생성하여 행동에 맞는 파싱 함수를 제공

    public static class GGInfoParser {
        // 아니면 GGInfoUpdate의 static 함수여도 좋다.
        // 가독성으로 보자면 전역 Inner 클래스가 좋아보인다.
        // public static int get zzdd

    }

    @Override
    protected Integer doInBackground(String... strings) {
        return 1;
    }
}
