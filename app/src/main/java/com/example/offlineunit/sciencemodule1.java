package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class sciencemodule1 extends AppCompatActivity {
private PDFView sciencemodule1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sciencemodule1);
        getSupportActionBar().hide();
        sciencemodule1 = (PDFView)findViewById(R.id.sciencemodule1);
        sciencemodule1.fromAsset("sciencem1.pdf").load();
    }

}