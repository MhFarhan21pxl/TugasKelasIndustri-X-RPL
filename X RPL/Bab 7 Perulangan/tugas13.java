import java.util.Scanner;

public class tugas13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah deret Fibonacci: ");
        long jumlahDeret = scanner.nextInt();

        long a = 0, b = 1, c;

        System.out.print("Deret Fibonacci: ");
        int count = 0;
        do {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
            count++;
        } while (count < jumlahDeret);

        scanner.close();
    }
}