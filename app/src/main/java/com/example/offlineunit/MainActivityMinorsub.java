package com.example.offlineunit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivityMinorsub extends AppCompatActivity {
    ImageButton btnap,btnepp,btnesp,btnmusic,btnart,btnpe,btnhealth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_minorsub);
        getSupportActionBar().hide();

        btnap = (ImageButton)findViewById(R.id.btnap);
        btnepp = (ImageButton)findViewById(R.id.btnepp);
        btnesp = (ImageButton)findViewById(R.id.btnesp);
        btnmusic = (ImageButton)findViewById(R.id.btnmusic);
        btnart = (ImageButton)findViewById(R.id.btnart);
        btnpe = (ImageButton)findViewById(R.id.btnpe);
        btnhealth = (ImageButton)findViewById(R.id.btnhealth);

        btnap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnap = new Intent(MainActivityMinorsub.this,MainActivityApmodule.class);
                startActivity(btnap);
            }
        });

        btnepp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnepp = new Intent(MainActivityMinorsub.this,MainActivityEppmodule.class);
                startActivity(btnepp);
            }
        });
        btnesp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnesp = new Intent(MainActivityMinorsub.this,MainActivityEspmodule.class);
                startActivity(btnesp);
            }
        });
        btnmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmusic = new Intent(MainActivityMinorsub.this,MainActivityMusicmodule.class);
                startActivity(btnmusic);
            }
        });
        btnart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnart = new Intent(MainActivityMinorsub.this,MainActivityArtmodule.class);
                startActivity(btnart);
            }
        });
        btnpe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnpe = new Intent(MainActivityMinorsub.this,MainActivityPemodule.class);
                startActivity(btnpe);
            }
        });
        btnhealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnhealth = new Intent(MainActivityMinorsub.this,MainActivityHealthmodule.class);
                startActivity(btnhealth);
            }
        });



    }
}