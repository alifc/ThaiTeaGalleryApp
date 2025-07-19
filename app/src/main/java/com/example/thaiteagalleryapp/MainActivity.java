package com.example.thaiteagalleryapp;

import android.Manifest;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_PICK_IMAGE = 100;
    private static final int REQUEST_PERMISSION_CODE = 101;

    GridLayout gridLayout;
    Button backButton, btnTambahGambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridLayout = findViewById(R.id.gridLayout);
        backButton = findViewById(R.id.back_button);
        btnTambahGambar = findViewById(R.id.btnTambahGambar);

        checkAndRequestPermission();

        backButton.setOnClickListener(view -> finish());

        btnTambahGambar.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            startActivityForResult(intent, REQUEST_PICK_IMAGE);
        });

        // Tambahkan semua gambar Thai Tea yang tersedia dengan deskripsi resep & bahan
        addThaiTeaItem(R.drawable.original_thai_tea, "Thai Tea Original",
                "Bahan:\n- 3 sdm Thai Tea\n- 250 ml air panas\n- 3 sdm susu kental manis\n- 2 sdm evaporated milk\n- 1 sdm gula pasir\n- Es batu secukupnya\n\n" +
                        "Cara membuat:\nSeduh Thai Tea dengan air panas, saring, lalu campur dengan gula dan susu. Aduk rata dan sajikan dengan es batu.");

        addThaiTeaItem(R.drawable.bubble_thai_tea, "Bubble Thai Tea",
                "Bahan:\n- 250 ml Thai Tea (lihat resep original)\n- 2 sdm boba matang\n- 1 sdm gula merah cair (opsional)\n- Es batu secukupnya\n\n" +
                        "Cara membuat:\nSiapkan Thai Tea seperti biasa, lalu tambahkan boba dan gula merah cair ke dalam gelas. Sajikan dingin.");

        addThaiTeaItem(R.drawable.cheese_thai_tea, "Cheese Thai Tea",
                "Bahan:\n- 250 ml Thai Tea\n- 2 sdm susu kental manis\n- 50 ml whipping cream\n- 1 sdm cream cheese\n- 1 sdt gula halus\n- Sejumput garam\n- Es batu\n\n" +
                        "Cara membuat:\nKocok cream cheese, whipping cream, gula, dan garam hingga mengembang. Tuang Thai Tea ke gelas, tambahkan foam cheese di atasnya.");

        addThaiTeaItem(R.drawable.chocolate_thai_tea, "Chocolate Thai Tea",
                "Bahan:\n- 2 sdm Thai Tea\n- 1 sdm bubuk cokelat\n- 250 ml air panas\n- 2 sdm susu kental manis\n- 1 sdm gula\n- Es batu\n\n" +
                        "Cara membuat:\nSeduh Thai Tea dan bubuk cokelat, saring. Tambahkan susu dan gula, aduk rata. Sajikan dingin.");

        addThaiTeaItem(R.drawable.caramel_thai_tea, "Caramel Thai Tea",
                "Bahan:\n- 250 ml Thai Tea\n- 1-2 sdm saus karamel\n- 2 sdm susu kental manis\n- Es batu\n\n" +
                        "Cara membuat:\nCampur Thai Tea dengan susu dan karamel, aduk rata. Hias pinggiran gelas dengan karamel untuk tampilan menarik.");

        addThaiTeaItem(R.drawable.green_thai_tea, "Green Thai Tea",
                "Bahan:\n- 2 sdm green Thai tea\n- 250 ml air panas\n- 2 sdm gula\n- 2 sdm susu kental manis\n- 2 sdm evaporated milk\n- Es batu\n\n" +
                        "Cara membuat:\nSeduh green Thai tea, saring. Tambahkan gula dan susu, lalu sajikan dengan es dan tuang evaporated milk di atasnya.");

        addThaiTeaItem(R.drawable.matcha_thai_tea, "Matcha Thai Tea",
                "Bahan:\n- 1 sdm bubuk matcha\n- 100 ml air panas\n- 150 ml susu cair\n- 2 sdm gula\n- Es batu\n\n" +
                        "Cara membuat:\nLarutkan matcha dalam air panas. Tambahkan gula dan susu, aduk rata. Tuang ke gelas berisi es.");

        addThaiTeaItem(R.drawable.redvelvet_thai_tea, "Red Velvet Thai Tea",
                "Bahan:\n- 2 sdm bubuk red velvet instan (atau bubuk red velvet drink)\n- 250 ml susu cair\n- 2 sdm susu kental manis\n- Es batu\n\n" +
                        "Cara membuat:\nLarutkan bubuk red velvet dalam susu cair panas, tambahkan kental manis, aduk rata. Sajikan dingin.");

        addThaiTeaItem(R.drawable.taro_thai_tea, "Taro Thai Tea",
                "Bahan:\n- 2 sdm bubuk taro\n- 200 ml air panas\n- 100 ml susu cair\n- 2 sdm gula\n- Es batu\n\n" +
                        "Cara membuat:\nCampur bubuk taro dengan air panas dan gula, tambahkan susu dan aduk rata. Tuang ke gelas berisi es.");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_PICK_IMAGE && resultCode == Activity.RESULT_OK && data != null) {
            Uri selectedImage = data.getData();
            if (selectedImage != null) {
                showInputDialog(selectedImage);
            }
        }
    }

    private void showInputDialog(Uri imageUri) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Deskripsi Gambar");

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(32, 32, 32, 32);

        final EditText nameInput = new EditText(this);
        nameInput.setHint("Nama Thai Tea");
        layout.addView(nameInput);

        final EditText descInput = new EditText(this);
        descInput.setHint("Deskripsi / resep");
        layout.addView(descInput);

        builder.setView(layout);

        builder.setPositiveButton("Tambah", (dialog, which) -> {
            String name = nameInput.getText().toString();
            String desc = descInput.getText().toString();
            if (!name.isEmpty() && !desc.isEmpty()) {
                addThaiTeaItem(imageUri, name, desc);
            } else {
                Toast.makeText(this, "Nama dan deskripsi tidak boleh kosong", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("Batal", (dialog, which) -> dialog.cancel());

        builder.show();
    }

    private void checkAndRequestPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_MEDIA_IMAGES) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_MEDIA_IMAGES}, REQUEST_PERMISSION_CODE);
            }
        } else {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, REQUEST_PERMISSION_CODE);
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_PERMISSION_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(this, "Izin diberikan", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Izin ditolak", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void addThaiTeaItem(int imageResId, String name, String recipe) {
        addThaiTeaItem(Uri.parse("android.resource://" + getPackageName() + "/" + imageResId), name, recipe);
    }

    private void addThaiTeaItem(Uri imageUri, String name, String recipe) {
        CardView cardView = new CardView(this);
        GridLayout.LayoutParams params = new GridLayout.LayoutParams();
        params.width = 0;
        params.height = GridLayout.LayoutParams.WRAP_CONTENT;
        params.columnSpec = GridLayout.spec(GridLayout.UNDEFINED, 1f);
        params.setMargins(16, 16, 16, 16);
        cardView.setLayoutParams(params);
        cardView.setRadius(20);
        cardView.setCardElevation(8);
        cardView.setUseCompatPadding(true);

        LinearLayout itemLayout = new LinearLayout(this);
        itemLayout.setOrientation(LinearLayout.VERTICAL);
        itemLayout.setPadding(16, 16, 16, 16);
        itemLayout.setGravity(Gravity.CENTER);

        ImageView imageView = new ImageView(this);
        imageView.setImageURI(imageUri);
        LinearLayout.LayoutParams imageParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, 400);
        imageView.setLayoutParams(imageParams);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);

        TextView textView = new TextView(this);
        textView.setText(name);
        textView.setTextColor(getResources().getColor(android.R.color.black));
        textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        textView.setPadding(0, 8, 0, 0);
        textView.setTextSize(16);
        textView.setTypeface(null, android.graphics.Typeface.BOLD);

        itemLayout.addView(imageView);
        itemLayout.addView(textView);
        cardView.addView(itemLayout);

        cardView.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("image", imageUri.toString());
            intent.putExtra("name", name);
            intent.putExtra("recipe", recipe);
            startActivity(intent);
        });

        gridLayout.addView(cardView);


    }
}