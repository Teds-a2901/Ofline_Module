package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class quizmusic extends AppCompatActivity {
private PDFView quizmusic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizmusic);
        getSupportActionBar().hide();
        quizmusic = (PDFView)findViewById(R.id.quizmusic);
        quizmusic.fromAsset("quizmusic.pdf").load();
    }
}