package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class healthmodule4 extends AppCompatActivity {
private PDFView healthmodule4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthmodule4);
        getSupportActionBar().hide();
        healthmodule4 =(PDFView)findViewById(R.id.healthmodule4);
        healthmodule4.fromAsset("healthm4.pdf").load();

    }
}