package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityMusicmodule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_musicmodule);
        getSupportActionBar().hide();
    }

    public void btnmusicmodule1(View view) {
        Intent btnmusicmodule1 = new Intent(MainActivityMusicmodule.this,musicmodule1.class);
        startActivity(btnmusicmodule1);
    }

    public void btnmusicmodule2(View view) {
        Intent btnmusicmodule2 = new Intent(MainActivityMusicmodule.this,musicmodule2.class);
        startActivity(btnmusicmodule2);
    }

    public void btnmusicmodule3(View view) {
        Intent btnmusicmodule3 = new Intent(MainActivityMusicmodule.this,musicmodule3.class);
        startActivity(btnmusicmodule3);
    }

    public void btnmusicmodule4(View view) {
        Intent btnmusicmodule4 = new Intent(MainActivityMusicmodule.this,musicmodule4.class);
        startActivity(btnmusicmodule4);
    }

    public void btnmusicmodule5(View view) {
        Intent btnmusicmodule5 = new Intent(MainActivityMusicmodule.this,musicmodule5.class);
        startActivity(btnmusicmodule5);
    }

    public void btnquizmusic(View view) {
        Intent btnquizmusic = new Intent(MainActivityMusicmodule.this,quizmusic.class);
        startActivity(btnquizmusic);
    }
}