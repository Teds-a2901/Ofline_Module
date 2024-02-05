package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class sciencemodule2 extends AppCompatActivity {
private PDFView sciencemodule2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sciencemodule2);
        getSupportActionBar().hide();
        sciencemodule2 = (PDFView)findViewById(R.id.sciencemodule2);
        sciencemodule2.fromAsset("sciencem2.pdf").load();
    }
}