import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai angka (0-100): ");
        int nilaiAngka = scanner.nextInt();

        String nilaiHuruf;

        if (nilaiAngka >= 81 && nilaiAngka <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAngka >= 71 && nilaiAngka <= 80) {
            nilaiHuruf = "B";
        } else if (nilaiAngka >= 51 && nilaiAngka <= 70) {
            nilaiHuruf = "C";
        } else if (nilaiAngka >= 21 && nilaiAngka <= 50) {
            nilaiHuruf = "D";
        } else if (nilaiAngka >= 0 && nilaiAngka <= 20) {
            nilaiHuruf = "E";
        } else {
            nilaiHuruf = "Nilai tidak valid";
        }

        System.out.println("Nilai huruf: " + nilaiHuruf);
    }
}