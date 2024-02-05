package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class eppmodule2 extends AppCompatActivity {
private PDFView eppmodule2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eppmodule2);
        getSupportActionBar().hide();
        eppmodule2 = (PDFView)findViewById(R.id.eppmodule2);
        eppmodule2.fromAsset("eppm2.pdf").load();
    }
}