package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityEppmodule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_eppmodule);
        getSupportActionBar().hide();
    }

    public void btneppmodule1(View view) {
        Intent btneppmodule1 = new Intent(MainActivityEppmodule.this,eppmodule1.class);
        startActivity(btneppmodule1);
    }

    public void btneppmodule2(View view) {
        Intent btneppmodule2 = new Intent(MainActivityEppmodule.this,eppmodule2.class);
        startActivity(btneppmodule2);
    }

    public void btneppmodule3(View view) {
        Intent btneppmodule3 = new Intent(MainActivityEppmodule.this,eppmodule3.class);
        startActivity(btneppmodule3);
    }

    public void btneppmodule4(View view) {
        Intent btneppmodule4 = new Intent(MainActivityEppmodule.this,eppmodule4.class);
        startActivity(btneppmodule4);
    }

    public void btneppmodule5(View view) {
        Intent btneppmodule5 = new Intent(MainActivityEppmodule.this,eppmodule5.class);
        startActivity(btneppmodule5);
    }

    public void btnquizepp(View view) {
        Intent btnquizepp = new Intent(MainActivityEppmodule.this,quizepp.class);
        startActivity(btnquizepp);
    }
}