package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityHealthmodule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_healthmodule);
        getSupportActionBar().hide();
    }

    public void btnhealthmodule1(View view) {
        Intent btnhealthmodule1 = new Intent(MainActivityHealthmodule.this,healthmodule1.class);
        startActivity(btnhealthmodule1);
    }

    public void btnhealthmodule2(View view) {
        Intent btnhealthmodule2 = new Intent(MainActivityHealthmodule.this,healthmodule2.class);
        startActivity(btnhealthmodule2);
    }

    public void btnhealthmodule3(View view) {
        Intent btnhealthmodule3 = new Intent(MainActivityHealthmodule.this,healthmodule3.class);
        startActivity(btnhealthmodule3);
    }

    public void btnhealthmodule4(View view) {
        Intent btnhealthmodule4 = new Intent(MainActivityHealthmodule.this,healthmodule4.class);
        startActivity(btnhealthmodule4);
    }

    public void btnhealthmodule5(View view) {
        Intent btnhealthmodule5 = new Intent(MainActivityHealthmodule.this,healthmodule5.class);
        startActivity(btnhealthmodule5);
    }

    public void btnquizhealth(View view) {
        Intent btnquizhealth = new Intent(MainActivityHealthmodule.this,quizhealth.class);
        startActivity(btnquizhealth);
    }
}