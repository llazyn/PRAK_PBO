//No 1
public class Nomor1 {
    public static void main(String[] args) {

        // Cara 1
        int[] angka1 = new int[5];

        // Cara 2
        int[] angka2 = {10, 20, 30, 40, 50};

        // Cara 3
        int angka3[];
        angka3 = new int[]{1, 2, 3, 4, 5};

    }
}

//No 2
public class Nomor2 {
    public static void main(String[] args) {

        String[] mobil = {
            "Tesla", "Suzuki", "Civic", "Mazda", "BMW"
        };

        mobil[1] = "Toyota";

        System.out.println("Nilai indeks yang diubah: " + mobil[1]);
    }
}

//No 3
import java.util.Scanner;
import java.util.Arrays;

public class Nomor3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int n = s.nextInt();

        int[] angka = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Angka ke-" + i + ": ");
            angka[i] = s.nextInt();
            total += angka[i];
        }

        int terbesar = angka[0];
        int terkecil = angka[0];

        for (int i = 0; i < n; i++) {
            if (angka[i] > terbesar) {
                terbesar = angka[i];
            }
            if (angka[i] < terkecil) {
                terkecil = angka[i];
            }
        }

        System.out.println("Nilai terbesar: " + terbesar);
        System.out.println("Nilai terkecil: " + terkecil);
        System.out.println("Jumlah: " + total);
        System.out.println("Rata-rata: " + (double) total / n);

        System.out.print("Masukkan NPM: ");
        int npm = s.nextInt();

        int jumlahIndeks = 0;
        if (npm % 2 == 0) {
            for (int i = 1; i < n; i += 2) {
                jumlahIndeks += angka[i];
            }
        } else {
            for (int i = 0; i < n; i += 2) {
                jumlahIndeks += angka[i];
            }
        }

        System.out.println("Jumlah sesuai indeks NPM: " + jumlahIndeks);
        if (jumlahIndeks % 2 == 0) {
            System.out.println("Hasil penjumlahan Genap");
        } else {
            System.out.println("Hasil penjumlahan Ganjil");
        }
        Arrays.sort(angka);
        System.out.println("Array setelah diurutkan: "
                + Arrays.toString(angka));

        s.close();
    }
}

//No 4
import java.util.Scanner;

public class Nomor4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = s.nextInt();

        String[] nama = new String[jumlah];
        int[] nilai = new int[jumlah];
        String[] status = new String[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            nama[i] = s.next();

            System.out.print("Nilai: ");
            nilai[i] = s.nextInt();

            if (nilai[i] > 50) {
                status[i] = "Lulus";
            } else {
                status[i] = "Tidak Lulus";
            }
        }

        System.out.println("\n========== Daftar Nilai Mahasiswa ==========");
        System.out.println("No\tNama\t\tNilai\tStatus");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + "\t" + nama[i]
                    + "\t\t" + nilai[i] + "\t" + status[i]);
        }
        s.close();
    }
}

//No 5
import java.util.Scanner;

public class Nomor5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = s.nextInt();

        System.out.print("Masukkan jumlah kolom: ");
        int kolom = s.nextInt();

        int[][] A = new int[baris][kolom];
        int[][] B = new int[baris][kolom];
        int[][] C = new int[baris][kolom];
        System.out.println("Masukkan matriks A:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                A[i][j] = s.nextInt();
            }
        }
        System.out.println("Masukkan matriks B:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                B[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Hasil Penjumlahan Matriks:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
        s.close();
    }
}

//No 6
import java.util.Scanner;

public class Nomor6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan: ");
        int jumlah = s.nextInt();

        double[] angka = new double[jumlah];
        double total = 0;
        for (int i = 0; i < jumlah; i++) {

            try {
                System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
                angka[i] = Double.parseDouble(s.next());
                total += angka[i];
            } catch (NumberFormatException e) {
                System.out.println("Error! s harus berupa angka.");
                i--;
            }
        }
        double rataRata = total / jumlah;
        System.out.println("Jumlah: " + total);
        System.out.println("Nilai rata-rata: " + rataRata);
        s.close();
    }
}

//No 7
class ThreadBaru extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread berjalan: " + i);
        }
    }
}

public class Nomor7 {
    public static void main(String[] args) {
        ThreadBaru thread = new ThreadBaru();
        thread.start();
        System.out.println("Thread utama berjalan");
    }
}

//No 8
import java.util.Scanner;

class ThreadAnak extends Thread {
    int nomor;
    ThreadAnak(int nomor) {
        this.nomor = nomor;
    }
    @Override
    public void run() {
        System.out.println("Thread ke-" + nomor + " sedang berjalan");
    }
}

public class Nomor8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan jumlah thread: ");
        int jumlah = s.nextInt();
        for (int i = 1; i <= jumlah; i++) {
            ThreadAnak thread = new ThreadAnak(i);
            thread.start();
        }
        s.close();
    }
}

//No 9
public class Nomor9 {
    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 6};

        System.out.println("Menggunakan For:");
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }

        System.out.println("Menggunakan Foreach:");
        for (int nilai : age) {
            System.out.println(nilai);
        }
    }
}

//No 10
public class Nomor10 {
    public static void main(String[] args) {

        Object[] data = {
            19,
            0.2,
            'C',
            "Java",
            true
        };
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}