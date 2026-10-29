package PRAK_P5;

import java.util.Scanner;

public class BesarKecil {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int angka, terbesar = 0, terkecil = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            angka = s.nextInt();
        
            if (i == 1) {
                terbesar = angka;
                terkecil = angka;
            } else {
                if (angka > terbesar) {
                    terbesar = angka;
                }
                if (angka < terkecil) {
                    terkecil = angka;
                }
            }
        }

        System.out.println("Bilangan terbesar: " + terbesar);
        System.out.println("Bilangan terkecil: " + terkecil);
    }
}