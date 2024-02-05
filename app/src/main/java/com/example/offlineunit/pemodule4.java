package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pemodule4 extends AppCompatActivity {
private PDFView pemodule4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemodule4);
        getSupportActionBar().hide();
        pemodule4 = (PDFView)findViewById(R.id.pemodule4);
        pemodule4.fromAsset("pem4.pdf").load();
    }
}