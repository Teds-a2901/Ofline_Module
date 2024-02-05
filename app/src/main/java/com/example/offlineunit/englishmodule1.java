package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class englishmodule1 extends AppCompatActivity {
private PDFView englishmodule1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_englishmodule1);
        getSupportActionBar().hide();
        englishmodule1 = (PDFView)findViewById(R.id.englishmodule1);
        englishmodule1.fromAsset("englishm1.pdf").load();

    }
}