package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class quizart extends AppCompatActivity {
private PDFView quizart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizart);
        getSupportActionBar().hide();
        quizart = (PDFView)findViewById(R.id.quizart);
        quizart.fromAsset("quizart.pdf").load();
    }
}