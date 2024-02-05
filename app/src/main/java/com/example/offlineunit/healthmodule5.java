package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class healthmodule5 extends AppCompatActivity {
private PDFView healthmodule5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthmodule5);
        getSupportActionBar().hide();
        healthmodule5 = (PDFView)findViewById(R.id.healthmodule5);
        healthmodule5.fromAsset("healthm5.pdf").load();
    }
}