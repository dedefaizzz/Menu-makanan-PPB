package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

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
                "Mie Dokdok Khas Burjo Asih dengan pilihan goreng atau rebus. Menggunakan 2 siung bawang merah, 1 siung bawang putih, dan tambahan topping telor",
                R.drawable.mie,
                "9000"));

        listKuliner.add(new Kuliner("Ayam Bali Burjo",
                "Burjo Asih || Jl. Imam Bonjol 35",
                "Ayam Burjo Bali dari Bali dengan geprekan ayam broiler yang sudah di goreng tepung, bisa memilih level pedas",
                R.drawable.ayambali,
                "12000"));

        listKuliner.add(new Kuliner("Nasi Rames Telor",
                "Burjo Asih || Jl. Imam Bonjol 35",
                "Nasi Rames Dicampur Telor + kacang panjang",
                R.drawable.telor,
                "10000"));

        listKuliner.add(new Kuliner("Nasi Goreng Magelangan",
                "Burjo Asih || Jl. Imam Bonjol 35",
                "Nasi Goreng Biasa tapi magelang khas Burjo Asih, bisa pilih level pedas",
                R.drawable.nasgor,
                "10000"));

        /*
         * Dari drawable nya mengambil resource yang digenerate
         * oleh android bernilai int
         * dari kuliner.java
         */
    }

    // langkah selanjutnya perlu membuat class bernama adapter
    // supaya bisa masuk ke recycler view
}