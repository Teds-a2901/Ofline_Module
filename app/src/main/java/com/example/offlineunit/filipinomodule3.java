package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class filipinomodule3 extends AppCompatActivity {
private PDFView filipinomodule3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filipinomodule3);
        getSupportActionBar().hide();
        filipinomodule3 = (PDFView)findViewById(R.id.filipinomodule3);
        filipinomodule3.fromAsset("filipinom3.pdf").load();
    }
}