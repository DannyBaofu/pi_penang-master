package com.chiakbo.pi_penang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

import static com.chiakbo.pi_penang.R.layout.activity_splashscreen;

public class splashscreen extends AppCompatActivity {
    private static int splashlengthdisplay = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(splashscreen.this,MainActivity.class);
                startActivity(mainIntent);
                finish();

            }
        }, splashlengthdisplay);
    }
}
