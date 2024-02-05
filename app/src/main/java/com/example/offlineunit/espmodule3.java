package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class espmodule3 extends AppCompatActivity {
private PDFView espmodule3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espmodule3);
        getSupportActionBar().hide();
        espmodule3 = (PDFView)findViewById(R.id.espmodule3);
        espmodule3.fromAsset("espm3.pdf").load();
    }
}