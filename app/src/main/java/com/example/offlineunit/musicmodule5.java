package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class musicmodule5 extends AppCompatActivity {
private PDFView musicmodule5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musicmodule5);
        getSupportActionBar().hide();
        musicmodule5 = (PDFView)findViewById(R.id.musicmodule5);
        musicmodule5.fromAsset("musicm5.pdf").load();
    }
}