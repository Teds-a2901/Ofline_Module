package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityMathmodule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_mathmodule);
        getSupportActionBar().hide();

    }

    public void btnmathmodule1(View view) {
        Intent btnmathmodule1 = new Intent(MainActivityMathmodule.this,mathmodule1.class);
        startActivity(btnmathmodule1);
    }

    public void btnmathmodule2(View view) {
        Intent btnmathmodule2 = new Intent(MainActivityMathmodule.this,mathmodule2.class);
        startActivity(btnmathmodule2);
    }

    public void btnmathmodule3(View view) {
        Intent btnmathmodule3 = new Intent(MainActivityMathmodule.this,mathmodule3.class);
        startActivity(btnmathmodule3);
    }

    public void btnmathmodule4(View view) {
        Intent btnmathmoudle4 = new Intent(MainActivityMathmodule.this,mathmodule4.class);
        startActivity(btnmathmoudle4);
    }

    public void btnmathmodule5(View view) {
        Intent btnmathmoudle5 = new Intent(MainActivityMathmodule.this,mathmodule5.class);
        startActivity(btnmathmoudle5);
    }

    public void btnquizmath(View view) {
        Intent btnquizmath = new Intent(MainActivityMathmodule.this,quizmath.class);
        startActivity(btnquizmath);
    }
}