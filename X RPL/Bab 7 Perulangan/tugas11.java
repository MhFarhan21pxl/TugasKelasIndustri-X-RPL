import java.util.Scanner;

public class tugas11{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        // Meminta pengguna memasukkan panjang deret
        System.out.print("Masukkan panjang deret: ");
        int panjangDeret = scanner.nextInt();

        // Inisialisasi variabel untuk menyimpan bilangan
        int bilangan = 1;

        // Perulangan do-while untuk menampilkan bilangan ganjil
        System.out.print("Bilangan Ganjil\t: ");
        do {
            System.out.print(bilangan + " ");
            bilangan += 2;
        } while (bilangan <= panjangDeret);

        // Reset bilangan menjadi 2 untuk bilangan genap
        bilangan = 2;

        // Perulangan do-while untuk menampilkan bilangan genap
        System.out.print("\nBilangan Genap\t: ");
        do {
            System.out.print(bilangan + " ");
            bilangan += 2;
        } while (bilangan <= panjangDeret);
    }
}