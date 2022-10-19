package com.example.menumakanan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

// supaya data bisa masuk ke recycler view
public class KulinerAdapter extends RecyclerView.Adapter<KulinerAdapter.ViewHolder> {

    private ArrayList<Kuliner> listKuliner;
    public KulinerAdapter(ArrayList<Kuliner> listKuliner) {
        this.listKuliner = listKuliner;
    }

    @NonNull
    @Override
    public KulinerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewHolder holder = new ViewHolder(inflater.inflate(R.layout.item_kuliner, parent, false));

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull KulinerAdapter.ViewHolder holder, int position) {
        Kuliner kuliner = listKuliner.get(position);
        holder.txtNama.setText(kuliner.getNama());
        holder.txtAlamat.setText(kuliner.getAlamat());
        holder.txtDeskripsi.setText(kuliner.getDeskripsi());
        holder.imgFoto.setImageResource(kuliner.getId_gambar());
        /* image resource bernilai index int
         * berada pada kuliner.java */

        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(holder.mainLayout.getContext(), kuliner.getDeskripsi(), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        // menyesuaikan dari jumlah list yang
        return listKuliner.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView txtNama, txtAlamat, txtDeskripsi;
        public ImageView imgFoto;

        /*
        * Untuk ngeklik tanpa button
        * diperlukan constraint layout yang bisa menampung
        * supaya bisa klik pada tampilan layout / teks
        */
        public ConstraintLayout mainLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNama = (TextView) itemView.findViewById(R.id.txtNama);
            txtAlamat = (TextView) itemView.findViewById(R.id.txtAlamat);
            txtDeskripsi = (TextView) itemView.findViewById(R.id.txtDeskripsi);
            imgFoto = (ImageView) itemView.findViewById(R.id.imgFoto);
            mainLayout = (ConstraintLayout) itemView.findViewById(R.id.mainLayout);
        }
    }
}
