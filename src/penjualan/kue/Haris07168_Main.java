package penjualan.kue;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Haris07168_Main {

    static ArrayList<Haris07168_Pembelian> Haris07168_datapembelian = new ArrayList();
    static Scanner Haris07168_input = new Scanner(System.in);
    static SimpleDateFormat Haris07168_tglskrg = new SimpleDateFormat("dd-MMM-yyyy ");

    public static void main(String[] args) {
        System.out.println("Cookie Store Here !!");
        int Haris07168_pilih, Haris07168_jum, Haris07168_menu;
        String Haris07168_datakue;
        float Haris07168_harga;
        System.out.println(" Menu");
        for (int i = 0; i < Haris07168_Kue.Haris07168_namakue.length; i++) {
            System.out.println(Haris07168_Kue.Haris07168_namakue[i]);
        }
        do {
            System.out.println("1. Masukkan Dalam Keranjang");
            System.out.println("2. Rubah Data Keranjang");
            System.out.println("3. Hapus Data Keranjang");
            System.out.println("4. Isi Dalam Keranjang");
            System.out.print("Pilih = ");
            Haris07168_menu = Haris07168_input.nextInt();
            switch (Haris07168_menu) {
                case 1:
                    System.out.println("Masukkan Ke Keranjang");
                    for (int i = 0; i < Haris07168_Kue.Haris07168_namakue.length; i++) {
                        System.out.println(i + 1 + ". " + Haris07168_Kue.Haris07168_namakue[i]);
                    }
                    System.out.print("Pilih Kue = ");
                    Haris07168_pilih = Haris07168_input.nextInt();
                    switch (Haris07168_pilih) {
                        case 1:
                            Haris07168_datakue = "Tahu Kornet";
                            Haris07168_harga = 2500;
                            System.out.print("Jumlah Tahu Kornet = ");
                            Haris07168_jum = Haris07168_input.nextInt();
                            Haris07168_datapembelian.add(new Haris07168_Pembelian(Haris07168_datakue, Haris07168_harga, Haris07168_jum));
                            break;
                        case 2:
                            Haris07168_datakue = "Bitterbalen";
                            Haris07168_harga = 3000;
                            System.out.print("Jumlah Bitterbalen = ");
                            Haris07168_jum = Haris07168_input.nextInt();
                            Haris07168_datapembelian.add(new Haris07168_Pembelian(Haris07168_datakue, Haris07168_harga, Haris07168_jum));
                            break;
                        case 3:
                            Haris07168_datakue = "Bolu";
                            Haris07168_harga = 2000;
                            System.out.print("Jumlah Bolu = ");
                            Haris07168_jum = Haris07168_input.nextInt();
                            Haris07168_datapembelian.add(new Haris07168_Pembelian(Haris07168_datakue, Haris07168_harga, Haris07168_jum));
                            break;
                        case 4:
                            Haris07168_datakue = "Cookie";
                            Haris07168_harga = 4000;
                            System.out.print("Jumlah Cookie = ");
                            Haris07168_jum = Haris07168_input.nextInt();
                            Haris07168_datapembelian.add(new Haris07168_Pembelian(Haris07168_datakue, Haris07168_harga, Haris07168_jum));
                            break;
                    }
                    break;
                case 2:
                    int Haris07168_indeks;
                    if (Haris07168_datapembelian.isEmpty()) {
                        System.out.println("Tidak Ada Kue Dalam Keranjang");
                    } else {
                        System.out.print("Masukkan Urutan Kue = ");
                        Haris07168_indeks = Haris07168_input.nextInt();
                        Haris07168_indeks = Haris07168_indeks - 1;
                        if (Haris07168_indeks >= Haris07168_datapembelian.size() || Haris07168_indeks < 0) {
                            System.out.println("Urutan Kue Tidak Tersedia Di Keranjang");
                        } else {
                            for (int i = 0; i < Haris07168_Kue.Haris07168_namakue.length; i++) {
                                System.out.println(i + 1 + ". " + Haris07168_Kue.Haris07168_namakue[i]);
                            }
                            System.out.print("Pilih Kue = ");
                            Haris07168_pilih = Haris07168_input.nextInt();
                            switch (Haris07168_pilih) {
                                case 1:
                                    Haris07168_datakue = "Tahu Kornet";
                                    Haris07168_harga = 2500;
                                    System.out.print("Jumlah Tahu Kornet = ");
                                    Haris07168_jum = Haris07168_input.nextInt();
                                    Haris07168_datapembelian.set(Haris07168_indeks, new Haris07168_Pembelian(Haris07168_datakue, Haris07168_harga, Haris07168_jum));
                                    break;
                                case 2:
                                    Haris07168_datakue = "Bitterbalen";
                                    Haris07168_harga = 3000;
                                    System.out.print("Jumlah Bitterbalen = ");
                                    Haris07168_jum = Haris07168_input.nextInt();
                                    Haris07168_datapembelian.set(Haris07168_indeks, new Haris07168_Pembelian(Haris07168_datakue, Haris07168_harga, Haris07168_jum));
                                    break;
                                case 3:
                                    Haris07168_datakue = "Bolu";
                                    Haris07168_harga = 2000;
                                    System.out.print("Jumlah Bolu = ");
                                    Haris07168_jum = Haris07168_input.nextInt();
                                    Haris07168_datapembelian.set(Haris07168_indeks, new Haris07168_Pembelian(Haris07168_datakue, Haris07168_harga, Haris07168_jum));
                                    break;
                                case 4:
                                    Haris07168_datakue = "Cookie";
                                    Haris07168_harga = 4000;
                                    System.out.print("Jumlah Cookie = ");
                                    Haris07168_jum = Haris07168_input.nextInt();
                                    Haris07168_datapembelian.set(Haris07168_indeks, new Haris07168_Pembelian(Haris07168_datakue, Haris07168_harga, Haris07168_jum));
                                    break;
                            }
                        }

                    }
                    break;
                case 3:
                    if (Haris07168_datapembelian.isEmpty()) {
                        System.out.println("Tidak Ada Kue Dalam Keranjang");
                    } else {
                        System.out.print("Masukkan Urutan Kue = ");
                        Haris07168_indeks = Haris07168_input.nextInt();
                        Haris07168_indeks = Haris07168_indeks - 1;
                        if (Haris07168_indeks >= Haris07168_datapembelian.size() || Haris07168_indeks < 0) {
                            System.out.println("Urutan Kue Tidak Tersedia Di Keranjang");
                        } else {
                            Haris07168_datapembelian.remove(Haris07168_indeks);
                        }

                    }
                    break;
                case 4:
                    if (Haris07168_datapembelian.isEmpty()) {
                        System.out.println("Tidak Ada Kue Dalam Keranjang");
                    } else {
                        Haris07168_isikeranjang();
                    }
                    break;

            }
        } while (Haris07168_menu <= 4);

    }

    static void Haris07168_isikeranjang() {
        System.out.println("ISI DALAM KERANJANG");
        System.out.println("=======================");
        float total = 0;
        for (int i = 0; i < Haris07168_datapembelian.size(); i++) {
            System.out.println(Haris07168_datapembelian.get(i).getkue());
            System.out.println("Harga Satuan = " + Haris07168_datapembelian.get(i).Haris07168_harga);
            System.out.println("Jumlah = " + Haris07168_datapembelian.get(i).Haris07168_jumkue);
            System.out.println("Harga = " + Haris07168_datapembelian.get(i).Haris07168_perhitungan);
            total = total + Haris07168_datapembelian.get(i).Haris07168_perhitungan;
            System.out.println("=======================");
        }
        System.out.println("Total Harga = " + total);
        System.out.println("Tanggal Pembelian = " + Haris07168_tglskrg.format(Haris07168_Pembelian.Haris07168_tanggalbeli));
    }
}
