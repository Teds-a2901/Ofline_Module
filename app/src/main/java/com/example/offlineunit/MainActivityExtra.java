package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageButton;

public class MainActivityExtra extends AppCompatActivity {

    ImageButton btnexercises, btnyoga,btncrossword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_extra);
        getSupportActionBar().hide();

        btnexercises = (ImageButton)findViewById(R.id.btnexercise);
        btnyoga = (ImageButton)findViewById(R.id.btnyoga);
        btncrossword = (ImageButton)findViewById(R.id.btncrossword);

        btnexercises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnexercies = new Intent(MainActivityExtra.this,MainActivityExercises.class);
                startActivity(btnexercies);
            }
        });
        btnyoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnyoga = new Intent(MainActivityExtra.this,MainActivityYoga.class);
                startActivity(btnyoga);
            }
        });

        btncrossword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnyoga = new Intent(MainActivityExtra.this,MainActivityCrossword.class);
                startActivity(btnyoga);
            }
        });
    }
}