import java.util.Scanner;

public class tugas7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        int angkaTerbesar;

        // Menggunakan kondisi if-else untuk menentukan angka terbesar
        if (angka1 > angka2) {
            angkaTerbesar = angka1;
        } else {
            angkaTerbesar = angka2;
        }

        System.out.println("Angka terbesar adalah: " + angkaTerbesar);
    }
}