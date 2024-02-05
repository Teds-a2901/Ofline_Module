package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class quizap extends AppCompatActivity {
private PDFView quizap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizap);
        getSupportActionBar().hide();
        quizap = (PDFView)findViewById(R.id.quizap);
        quizap.fromAsset("quizap.pdf").load();
    }
}