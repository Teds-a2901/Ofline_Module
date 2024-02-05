package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class eppmodule5 extends AppCompatActivity {
private PDFView eppmodule5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eppmodule5);
        getSupportActionBar().hide();
        eppmodule5 = (PDFView)findViewById(R.id.eppmodule5);
        eppmodule5.fromAsset("eppm5.pdf").load();
    }
}