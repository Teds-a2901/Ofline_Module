package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class sciencemodule5 extends AppCompatActivity {
private PDFView sciencemodule5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sciencemodule5);
        getSupportActionBar().hide();
        sciencemodule5 = (PDFView)findViewById(R.id.sciencemodule5);
        sciencemodule5.fromAsset("sciencem5.pdf").load();
    }
}