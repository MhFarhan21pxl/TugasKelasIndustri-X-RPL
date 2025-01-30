import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai untuk menghitung faktorial: ");
        int bilangan = input.nextInt();

        System.out.print(bilangan + "! = ");
        long hasil = hitungFaktorial(bilangan);
        System.out.println(" = " + hasil);
    }

    public static long hitungFaktorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            System.out.print(n + " * ");
            return n * hitungFaktorial(n - 1);
        }
    }
}