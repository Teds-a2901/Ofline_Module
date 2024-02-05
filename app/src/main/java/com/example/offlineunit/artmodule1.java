package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class artmodule1 extends AppCompatActivity {
private PDFView artmodule1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artmodule1);
        getSupportActionBar().hide();
        artmodule1 = (PDFView)findViewById(R.id.artmodule1);
        artmodule1.fromAsset("artm1.pdf").load();
    }
}