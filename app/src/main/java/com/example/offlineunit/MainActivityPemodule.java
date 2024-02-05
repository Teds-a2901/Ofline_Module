package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityPemodule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pemodule);
        getSupportActionBar().hide();
    }

    public void btnpemodule1(View view) {
        Intent btnpemodule1 = new Intent(MainActivityPemodule.this,pemodule1.class);
        startActivity(btnpemodule1);
    }

    public void btnpemodule2(View view) {
        Intent btnpemodule2 = new Intent(MainActivityPemodule.this,pemodule2.class);
        startActivity(btnpemodule2);
    }

    public void btnpemodule3(View view) {
        Intent btnpemodule3 = new Intent(MainActivityPemodule.this,pemodule3.class);
        startActivity(btnpemodule3);
    }

    public void btnpemodule4(View view) {
        Intent btnpemodule4 = new Intent(MainActivityPemodule.this,pemodule4.class);
        startActivity(btnpemodule4);
    }

    public void btnpemodule5(View view) {
        Intent btnpemodule5 = new Intent(MainActivityPemodule.this,pemodule5.class);
        startActivity(btnpemodule5);
    }

    public void btnquizpe(View view) {
        Intent btnquizpe = new Intent(MainActivityPemodule.this,quizpe.class);
        startActivity(btnquizpe);
    }
}