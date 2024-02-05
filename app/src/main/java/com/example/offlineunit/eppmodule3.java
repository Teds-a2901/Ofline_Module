package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class eppmodule3 extends AppCompatActivity {
private PDFView eppmodule3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eppmodule3);
        getSupportActionBar().hide();
        eppmodule3 = (PDFView)findViewById(R.id.eppmodule3);
        eppmodule3.fromAsset("eppm3.pdf").load();
    }
}