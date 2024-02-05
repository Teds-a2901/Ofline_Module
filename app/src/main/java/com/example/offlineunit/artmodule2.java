package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class artmodule2 extends AppCompatActivity {
private PDFView artmodule2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artmodule2);
        getSupportActionBar().hide();
        artmodule2 = (PDFView)findViewById(R.id.artmodule2);
        artmodule2.fromAsset("artm2.pdf").load();
    }
}