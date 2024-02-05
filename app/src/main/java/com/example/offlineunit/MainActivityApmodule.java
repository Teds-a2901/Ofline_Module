package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityApmodule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_apmodule);
        getSupportActionBar().hide();
    }

    public void btnapmodule1(View view) {
        Intent btnmodule1 = new Intent(MainActivityApmodule.this,apmodule1.class);
        startActivity(btnmodule1);
    }

    public void btnapmodule2(View view) {
        Intent btnmodule2 = new Intent(MainActivityApmodule.this,apmodule2.class);
        startActivity(btnmodule2);
    }

    public void btnapmodule3(View view) {
        Intent btnmodule3 = new Intent(MainActivityApmodule.this,apmodule3.class);
        startActivity(btnmodule3);
    }

    public void btnapmodule4(View view) {
        Intent btnmodule4 = new Intent(MainActivityApmodule.this,apmodule4.class);
        startActivity(btnmodule4);
    }

    public void btnapmodule5(View view) {
        Intent btnmodule5 = new Intent(MainActivityApmodule.this,apmodule5.class);
        startActivity(btnmodule5);
    }

    public void btnquizap(View view) {
        Intent btnquizap = new Intent(MainActivityApmodule.this,quizap.class);
        startActivity(btnquizap);
    }
}