
import java.util.Scanner;

public class tugas15 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("program operasi demontrasi operator bitwise");

        //input nilai a
        System.out.print("masukan nilai a");
        int a = scanner.nextInt();

        //input nilai b 
        System.out.println("masukan nilai b");
        int b = scanner.nextInt();

        // operasi bitwise
        int and = a & b;
        int or = a | b;
        int xor = a ^ b;
        int notA = ~a;
        int notB = ~b;
        int leftShift = a << 2;
        int rightShift = b >> 2;

        //menampilkan hasil
        System.out.println("\nHasil  Operasi Bitwise");
        System.out.println("a & b = " + and);
        System.out.println("a | b  = " + or);
        System.out.println("a ^ b = "  + xor);
        System.out.println("~a = " + notA);
        System.out.println("~b = " + notB);
        System.out.println("a << 2 =  " + leftShift);
        System.out.println("b  >> 2 = " + rightShift);
        scanner.close();








    }
}
