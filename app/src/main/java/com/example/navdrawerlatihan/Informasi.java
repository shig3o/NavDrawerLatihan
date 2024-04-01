package com.example.navdrawerlatihan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Informasi extends AppCompatActivity {
    TextView namaTextView, informasiTextView;
    ImageView imageView;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_informasi);

        namaTextView = findViewById(R.id.headingText);
        informasiTextView = findViewById(R.id.p);
        imageView = findViewById(R.id.headingImage);
        back = findViewById(R.id.backButton);

        Intent intent = getIntent();
        String nama = intent.getStringExtra("nama");
        String informasi = intent.getStringExtra("informasi");
        int imageResourceId = intent.getIntExtra("image", -1); // Assuming image is an int resource ID

        // Set the data to the views
        namaTextView.setText(nama);
        informasiTextView.setText(informasi);
        if (imageResourceId != -1) {
            imageView.setImageResource(imageResourceId);
        }

        back.setOnClickListener(v -> {
            Intent intentA = new Intent(Informasi.this, MainActivity.class);
            startActivity(intentA);
        });
    }
}