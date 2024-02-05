package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class healthmodule2 extends AppCompatActivity {
private PDFView healthmodule2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthmodule2);
        getSupportActionBar().hide();
        healthmodule2 = (PDFView)findViewById(R.id.healthmodule2);
        healthmodule2.fromAsset("healthm2.pdf").load();
    }
}