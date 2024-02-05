package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class sciencemodule3 extends AppCompatActivity {
private PDFView sciencemodule3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sciencemodule3);
        getSupportActionBar().hide();
        sciencemodule3 = (PDFView)findViewById(R.id.sciencemodule3);
        sciencemodule3.fromAsset("sciencem3.pdf").load();
    }
}