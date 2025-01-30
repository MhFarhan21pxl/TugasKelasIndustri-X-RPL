import java.util.Scanner;
public class tugas6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------| Program Dimulai |---------------");
        int jumlah = 0;
        System.out.println("Note : Masukkan angka kelipatan 5 Untuk dijumlahkan\nDan jika Memasukan angka selain angka keliaptan 5 Tidak Dijumlahkan ");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Masukkan Angka "+ i + " : ");
            int angka = scanner.nextInt();

            if (angka % 5 != 0) {
                continue;
            }
            jumlah += angka;
        }
        System.out.println("Jumlah dari Inputan angka kelipatan 5 Anda adalah : " + jumlah);
        System.out.println("---------------| Program Selesai |---------------");
    }
}
