package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class musicmodule2 extends AppCompatActivity {
private PDFView musicmodule2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musicmodule2);
        getSupportActionBar().hide();
        musicmodule2 = (PDFView)findViewById(R.id.musicmodule2);
        musicmodule2.fromAsset("musicm2.pdf").load();
    }
}