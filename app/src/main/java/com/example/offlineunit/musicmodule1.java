package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class musicmodule1 extends AppCompatActivity {
private PDFView musicmodule1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musicmodule1);
        getSupportActionBar().hide();
        musicmodule1 = (PDFView)findViewById(R.id.musicmodule1);
        musicmodule1.fromAsset("musicm1.pdf").load();
    }
}