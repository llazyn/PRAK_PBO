package PRAK_P5;
import java.util.Scanner;

public class RataRata {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan banyak bilangan: ");
        int n = s.nextInt();
        int angka, total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Bilangan ke-" + i + " : ");
            angka = s.nextInt();
            total += angka;
        }
        double rataRata = (double) total / n;

        System.out.println("Total jumlah: " + total);
        System.out.println("Rata-rata: " + rataRata);
    }
}