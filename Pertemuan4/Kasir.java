package Pertemuan4;
import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.print("Memiliki kartu member? (ya/tidak): ");
        String member = i.nextLine();

        System.out.print("Total belanja: ");
        double belanja = i.nextDouble();

        double diskon = 0;

        if (member.equalsIgnoreCase("ya")) {
            if (belanja > 500000) {
                diskon = 50000;
            } else if (belanja > 100000) {
                diskon = 15000;
            }
        } else {
            if (belanja > 100000) {
                diskon = 10000;
            }
        }
        double totalBayar = belanja - diskon;

        System.out.println("Total Belanja: " + belanja);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total Bayar: " + totalBayar);

        System.out.print("Uang yang diberikan: ");
        double uang = i.nextDouble();

        if (uang >= totalBayar) {
            double kembalian = uang - totalBayar;
            System.out.println("Kembalian: " + kembalian);
        } else {
            System.out.println("Uang tidak cukup!");
            System.out.println("Kekurangan: " +
                (totalBayar - uang));
        }
    }
}