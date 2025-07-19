package com.example.thaiteagalleryapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    ImageView detailImage;
    TextView detailName, recipeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        detailImage = findViewById(R.id.detailImage);
        detailName = findViewById(R.id.detailName);
        recipeText = findViewById(R.id.recipeTextView);

        // Ambil data dari Intent
        int imageRes = getIntent().getIntExtra("image", 0);
        String name = getIntent().getStringExtra("name");
        String recipe = getIntent().getStringExtra("recipe");

        // Validasi data
        if (imageRes != 0) {
            detailImage.setImageResource(imageRes);
        } else {
            Toast.makeText(this, "Gambar tidak ditemukan", Toast.LENGTH_SHORT).show();
        }

        detailName.setText(name != null ? name : "Tanpa Nama");
        recipeText.setText(recipe != null ? recipe : "Tidak ada resep tersedia");
    }
}
