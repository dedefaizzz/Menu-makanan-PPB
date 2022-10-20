package com.example.menumakanan;

public class Kuliner {
    private String nama, alamat, deskripsi, harga;

    /*
     * image resourcenya menggunakan index int
     * yang isinya, int yang digenerate oleh android
     */
    private int id_gambar;

    // generate cunstructor
    public Kuliner(String nama, String alamat, String deskripsi, int id_gambar, String harga) {
        this.nama = nama;
        this.alamat = alamat;
        this.deskripsi = deskripsi;
        this.id_gambar = id_gambar;
        this.harga = harga;
    }

    // generate getter and setter
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getDeskripsi() {
        return deskripsi;
    }
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getId_gambar() {
        return id_gambar;
    }
    public void setId_gambar(int id_gambar) {
        this.id_gambar = id_gambar;
    }

    public String getHarga() { return harga; }
    public void setHarga(String harga) { this.harga = harga; }
}
