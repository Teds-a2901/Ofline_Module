package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class filipinomodule4 extends AppCompatActivity {
private PDFView filipinomodule4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filipinomodule4);
        getSupportActionBar().hide();
        filipinomodule4 = (PDFView)findViewById(R.id.filipinomodule4);
        filipinomodule4.fromAsset("filipinom4.pdf").load();
    }
}