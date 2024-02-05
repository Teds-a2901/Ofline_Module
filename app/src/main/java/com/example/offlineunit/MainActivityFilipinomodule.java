package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityFilipinomodule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_filipinomodule);
        getSupportActionBar().hide();
    }

    public void btnfilipinomodule1(View view) {
        Intent btnfilipinomodule1 = new Intent(MainActivityFilipinomodule.this,filipinomodule1.class);
        startActivity(btnfilipinomodule1);
    }

    public void btnfilipinomodule2(View view) {
        Intent btnfiliinomodule2 = new Intent(MainActivityFilipinomodule.this,filipinomodule2.class);
        startActivity(btnfiliinomodule2);
    }

    public void btnfilipinomodule3(View view) {
        Intent btnfilipinomodule3 = new Intent(MainActivityFilipinomodule.this,filipinomodule3.class);
        startActivity(btnfilipinomodule3);
    }

    public void btnfilipinomodule4(View view) {
        Intent btnfilipinomodule4 = new Intent(MainActivityFilipinomodule.this,filipinomodule4.class);
        startActivity(btnfilipinomodule4);
    }

    public void btnfilipinomodule5(View view) {
        Intent btnfilipinomodule5 = new Intent(MainActivityFilipinomodule.this,filipinomodule5.class);
        startActivity(btnfilipinomodule5);
    }

    public void btnquizfilipino(View view) {
        Intent btnquizfilipino = new Intent(MainActivityFilipinomodule.this,quizfilipino.class);
        startActivity(btnquizfilipino);
    }
}