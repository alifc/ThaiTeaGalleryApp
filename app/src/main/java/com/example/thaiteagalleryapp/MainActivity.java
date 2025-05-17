package com.example.thaiteagalleryapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    GridLayout gridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridLayout = findViewById(R.id.gridLayout);
        Button backButton = findViewById(R.id.back_button);

        addThaiTeaItem(R.drawable.original_thai_tea, "Thai Tea Original",
                "Bahan:\n- 2 sdm teh hitam Thailand\n- 200 ml air panas\n- 3 sdm susu kental manis\n" +
                        "- 2 sdm susu evaporasi\n- Es batu secukupnya\n\n" +
                        "Cara Membuat:\n" +
                        "1. Seduh teh hitam selama 3–5 menit.\n2. Saring dan tuang ke gelas.\n3. Tambahkan susu kental dan evaporasi.\n" +
                        "4. Aduk rata lalu tambahkan es batu.\n5. Sajikan dingin dan nikmati.");

        addThaiTeaItem(R.drawable.taro_thai_tea, "Thai Tea Taro",
                "Bahan:\n- 2 sdm bubuk taro\n- 150 ml air panas\n- 2 sdm susu kental manis\n" +
                        "- 1 sdm krimer bubuk\n- Es batu secukupnya\n\n" +
                        "Cara Membuat:\n1. Campur bubuk taro dan air panas.\n2. Tambahkan susu dan krimer.\n3. Tuang ke gelas es.\n" +
                        "4. Tambahkan topping sesuai selera.");

        addThaiTeaItem(R.drawable.matcha_thai_tea, "Thai Tea Matcha",
                "Bahan:\n- 1 sdt bubuk matcha\n- 30 ml air panas\n- 150 ml susu cair\n" +
                        "- 1–2 sdt gula pasir\n- Es batu\n\n" +
                        "Cara Membuat:\n1. Larutkan matcha dengan air panas.\n2. Tambahkan gula dan aduk.\n3. Tuang ke gelas berisi es.\n" +
                        "4. Tambahkan susu cair dan sajikan.");

        addThaiTeaItem(R.drawable.bubble_thai_tea, "Thai Tea Bubble",
                "Bahan:\n- 2 sdm teh Thailand\n- 200 ml air panas\n- 3 sdm susu kental\n" +
                        "- Boba siap pakai\n- Es batu\n\n" +
                        "Cara Membuat:\n1. Rebus boba hingga kenyal.\n2. Seduh teh dan saring.\n3. Campur teh dengan susu.\n" +
                        "4. Tambahkan es dan boba ke gelas.");

        addThaiTeaItem(R.drawable.redvelvet_thai_tea, "Thai Tea Red Velvet",
                "Bahan:\n- 2 sdm bubuk red velvet\n- 150 ml air panas\n- 2 sdm susu kental\n" +
                        "- 1 sdm susu cair\n- Es batu\n\n" +
                        "Cara Membuat:\n1. Seduh bubuk red velvet.\n2. Tambahkan susu.\n3. Aduk dan tuang ke gelas es.\n" +
                        "4. Tambahkan whipped cream jika suka.");

        addThaiTeaItem(R.drawable.green_thai_tea, "Thai Green Tea",
                "Bahan:\n- 2 sdm teh hijau Thailand\n- 200 ml air panas\n- 2 sdm susu kental manis\n" +
                        "- 1 sdm gula\n- Es batu\n\n" +
                        "Cara Membuat:\n1. Seduh teh hijau.\n2. Tambahkan gula dan susu.\n3. Tuang ke gelas es dan sajikan.");

        addThaiTeaItem(R.drawable.cheese_thai_tea, "Thai Tea Keju",
                "Bahan:\n- 200 ml Thai Tea\n- 50 ml whipping cream\n- 2 sdm keju parut\n" +
                        "- 1 sdt gula halus\n- Sedikit garam\n\n" +
                        "Cara Membuat:\n1. Buat Thai Tea biasa.\n2. Kocok whipping cream, keju, gula, dan garam.\n" +
                        "3. Tuang Thai Tea ke gelas es, lalu beri cheese foam di atasnya.");

        addThaiTeaItem(R.drawable.chocolate_thai_tea, "Thai Tea Cokelat",
                "Bahan:\n- 2 sdm teh Thailand\n- 1 sdm bubuk cokelat\n- 200 ml air panas\n" +
                        "- 2 sdm susu kental\n- Es batu\n\n" +
                        "Cara Membuat:\n1. Seduh teh dan cokelat bersamaan.\n2. Saring, lalu tambahkan susu.\n3. Sajikan di atas es batu.");

        addThaiTeaItem(R.drawable.caramel_thai_tea, "Thai Tea Caramel",
                "Bahan:\n- 200 ml Thai Tea\n- 1 sdm sirup karamel\n- 2 sdm susu evaporasi\n" +
                        "- Es batu\n\n" +
                        "Cara Membuat:\n1. Campur semua bahan, kocok dalam shaker.\n2. Tuang ke gelas es.\n3. Tambahkan saus karamel di atasnya.");

        backButton.setOnClickListener(view -> finish());
    }

    private void addThaiTeaItem(int imageResId, String name, String recipe) {
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
        itemLayout.setGravity(View.TEXT_ALIGNMENT_CENTER);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(imageResId);
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
            intent.putExtra("image", imageResId);
            intent.putExtra("name", name);
            intent.putExtra("recipe", recipe);
            startActivity(intent);
        });

        gridLayout.addView(cardView);
    }
}
