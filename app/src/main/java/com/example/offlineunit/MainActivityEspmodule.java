package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityEspmodule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_espmodule);
        getSupportActionBar().hide();
    }

    public void btnespmodule1(View view) {
        Intent btnespmodule1 = new Intent(MainActivityEspmodule.this,espmodule1.class);
        startActivity(btnespmodule1);
    }

    public void btnespmodule2(View view) {
        Intent btnespmodule2 = new Intent(MainActivityEspmodule.this,espmodule2.class);
        startActivity(btnespmodule2);
    }

    public void btnespmodule3(View view) {
        Intent btnespmodule3 = new Intent(MainActivityEspmodule.this,espmodule3.class);
        startActivity(btnespmodule3);
    }

    public void btnespmodule4(View view) {
        Intent btnespmodule4 = new Intent(MainActivityEspmodule.this,espmodule4.class);
        startActivity(btnespmodule4);
    }

    public void btnquizesp(View view) {
        Intent btnquizesp = new Intent(MainActivityEspmodule.this,quizesp.class);
        startActivity(btnquizesp);
    }
}