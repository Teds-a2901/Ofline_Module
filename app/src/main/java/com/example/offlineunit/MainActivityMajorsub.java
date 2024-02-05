package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivityMajorsub extends AppCompatActivity {
    ImageButton btnenglish, btnfilipino, btnmath, btnscience;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_majorsub);
        getSupportActionBar().hide();
        btnenglish = (ImageButton)findViewById(R.id.btnenglish);
        btnfilipino = (ImageButton)findViewById(R.id.btnfilipino);
        btnmath = (ImageButton)findViewById(R.id.btnmath);
        btnscience = (ImageButton)findViewById(R.id.btnscience);


        btnenglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnenglish = new Intent(MainActivityMajorsub.this,MainActivityEnglishmodule.class);
                startActivity(btnenglish);
            }
        });
        btnfilipino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnfilipino = new Intent(MainActivityMajorsub.this,MainActivityFilipinomodule.class);
               startActivity(btnfilipino);
            }
        });
        btnscience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnscience = new Intent(MainActivityMajorsub.this,MainActivitySciencemodule.class);
                startActivity(btnscience);
            }
        });
        btnmath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmath = new Intent(MainActivityMajorsub.this,MainActivityMathmodule.class);
                startActivity(btnmath);
            }
        });
    }
}