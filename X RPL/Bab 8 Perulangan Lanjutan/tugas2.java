import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka;
        System.out.println("--------------------| Program Dimulai |--------------------");
        while (true) {
            System.out.print("Masukan Angka Bebas untuk Mengulang dan masukan angka 0 untuk berhrenti\nMasukkan Angka\t: ");
            angka = scanner.nextInt();
            if (angka == 0) {
                break;
            }
            System.out.println("Kamu Memasukkan angka : " + angka);
        }
        System.out.println("--------------------| Program selesai |--------------------");
    }
}