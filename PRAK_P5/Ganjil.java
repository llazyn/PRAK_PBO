package PRAK_P5;

import java.util.Scanner;

public class Ganjil {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan banyak angka: ");
        int n = s.nextInt();

        int angka = 1;
        int total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(angka + " ");
            total += angka;
            angka += 2;
        }

        System.out.println("\nTotal penjumlahan: " + total);
    }
}
