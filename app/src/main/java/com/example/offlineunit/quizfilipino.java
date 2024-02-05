package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class quizfilipino extends AppCompatActivity {
private PDFView quizfilipino;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizfilipino);
        getSupportActionBar().hide();
        quizfilipino = (PDFView)findViewById(R.id.quizfilipino);
        quizfilipino.fromAsset("quizfilipino.pdf").load();
    }
}