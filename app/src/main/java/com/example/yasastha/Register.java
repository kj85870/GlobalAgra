package com.example.yasastha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_register );
        Button btn2;
        TextView text3;


        btn2 = findViewById( R.id.btn );
        text3 = findViewById( R.id.text );

        btn2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( Register.this,SignUp.class );
                startActivity( i );
            }
        } );

        text3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( Register.this,SignUp.class );
                startActivity( i );
            }
        } );

    }
}
