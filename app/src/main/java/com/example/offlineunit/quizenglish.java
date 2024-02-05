package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class quizenglish extends AppCompatActivity {
private PDFView quizenglish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizenglish);
        getSupportActionBar().hide();
        quizenglish = (PDFView)findViewById(R.id.quizenglish);
        quizenglish.fromAsset("quizenglish.pdf").load();



    }
}