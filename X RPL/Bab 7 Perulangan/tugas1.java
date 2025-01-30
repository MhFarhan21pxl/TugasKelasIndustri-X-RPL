import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka awal: ");
        int angkaAwal = input.nextInt();

        // Mencari angka pertama yang habis dibagi 3 dari angka awal
        while (angkaAwal % 3 != 0) {
            angkaAwal++;
        }

        System.out.println("10 bilangan berikutnya yang habis dibagi 3:");
        for (int i = 0; i < 10; i++) {
            System.out.print(angkaAwal + " ");
            angkaAwal += 3;
        }
    }
}