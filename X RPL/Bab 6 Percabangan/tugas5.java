import java.util.Scanner;

public class tugas5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka 1 - 7 : ");
        int angka = scanner.nextInt();

        String hari;

        switch (angka) {
            case 1:
                hari = "Senin";
                break;
            case 2:
                hari = "Selasa";
                break;
            case 3:
                hari = "Rabu";
                break;
            case 4:
                hari = "Kamis";
                break;
            case 5:
                hari = "Jumat";
                break;
            case 6:
                hari = "Sabtu";
                break;
            case 7:
                hari = "Minggu";
                break;
            default:
                hari = "Angka yang Anda masukkan tidak valid.";
        }

        System.out.println("Hari yang sesuai adalah: " + hari);
    }
}