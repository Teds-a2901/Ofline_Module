package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class apmodule2 extends AppCompatActivity {
private PDFView apmodule2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apmodule2);
        getSupportActionBar().hide();
        apmodule2 = (PDFView)findViewById(R.id.apmodule2);
        apmodule2.fromAsset("apm2.pdf").load();
    }
}