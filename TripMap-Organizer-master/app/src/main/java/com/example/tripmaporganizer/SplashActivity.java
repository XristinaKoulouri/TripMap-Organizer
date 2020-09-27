package com.example.tripmaporganizer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, SimpleInputActivity.class);
                startActivity(intent);
            }
        }, 2500);

        //move to test screen
        //Intent test = new Intent(SplashActivity.this, SimpleInputActivity.class);
        //startActivity(test);
    }
}