package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class englishmodule3 extends AppCompatActivity {
private PDFView englishmodule3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_englishmodule3);
        getSupportActionBar().hide();
        englishmodule3 = (PDFView)findViewById(R.id.englishmodule3);
        englishmodule3.fromAsset("englishm3.pdf").load();
    }
}