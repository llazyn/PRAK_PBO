package PRAK_P5;

public class Perbedaan {
    public static void main(String[] args) {
        
//      i++: nilai digunakan terlebih dahulu, kemudian bertambah.     
        int i = 1;
        System.out.println("Menggunakan i++:");
        while (i <= 5) {
            System.out.println(i++);
        }
        
//      ++i: nilai bertambah terlebih dahulu, kemudian digunakan.
        int j = 1;
        System.out.println("Menggunakan ++i:");
        while (j <= 5) {
        System.out.println(++j);
        }
    }
}
