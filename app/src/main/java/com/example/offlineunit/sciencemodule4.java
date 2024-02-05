package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class sciencemodule4 extends AppCompatActivity {
private PDFView sciencemodule4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sciencemodule4);
        getSupportActionBar().hide();
        sciencemodule4 = (PDFView)findViewById(R.id.sciencemodule4);
        sciencemodule4.fromAsset("sciencem4.pdf").load();
    }
}