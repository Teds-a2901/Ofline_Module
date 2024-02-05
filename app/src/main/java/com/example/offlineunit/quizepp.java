package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class quizepp extends AppCompatActivity {
private PDFView quizepp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizepp);
        getSupportActionBar().hide();
        quizepp = (PDFView)findViewById(R.id.quizepp);
        quizepp.fromAsset("quizepp.pdf").load();
    }
}