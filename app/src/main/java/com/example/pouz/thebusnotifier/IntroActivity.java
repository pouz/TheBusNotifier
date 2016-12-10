package com.example.pouz.thebusnotifier;

/**
 * Created by PouZ on 2016-12-05.
 */

//import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
//import android.support.v7.app.ActionBar;

public class IntroActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro_activity);

        // getSupportAct는 	android.support.v7.app.ActionBarActivity 에서 지원함 이는 아마 minimum SDK에서 걸려 사용할 수 없나봄?
        //ActionBar actionBar = getSupportActionBar();
        //actionBar.hide();

        Handler handler = new Handler();
        // postDelayed()는 특정 시간후에 작업을 처리하기 위해 사용되는 메소드(실행할 동작, 실행 시간)
        // 특정 시간후 작업실행 후 처리 루틴이 필요 -> finish() 통해 해당 액티비티 종료시켜줌.
        handler.postDelayed(new Runnable() {
            public void run() {
                Intent intent = new Intent(IntroActivity.this, MainActivity.class); // 아마도 토스하는 듯, IntroActivity는 현재 실행되는 루틴 안에있고, MainActivity는 Class형태로 소환.
                startActivity(intent);
                // 뒤로가기 했을경우 안나오도록 없애주는것이 finish()
                finish();
            }
        }, 2000); // 2000 millisec 후 시실행.
    }
}
