package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pemodule1 extends AppCompatActivity {
private PDFView pemodule1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemodule1);
        getSupportActionBar().hide();
        pemodule1 = (PDFView)findViewById(R.id.pemodule1);
        pemodule1.fromAsset("pem1.pdf").load();
    }
}