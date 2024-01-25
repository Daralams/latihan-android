package com.example.gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class detailVideo extends AppCompatActivity {

    Intent intent;
    Button btnlinkYt, btnLink, btnTlpDiallNumber, btnFragmentLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_video);

        // mengambil data dari intent Main Activity
//        Toast.makeText(this, getIntent().getStringExtra("message"), Toast.LENGTH_SHORT).show();

        String message = getIntent().getStringExtra("message");
        // message disini mengambil dari variabel message
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

        btnlinkYt = findViewById(R.id.btnlink_yt);
        btnLink = findViewById(R.id.btnlink);
        btnTlpDiallNumber = findViewById(R.id.btn_tlpDialNumber);
        btnFragmentLayout = findViewById(R.id.btn_link_fragment);

        //event click btn youtube
        btnlinkYt.setOnClickListener(v -> {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/@ITsatoe-jkt"));
            startActivity(intent);
        });

        //event click
        btnLink.setOnClickListener(v -> {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/daralams"));
            startActivity(intent);
        });

        //event click diall number
        btnTlpDiallNumber.setOnClickListener(v -> {
            intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:0812456789"));
            startActivity(intent);
        });

        //event click btn fragment
        btnFragmentLayout.setOnClickListener(v -> {
            intent = new Intent(detailVideo.this, framelayout.class);
            startActivity(intent);
        });
    }
}