package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityEnglishmodule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_englishmodule);
        getSupportActionBar().hide();
    }

    public void btnenglishmodule1(View view) {
        Intent btnenglishmodule1 = new Intent(MainActivityEnglishmodule.this,englishmodule1.class);
        startActivity(btnenglishmodule1);
    }

    public void btnenglishmodule2(View view) {
        Intent btnenglishmodule2 = new Intent(MainActivityEnglishmodule.this,englishmodule2.class);
        startActivity(btnenglishmodule2);
    }

    public void btnenglishmodule3(View view) {
        Intent btnenglishmodule3 = new Intent(MainActivityEnglishmodule.this,englishmodule3.class);
        startActivity(btnenglishmodule3);
    }

    public void btnenglishmodule4(View view) {
        Intent btnenglishmodule4 = new Intent(MainActivityEnglishmodule.this,englishmodule4.class);
        startActivity(btnenglishmodule4);
    }

    public void btnquizenglish(View view) {
        Intent btnquizenglish = new Intent(MainActivityEnglishmodule.this,quizenglish.class);
        startActivity(btnquizenglish);
    }
}

