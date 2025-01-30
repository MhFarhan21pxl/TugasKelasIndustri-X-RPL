import java.util.Scanner;
public class tugas9 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("------------------| Program Dimulai |------------------");
            System.out.print("Masukkan Banyak Baris : ");
            int baris = scanner.nextInt();
            System.out.print("Masukk Banyak Kolom : ");
            int kolom = scanner.nextInt();
    
            for (int i = 1; i <= baris; i++) {
                for (int j = 1; j <= kolom; j++) {
                    System.out.print( "  *  ");
                }
                System.out.println();
            }
            System.out.println("------------------| Program Selesai |------------------");
    }
}
