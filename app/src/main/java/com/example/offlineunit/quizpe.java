package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class quizpe extends AppCompatActivity {
private PDFView quizpe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizpe);
        getSupportActionBar().hide();
        quizpe = (PDFView)findViewById(R.id.quizpe);
        quizpe.fromAsset("quizpe.pdf").load();
    }
}