package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityArtmodule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_artmodule);
        getSupportActionBar().hide();
    }

    public void btnartmodule1(View view) {
        Intent btnartmodule1 = new  Intent(MainActivityArtmodule.this,artmodule1.class);
        startActivity(btnartmodule1);
    }

    public void btnartmodule2(View view) {
        Intent btnartmodule2 = new  Intent(MainActivityArtmodule.this,artmodule2.class);
        startActivity(btnartmodule2);
    }

    public void btnartmodule3(View view) {
        Intent btnartmodule3 = new  Intent(MainActivityArtmodule.this,artmodule3.class);
        startActivity(btnartmodule3);
    }

    public void btnartmodule4(View view) {
        Intent btnartmodule4 = new  Intent(MainActivityArtmodule.this,artmodule4.class);
        startActivity(btnartmodule4);
    }

    public void btnartmodule5(View view) {
        Intent btnartmodule5 = new  Intent(MainActivityArtmodule.this,artmodule5.class);
        startActivity(btnartmodule5);
    }

    public void btnquizart(View view) {
        Intent btnquizart = new Intent(MainActivityArtmodule.this,quizart.class);
        startActivity(btnquizart);
    }
}