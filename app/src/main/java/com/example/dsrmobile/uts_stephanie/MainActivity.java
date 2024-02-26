package com.example.dsrmobile.uts_stephanie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout ubahProfil;
    LinearLayout riwayatSEP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ubahProfil = (LinearLayout) findViewById(R.id.ubahProfil);
        riwayatSEP = (LinearLayout) findViewById(R.id.riwayatSEP);

        ubahProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ubahProfil.class);
                startActivity(intent);
            }
        });

        riwayatSEP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, riwayatSEP.class);
                startActivity(intent);
            }
        });
    }
}