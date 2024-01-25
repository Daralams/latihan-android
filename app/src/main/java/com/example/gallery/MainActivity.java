package com.example.gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    Intent intent;
    LinearLayout detailKamera, detailFavorite, detailVideo, detailSs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        detailKamera = findViewById(R.id.detailKamera);
        detailFavorite = findViewById(R.id.detailFavorite);
        detailVideo = findViewById(R.id.detailVideo);
        detailSs = findViewById(R.id.detailSs);

        //eksplisit intent

        detailKamera.setOnClickListener(v -> {
            intent = new Intent(MainActivity.this, detailKamera.class);
            startActivity(intent);
        });

        detailFavorite.setOnClickListener(v -> {
            intent = new Intent(MainActivity.this, detailFavorite.class);
            startActivity(intent);
        });

        detailVideo.setOnClickListener(v -> {
            intent = new Intent(MainActivity.this, detailVideo.class);
            // mengirim data ke intent activity detailVideo
            intent.putExtra("message", "Data dari Main activity derr..");
            startActivity(intent);
        });

        detailSs.setOnClickListener(v -> {
            intent = new Intent(MainActivity.this, detailSs.class);
            startActivity(intent);
        });
    }
}