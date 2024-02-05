package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class espmodule1 extends AppCompatActivity {
private PDFView espmodule1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espmodule1);
        getSupportActionBar().hide();
        espmodule1 = (PDFView)findViewById(R.id.espmodule1);
        espmodule1.fromAsset("espm1.pdf").load();
    }
}