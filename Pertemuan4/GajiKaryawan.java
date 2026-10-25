package Pertemuan4;
import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.print("Masukkan NIK: ");
        String nik = i.nextLine();

        System.out.print("Masukkan nama: ");
        String nama = i.nextLine();

        System.out.print("Kode golongan (1-4): ");
        int gol = i.nextInt();

        i.nextLine();
        System.out.print("Status perkawinan (menikah/belum/cerai): ");
        String status = i.nextLine();

        System.out.print("Jumlah anak: ");
        int anak = i.nextInt();

        double gaji = 0;

        switch (gol) {
            case 1:
                gaji = 1200000;
                break;
            case 2:
                gaji = 1500000;
                break;
            case 3:
                gaji = 1750000;
                break;
            case 4:
                gaji = 2000000;
                break;
            default:
                System.out.println("Golongan tidak valid");
                return;
        }
        double Tpasangan = 0;
        double Tanak = 0;

        if (status.equalsIgnoreCase("menikah")) {
            Tpasangan = gaji * 0.10;
        }

        if (anak > 0) {
            Tanak = gaji * 0.05 * anak;
        }

        double gajiBersih =
            gaji + Tpasangan + Tanak;

        System.out.println("\n=== DATA KARYAWAN ===");
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: Rp" + gaji);
        System.out.println("Tunjangan Pasangan: Rp" + Tpasangan);
        System.out.println("Tunjangan Anak: Rp" + Tanak);
        System.out.println("Gaji Bersih: Rp" + gajiBersih);
    }
}
