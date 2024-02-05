package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pemodule2 extends AppCompatActivity {
private PDFView pemodule2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemodule2);
        getSupportActionBar().hide();
        pemodule2 = (PDFView)findViewById(R.id.pemodule2);
        pemodule2.fromAsset("pem2.pdf").load();
    }
}