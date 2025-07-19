package com.example.thaiteagalleryapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    private EditText etNewUsername, etNewPassword;
    private Button btnSubmit;
    private DatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etNewUsername = findViewById(R.id.etNewUsername);
        etNewPassword = findViewById(R.id.etNewPassword);
        btnSubmit = findViewById(R.id.btnSubmit);
        dbHelper = new DatabaseHelper(this);

        btnSubmit.setOnClickListener(v -> {
            String username = etNewUsername.getText().toString();
            String password = etNewPassword.getText().toString();

            if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
                Toast.makeText(RegisterActivity.this, "Username dan Password tidak boleh kosong", Toast.LENGTH_SHORT).show();
            } else {
                boolean isInserted = dbHelper.insertUser(username, password);
                if (isInserted) {
                    Toast.makeText(RegisterActivity.this, "Pendaftaran berhasil!", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                    finish();
                } else {
                    Toast.makeText(RegisterActivity.this, "Username sudah digunakan!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
