package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class apmodule1 extends AppCompatActivity {
private PDFView apmodule1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apmodule1);
        getSupportActionBar().hide();
        apmodule1 = (PDFView)findViewById(R.id.apmodule1);
        apmodule1.fromAsset("apm1.pdf").load();
    }
}