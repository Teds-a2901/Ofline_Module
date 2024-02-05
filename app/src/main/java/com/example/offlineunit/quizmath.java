package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class quizmath extends AppCompatActivity {
private PDFView quizmath;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizmath);
        getSupportActionBar().hide();
        quizmath = (PDFView)findViewById(R.id.quizmath);
        quizmath.fromAsset("quizsmath.pdf").load();
    }
}