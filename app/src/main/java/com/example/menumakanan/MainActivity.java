package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // diperlukan juga array list untuk menampung data yang digunakan di recycler view
    private ArrayList<Kuliner> listKuliner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // recycler view : objek / kerangka untuk buat item list
        RecyclerView recKuliner = findViewById(R.id.rec_kuliner);
        initData();

        // memasukkan adapter yang telah dibuat ke dalam recycler view
        recKuliner.setAdapter(new KulinerAdapter(listKuliner));
        recKuliner.setLayoutManager(new LinearLayoutManager(this));
    }

    // isi datanya
    private void initData()
    {
        this.listKuliner = new ArrayList<>();
        listKuliner.add(new Kuliner("Mie Dokdok",
                "Burjo Asih || Jl. Imam Bonjol 35",
                "Mie Dokdok Khas Burjo Asih",
                R.drawable.mie));

        listKuliner.add(new Kuliner("Ayam Bali Burjo",
                "Burjo Asih || Jl. Imam Bonjol 35",
                "Ayam Bali dari Bali",
                R.drawable.ayambali));

        listKuliner.add(new Kuliner("Nasi Rames Telor",
                "Burjo Asih || Jl. Imam Bonjol 35",
                "Nasi Rames Dicampur Telor",
                R.drawable.telor));

        listKuliner.add(new Kuliner("Nasi Goreng Magelangan",
                "Burjo Asih || Jl. Imam Bonjol 35",
                "Nasi Goreng Biasa tapi magelang",
                R.drawable.nasgor));

        /*
         * Dari drawable nya mengambil resource yang digenerate
         * oleh android bernilai int
         * dari kuliner.java
         */
    }

    // langkah selanjutnya perlu membuat class bernama adapter
    // supaya bisa masuk ke recycler view
}