import java.util.Scanner;
public class tugas14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------| Program Dimulai |------------------");
        System.out.print("Masukkan Tinggi : ");
        int tinggi = scanner.nextInt();

        for (int i = 1; i <= tinggi ; i++) {
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------------| Program Selesai |------------------");
    }
}
