package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class englishmodule4 extends AppCompatActivity {
private PDFView englishmodule4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_englishmodule4);
        getSupportActionBar().hide();
        englishmodule4 = (PDFView)findViewById(R.id.englishmodule4);
        englishmodule4.fromAsset("englishm4.pdf").load();

    }
}