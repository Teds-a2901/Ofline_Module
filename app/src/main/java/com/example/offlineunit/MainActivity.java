package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnmajor,btnextra,btnminor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        btnmajor = (ImageButton)findViewById(R.id.btnmajor);
        btnextra = (ImageButton)findViewById(R.id.btnextra);
        btnminor = (ImageButton)findViewById(R.id.btnminor);

        btnmajor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmajor = new Intent(MainActivity.this,MainActivityMajorsub.class);
                startActivity(btnmajor);
            }
        });

        btnextra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnextra = new Intent(MainActivity.this,MainActivityExtra.class);
                startActivity(btnextra);
            }
        });

        btnminor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnminor = new Intent(MainActivity.this,MainActivityMinorsub.class);
                startActivity(btnminor);
            }
        });



    }
}