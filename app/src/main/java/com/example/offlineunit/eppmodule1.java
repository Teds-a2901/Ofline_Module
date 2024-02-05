package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class eppmodule1 extends AppCompatActivity {
private PDFView eppmodule1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eppmodule1);
        getSupportActionBar().hide();
        eppmodule1 = (PDFView)findViewById(R.id.eppmodule1);
        eppmodule1.fromAsset("eppm1.pdf").load();
    }
}