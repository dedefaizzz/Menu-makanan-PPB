package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    String nama  = "";
    String harga = "";
    String alamat = "";
    String deskripsi = "";
    int gambar = 0;
    TextView txtMakanan, txtHrgMakanan, txtAlmtMakanan, txtDescMakanan;
    ImageView imgMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Bundle bundle = getIntent().getExtras();

        if (bundle != null)
        {
            nama = bundle.getString("nama");
            harga = bundle.getString("harga");
            alamat = bundle.getString("alamat");
            deskripsi = bundle.getString("deskripsi");
            gambar = bundle.getInt("gambar");
        }

        txtMakanan = findViewById(R.id.txtMakanan);
        txtMakanan.setText("Nama Menu : " + nama);

        txtAlmtMakanan = findViewById(R.id.txtAlmtMakanan);
        txtAlmtMakanan.setText("Alamat : " + alamat);

        txtHrgMakanan = findViewById(R.id.txtHrgMakanan);
        txtHrgMakanan.setText("Harga : Rp. " + harga);

        txtDescMakanan = findViewById(R.id.txtDescMakanan);
        txtDescMakanan.setText("Deskripsi : \n" + deskripsi);

        imgMakanan = findViewById(R.id.imgMakanan);
        imgMakanan.setImageResource(gambar);
    }
}