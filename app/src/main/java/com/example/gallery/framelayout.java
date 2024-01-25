package com.example.gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.gallery.fragments.OneFragment;

public class framelayout extends AppCompatActivity {

    Button btnFrame1, btnFrame2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_framelayout);

        btnFrame1 = findViewById(R.id.btn_fragment1);
        btnFrame2 = findViewById(R.id.btn_fragment2);


        // memberi tampilan yang diambil dari component framelayouts
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_rslt, new OneFragment()).commit();
    }
}