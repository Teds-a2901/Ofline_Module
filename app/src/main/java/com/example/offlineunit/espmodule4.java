package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class espmodule4 extends AppCompatActivity {
private PDFView espmodule4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espmodule4);
        getSupportActionBar().hide();
        espmodule4 = (PDFView)findViewById(R.id.espmodule4);
        espmodule4.fromAsset("espm4.pdf").load();
    }
}