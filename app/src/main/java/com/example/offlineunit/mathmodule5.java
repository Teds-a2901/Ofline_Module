package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class mathmodule5 extends AppCompatActivity {
private PDFView mathmodule5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathmodule5);
        getSupportActionBar().hide();
        mathmodule5 = (PDFView)findViewById(R.id.mathmodule5);
        mathmodule5.fromAsset("mathm5.pdf").load();
    }
}