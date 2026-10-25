package Pertemuan4;

import java.util.Scanner;

public class Kabisat {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.print("Masukkan tahun : ");
        int tahun = i.nextInt();

        if (tahun % 400 == 0) {
            System.out.println("Tahun Kabisat");
        } else if (tahun % 100 == 0) {
            System.out.println("Bukan Tahun Kabisat");
        } else if (tahun % 4 == 0) {
            System.out.println("Tahun Kabisat");
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}