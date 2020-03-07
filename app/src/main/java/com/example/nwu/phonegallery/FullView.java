package com.example.nwu.phonegallery;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FullView extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_view);

        ImageView imageView = findViewById(R.id.img_full);

        int img_id = getIntent().getExtras().getInt("img_id");
        imageView.setImageResource(img_id);
    }



}
