package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class artmodule4 extends AppCompatActivity {
private PDFView artmodule4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artmodule4);
        getSupportActionBar().hide();
        artmodule4 =(PDFView)findViewById(R.id.artmodule4);
        artmodule4.fromAsset("artm4.pdf").load();
    }
}