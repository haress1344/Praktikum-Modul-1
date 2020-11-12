package penjualan.kue;

import java.util.Date;

public class Haris07168_Pembelian {

    float Haris07168_harga, Haris07168_perhitungan;
    String Haris07168_namakue;
    int Haris07168_jumkue;
    static Date Haris07168_tanggalbeli = new Date();
   

    public Haris07168_Pembelian(String Haris07168_namakue, float Haris07168_harga, int Haris07168_jumkue) {
        this.Haris07168_namakue = Haris07168_namakue;
        this.Haris07168_harga = Haris07168_harga;
        this.Haris07168_jumkue = Haris07168_jumkue;
        this.Haris07168_perhitungan = Haris07168_harga * Haris07168_jumkue;
    }

    String getkue() {
        return this.Haris07168_namakue;
    }

    float getharga() {
        return this.Haris07168_harga;
    }

    int getjumlah() {
        return this.Haris07168_jumkue;
    }

    float getperhitungan() {
        return this.Haris07168_perhitungan;
    }

}
