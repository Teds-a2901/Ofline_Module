package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class quizscience extends AppCompatActivity {
private PDFView quizscience;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizscience);
        getSupportActionBar().hide();
        quizscience = (PDFView)findViewById(R.id.quizscience);
        quizscience.fromAsset("quizscience.pdf").load();

    }
}