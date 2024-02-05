package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class mathmodule3 extends AppCompatActivity {
private PDFView mathmodule3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathmodule3);
        getSupportActionBar().hide();
        mathmodule3 = (PDFView)findViewById(R.id.mathmodule3);
        mathmodule3.fromAsset("mathm3.pdf").load();
    }
}