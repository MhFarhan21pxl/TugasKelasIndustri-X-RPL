import java.util.Scanner;

public class tugas4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        // Input
        // Nama Lengkap
        System.out.println("Nama Lengkap: ");
        String namaLengkap = input.nextLine();

        // NIS
        System.out.println("NIS Anda: ");
        int nis = input.nextInt();

        input.nextLine();

        System.out.println("Umur Anda: ");
        int umur = input.nextInt();

        // Output
        System.out.println("/n====== Hasil ======");
        System.out.println("Nama Anda\t: " + namaLengkap);
        System.out.println("NIS Anda\t: " + nis);
        System.out.println("Umur Anda\t: " + umur + " Tahun");
        input.close();
    }
    
}