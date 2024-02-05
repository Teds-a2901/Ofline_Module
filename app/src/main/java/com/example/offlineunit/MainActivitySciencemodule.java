package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivitySciencemodule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sciencemodule);
        getSupportActionBar().hide();
    }

    public void btnsciencemodule1(View view) {
        Intent btnsciencemodule1 = new Intent(MainActivitySciencemodule.this,sciencemodule1.class);
        startActivity(btnsciencemodule1);
    }

    public void btnsciencemodule2(View view) {
        Intent btnsciencemodule2 = new Intent(MainActivitySciencemodule.this,sciencemodule2.class);
        startActivity(btnsciencemodule2);
    }

    public void btnsciencemodule3(View view) {
        Intent btnciencemodule3 = new Intent(MainActivitySciencemodule.this,sciencemodule3.class);
        startActivity(btnciencemodule3);
    }

    public void btnsciencemodule4(View view) {
        Intent btnsciencemodule4 = new Intent(MainActivitySciencemodule.this,sciencemodule4.class);
        startActivity(btnsciencemodule4);
    }

    public void btnsciencemodule5(View view) {
        Intent btnsciencemodule5 = new Intent(MainActivitySciencemodule.this,sciencemodule5.class);
        startActivity(btnsciencemodule5);
    }

    public void btnquizscience(View view) {
        Intent btnquizscience = new Intent(MainActivitySciencemodule.this,quizscience.class);
        startActivity(btnquizscience);
    }
}