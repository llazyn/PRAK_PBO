package Pertemuan4;

import java.util.Scanner;

public class Salesman {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.print("Masukkan total penjualan:Rp");
        double penjualan = i.nextDouble();

        double jasa;
        double komisi;

        if (penjualan <= 2000000) {
            jasa = 100000;
            komisi = penjualan * 0.10;
        } else if (penjualan <= 5000000) {
            jasa = 200000;
            komisi = penjualan * 0.15;
        } else {
            jasa = 300000;
            komisi = penjualan * 0.20;
        }

        double pendapatan = jasa + komisi;

        System.out.println("Uang Jasa: Rp" + jasa);
        System.out.println("Uang Komisi: Rp" + komisi);
        System.out.println("Total Pendapatan: Rp" + pendapatan);
    }
}
