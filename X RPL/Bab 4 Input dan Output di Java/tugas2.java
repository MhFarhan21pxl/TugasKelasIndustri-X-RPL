import java.util.Scanner;

public class tugas2 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        // Buatlah program untuk menerima inputan biodata
        // Anda berupa nama sekolah
        System.out.print("Nama Sekolah: ");
        String namaSekolah = input.nextLine();
        // jarak rumah ke sekolah (tipe double),
        System.out.println("Jarak Ke Sekolah: ");
        Double jarakSekolah = input.nextDouble();

        input.nextLine();
        // kode plat nomor kendaraan (tipe char),
        System.out.println("Plat Nomor Kendaraan: ");
        char platNomorKendaraan = input.next().charAt(0);
        // anak ke berapa (tipe int)
        System.out.println("Anak Ke: ");
        int anakKe = input.nextInt();

        System.out.println("=======Hasil=======");
        System.out.println("Nama Sekolah: " + namaSekolah);
        System.out.println("Jarak Ke Sekolah: " + jarakSekolah + " Km");
        System.out.println("Plat Nomor Kendaraan: " + platNomorKendaraan);
        System.out.println("Anak Ke: " + anakKe);
    }
}