package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pemodule3 extends AppCompatActivity {
private PDFView pemodule3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemodule3);
        getSupportActionBar().hide();
        pemodule3 = (PDFView)findViewById(R.id.pemodule3);
        pemodule3.fromAsset("pem3.pdf").load();
    }
}