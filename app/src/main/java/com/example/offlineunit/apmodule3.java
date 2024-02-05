package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class apmodule3 extends AppCompatActivity {
private PDFView apmodule3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apmodule3);
        getSupportActionBar().hide();
        apmodule3 = (PDFView)findViewById(R.id.apmodule3);
        apmodule3.fromAsset("apm3.pdf").load();
    }
}