package Pertemuan4;
import java.util.Scanner;

public class GenapGanjil {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bil = i.nextInt();

        if (bil % 2 == 0) {
            System.out.println("Bilangan Genap");
        } else {
            System.out.println("Bilangan Ganjil");
        }
    }
}
