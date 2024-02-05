package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class mathmodule4 extends AppCompatActivity {
private PDFView mathmodule4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathmodule4);
        getSupportActionBar().hide();
        mathmodule4 = (PDFView)findViewById(R.id.mathmodule4);
        mathmodule4.fromAsset("mathm4.pdf").load();
    }
}