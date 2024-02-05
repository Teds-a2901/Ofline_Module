package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class quizhealth extends AppCompatActivity {
private PDFView quizhealth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizhealth);
        getSupportActionBar().hide();
        quizhealth =(PDFView)findViewById(R.id.quizhealth);
        quizhealth.fromAsset("quizhealth.pdf").load();
    }
}