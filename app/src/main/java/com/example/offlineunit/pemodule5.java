package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pemodule5 extends AppCompatActivity {
private PDFView pemodule5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemodule5);
        getSupportActionBar().hide();
        pemodule5 = (PDFView)findViewById(R.id.pemodule5);
        pemodule5.fromAsset("pem5.pdf").load();
    }
}