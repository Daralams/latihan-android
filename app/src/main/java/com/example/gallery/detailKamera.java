package com.example.gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class detailKamera extends AppCompatActivity {

    Intent intent;
    TextView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kamera);

        back = findViewById(R.id.back);

        back.setOnClickListener(v -> {
            new Intent(detailKamera.this, MainActivity.class);
            startActivity(intent);
        });
    }
}