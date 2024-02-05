package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.pdf.PdfDocument;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class eppmodule4 extends AppCompatActivity {
private PDFView eppmodule4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eppmodule4);
        getSupportActionBar().hide();
        eppmodule4 = (PDFView)findViewById(R.id.eppmodule4);
        eppmodule4.fromAsset("eppm4.pdf").load();
    }
}