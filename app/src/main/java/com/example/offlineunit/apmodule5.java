package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class apmodule5 extends AppCompatActivity {
private PDFView apmodule5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apmodule5);
        getSupportActionBar().hide();
        apmodule5 = (PDFView)findViewById(R.id.apmodule5);
        apmodule5.fromAsset("apm5.pdf").load();
    }
}