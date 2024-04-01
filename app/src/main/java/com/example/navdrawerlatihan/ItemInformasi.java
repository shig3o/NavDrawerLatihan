package com.example.navdrawerlatihan;

public class ItemInformasi {
    private String nama, informasi;
    private int image;
    public ItemInformasi(String nama, String informasi, int image) {
        this.nama = nama;
        this.informasi = informasi;
        this.image = image;
    }

    public String getNama() {
        return nama;
    }

    public String getInformasi() {
        return informasi;
    }

    public int getImage() {
        return image;
    }
}
