package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class musicmodule3 extends AppCompatActivity {
private PDFView musicmodule3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musicmodule3);
        getSupportActionBar().hide();
        musicmodule3 = (PDFView)findViewById(R.id.musicmodule3);
        musicmodule3.fromAsset("musicm3.pdf").load();
    }
}