package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class mathmodule2 extends AppCompatActivity {
private PDFView mathmodule2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathmodule2);
        getSupportActionBar().hide();
        mathmodule2 = (PDFView)findViewById(R.id.mathmodule2);
        mathmodule2.fromAsset("mathm2.pdf").load();
    }
}