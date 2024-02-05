package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class filipinomodule2 extends AppCompatActivity {
private PDFView filipinomodule2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filipinomodule2);
        getSupportActionBar().hide();
        filipinomodule2 = (PDFView)findViewById(R.id.filipinomodule2);
        filipinomodule2.fromAsset("filipinom2.pdf").load();
    }
}