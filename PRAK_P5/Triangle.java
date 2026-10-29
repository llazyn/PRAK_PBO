package PRAK_P5;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan banyak baris: ");
        int n = s.nextInt();

        int angka = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(angka + " ");
                angka++;
            }
            System.out.println();
        }
    }
}
