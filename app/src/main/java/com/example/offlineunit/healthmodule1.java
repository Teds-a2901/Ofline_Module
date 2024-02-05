package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class healthmodule1 extends AppCompatActivity {
private PDFView healthmodule1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthmodule1);
        getSupportActionBar().hide();
        healthmodule1 = (PDFView)findViewById(R.id.healthmodule1);
        healthmodule1.fromAsset("healthm1.pdf").load();
    }
}