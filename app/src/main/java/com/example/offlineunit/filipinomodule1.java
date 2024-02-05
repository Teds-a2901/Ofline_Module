package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class filipinomodule1 extends AppCompatActivity {
private PDFView filipinomodule1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filipinomodule1);
        getSupportActionBar().hide();
        filipinomodule1 = (PDFView)findViewById(R.id.filipinomodule1);
        filipinomodule1.fromAsset("filipinom1.pdf").load();
    }
}