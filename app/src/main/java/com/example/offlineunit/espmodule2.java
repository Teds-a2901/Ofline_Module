package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class espmodule2 extends AppCompatActivity {
private PDFView espmodule2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espmodule2);
        getSupportActionBar().hide();
        espmodule2 = (PDFView)findViewById(R.id.espmodule2);
        espmodule2.fromAsset("espm2.pdf").load();
    }
}