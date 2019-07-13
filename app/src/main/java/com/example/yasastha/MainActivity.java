package com.example.yasastha;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        new Handler().postDelayed( new Runnable() {
            @Override
            public void run() {
                finish();
                Intent intent = new Intent(MainActivity.this,SignUp.class);
                startActivity(intent);
            }
        },2000);
    }
}
