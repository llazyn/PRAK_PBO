package Pertemuan4;

import java.util.Scanner;

public class HitungBangunan {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.println("=== MENU LUAS BANGUN DATAR ===");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.println("4. Trapesium");
        System.out.println("5. Layang-layang");
        System.out.print("Pilih menu (1-5): ");

        int pilihan = i.nextInt();
        double luas;

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi: ");
                double sisi = i.nextDouble();
                luas = sisi * sisi;
                System.out.println("Luas Persegi: " + luas);
                break;

            case 2:
                System.out.print("Masukkan alas: ");
                double alas = i.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = i.nextDouble();
                luas = alas * tinggi / 2;
                System.out.println("Luas Segitiga: " + luas);
                break;

            case 3:
                System.out.print("Masukkan jari-jari: ");
                double r = i.nextDouble();
                luas = 3.14 * r * r;
                System.out.println("Luas Lingkaran: " + luas);
                break;

            case 4:
                System.out.print("Masukkan sisi atas: ");
                double a = i.nextDouble();
                System.out.print("Masukkan sisi bawah: ");
                double b = i.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double t = i.nextDouble();
                luas = (a + b) * t / 2;
                System.out.println("Luas Trapesium: " + luas);
                break;

            case 5:
                System.out.print("Masukkan diagonal 1: ");
                double d1 = i.nextDouble();
                System.out.print("Masukkan diagonal 2: ");
                double d2 = i.nextDouble();
                luas = d1 * d2 / 2;
                System.out.println("Luas Layang-layang: " + luas);
                break;

            default:
                System.out.println("Pilihan tidak valid");
        }
    }
}