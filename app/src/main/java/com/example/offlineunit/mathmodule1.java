package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class mathmodule1 extends AppCompatActivity {
private PDFView mathmodule1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathmodule1);
        getSupportActionBar().hide();
        mathmodule1 = (PDFView)findViewById(R.id.mathmodule1);
        mathmodule1.fromAsset("mathm1.pdf").load();

    }
}