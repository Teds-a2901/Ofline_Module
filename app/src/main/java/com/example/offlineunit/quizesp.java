package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class quizesp extends AppCompatActivity {
private PDFView quizesp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizesp);
        getSupportActionBar().hide();
        quizesp = (PDFView)findViewById(R.id.quizesp);
        quizesp.fromAsset("quizesp.pdf").load();
    }
}