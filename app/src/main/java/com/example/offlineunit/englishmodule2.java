package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class englishmodule2 extends AppCompatActivity {
private PDFView englishmodule2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_englishmodule2);
        getSupportActionBar().hide();
        englishmodule2 = (PDFView)findViewById(R.id.englishmodule2);
        englishmodule2.fromAsset("englishm2.pdf").load();
    }
}