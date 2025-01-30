import java.util.Scanner;

public class tugas12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("---------- Menu ----------");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Keluar");
            System.out.print("Masukkan Pilihan Anda: ");

            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Anda memilih menu Penjumlahan");
                    System.out.print("Masukkan Angka Pertama: ");
                    int angka1 = scanner.nextInt();
                    System.out.print("Masukkan Angka Kedua: ");
                    int angka2 = scanner.nextInt();
                    System.out.println("Hasil Penjumlahan = " + (angka1 + angka2));
                    break;
                case 2:
                    System.out.println("Anda memilih menu Pengurangan");
                    System.out.print("Masukkan Angka Pertama: ");
                    angka1 = scanner.nextInt();
                    System.out.print("Masukkan Angka Kedua: ");
                    angka2 = scanner.nextInt();
                    System.out.println("Hasil Pengurangan = " + (angka1 - angka2));
                    break;
                case 3:
                    System.out.println("Program berhenti!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
            }
        } while (pilihan != 3);

        scanner.close();
    }
}