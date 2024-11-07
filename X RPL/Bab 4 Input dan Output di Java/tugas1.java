import java.util.Scanner;
// nama lengkap, usia, kota asal, tinggi badan (berupa angka desimal,
public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        // input
        // input nama lengkap
        System.out.println("-------- Masukan Data --------");
        System.out.print("Nama Lengkap\t: ");
        String nama = input.nextLine();

        // Input Usia
        System.out.print("Usia\t\t: ");
        int usia = input.nextInt();

        input.nextLine();

        // input kota asal
        System.out.print("Kota Asal\t: ");
        String kotaAsal = input.nextLine();

        // input tinggi badan
        System.out.print("Tinggi Badan\t: ");
        double tinggiBadan = input.nextDouble();

        input.nextLine();

        // input Hobi
        System.out.print("Hobi\t\t: ");
        String hobi = input.nextLine();

        // output
        System.out.println("\n------------ Hasil ------------");
        System.out.println("Nama Lengkap\t: " + nama);
        System.out.println("Usia\t\t: " + usia + " tahun");
        System.out.println("Kota Asal\t: " + kotaAsal);
        System.out.println("Tinggi Badan\t: " + tinggiBadan + " cm");
        System.out.println("Hobi\t\t: " + hobi);
        input.close();
    }
}