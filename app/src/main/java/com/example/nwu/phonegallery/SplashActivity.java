package com.example.nwu.phonegallery;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread thread =new Thread() {

            @Override
            public void run() {

                try {
                    sleep(4000);
                }
                catch (Exception e) {}
                finally
                {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    finish();
                }
            }
        };

        thread.start();
    }

}