import java.util.Scanner;

public class tugas1 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        // Input
        System.out.println("========== Masukkan Nilai ==========");
        System.out.print("Alas \t= ");
        double alas = input.nextInt();  

        System.out.print("Tinggi \t= ");
        double tinggi = input.nextInt();
        //  Rumus Luas Segitiga 
        double luasSegitiga = tinggi * alas / 2;
        //  Output
        System.out.println("========== Hasil ==========");
        System.out.println("Luas Segitiga = " + luasSegitiga);
        input.close();
    }
}