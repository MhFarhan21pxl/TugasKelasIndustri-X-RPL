import java.util.Scanner;
public class tugas7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Jumlah deret yang ingin ditanpilkan : ");
        int deret = scanner.nextInt();

        System.out.println("------------------------------ Luaran ------------------------------");
        int angka = 3;
        int selisih = 2;

        System.out.print(angka + " ");

        for (int i = 1; i < deret; i++) {
            angka += selisih;
            selisih++;
            System.out.print(angka + " ");
        }
    }
}
