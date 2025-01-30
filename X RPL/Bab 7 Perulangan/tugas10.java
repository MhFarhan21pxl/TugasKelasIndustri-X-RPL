import java.util.Scanner;

public class tugas10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String jawaban;

        do {
            // Kode yang ingin diulang-ulang
            System.out.println("Program ini akan dijalankan secara berulang ulang");
            System.out.println("Apakah Anda ingin berhenti? Tekan (Ya)");
            jawaban = scanner.nextLine();
        } while (!jawaban.equalsIgnoreCase("ya")); 

        System.out.println("Program berhenti.");
    }
}