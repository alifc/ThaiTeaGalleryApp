package com.example.thaiteagalleryapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    ImageView detailImage;
    TextView detailName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        detailImage = findViewById(R.id.detailImage);
        detailName = findViewById(R.id.detailName);

        // Ambil data dari Intent
        int imageRes = getIntent().getIntExtra("image", 0);
        String name = getIntent().getStringExtra("name");

        // Tampilkan di UI
        detailImage.setImageResource(imageRes);
        detailName.setText(name);

        TextView recipeText = findViewById(R.id.recipeTextView);
        String recipe = getIntent().getStringExtra("recipe");
        recipeText.setText(recipe);

    }
}
