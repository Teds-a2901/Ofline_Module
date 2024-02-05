package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class filipinomodule5 extends AppCompatActivity {
private PDFView filipinomodule5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filipinomodule5);
        getSupportActionBar().hide();
        filipinomodule5 = (PDFView)findViewById(R.id.filipinomodule5);
        filipinomodule5.fromAsset("filipinom5.pdf").load();
    }
}