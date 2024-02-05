package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class artmodule5 extends AppCompatActivity {
private PDFView artmodule5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artmodule5);
        getSupportActionBar().hide();
        artmodule5 = (PDFView)findViewById(R.id.artmodule5);
        artmodule5.fromAsset("artm5.pdf").load();
    }
}