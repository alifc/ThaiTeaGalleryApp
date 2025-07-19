package com.example.thaiteagalleryapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class InputDescriptionActivity extends AppCompatActivity {

    ImageView imageView;
    EditText edtNama, edtDeskripsi;
    Button btnSimpan;

    Uri imageUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_description);

        imageView = findViewById(R.id.imageViewPreview);
        edtNama = findViewById(R.id.editTextNama);
        edtDeskripsi = findViewById(R.id.editTextDeskripsi);
        btnSimpan = findViewById(R.id.buttonSimpan);

        imageUri = getIntent().getParcelableExtra("selectedImage");
        if (imageUri != null) {
            imageView.setImageURI(imageUri);
        } else {
            Toast.makeText(this, "Gambar tidak ditemukan", Toast.LENGTH_SHORT).show();
            finish();
        }

        btnSimpan.setOnClickListener(v -> {
            String nama = edtNama.getText().toString().trim();
            String deskripsi = edtDeskripsi.getText().toString().trim();

            if (nama.isEmpty() || deskripsi.isEmpty()) {
                Toast.makeText(this, "Isi semua kolom", Toast.LENGTH_SHORT).show();
                return;
            }

            Intent resultIntent = new Intent();
            resultIntent.putExtra("imageUri", imageUri.toString());
            resultIntent.putExtra("nama", nama);
            resultIntent.putExtra("deskripsi", deskripsi);
            setResult(RESULT_OK, resultIntent);
            finish();
        });
    }
}
