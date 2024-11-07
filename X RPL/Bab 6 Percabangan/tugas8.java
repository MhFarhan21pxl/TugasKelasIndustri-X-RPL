import java.util.Scanner;

public class tugas8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        // Menggunakan operator modulus (%) untuk memeriksa sisa bagi
        if (angka1 % 2 == 0) {
            System.out.println(angka1 + " adalah bilangan genap.");
        } else {
            System.out.println(angka1 + " adalah bilangan ganjil.");
        }

        if (angka2 % 2 == 0) {
            System.out.println(angka2 + " adalah bilangan genap.");
        } else {
            System.out.println(angka2 + " adalah bilangan ganjil.");
        }
    }
}