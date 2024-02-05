package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class apmodule4 extends AppCompatActivity {
private PDFView apmodule4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apmodule4);
        getSupportActionBar().hide();
        apmodule4 = (PDFView)findViewById(R.id.apmodule4);
        apmodule4.fromAsset("apm4.pdf").load();
    }
}