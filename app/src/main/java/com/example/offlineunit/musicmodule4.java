package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class musicmodule4 extends AppCompatActivity {
private PDFView musicmodule4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musicmodule4);
        getSupportActionBar().hide();
        musicmodule4 = (PDFView)findViewById(R.id.musicmodule4);
        musicmodule4.fromAsset("musicm4.pdf").load();
    }
}