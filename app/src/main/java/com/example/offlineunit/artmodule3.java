package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class artmodule3 extends AppCompatActivity {
private PDFView artmodule3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artmodule3);
        getSupportActionBar().hide();
        artmodule3 = (PDFView)findViewById(R.id.artmodule3);
        artmodule3.fromAsset("artm3.pdf").load();
    }
}