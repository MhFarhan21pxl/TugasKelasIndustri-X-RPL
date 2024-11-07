import java.util.Scanner;

public class tugas4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the brand (ABC or DEF): ");
        String brand = scanner.nextLine().toUpperCase();

        System.out.print("Enter the size (26-34): ");
        int size = scanner.nextInt();

        int price = 0;

        if (brand.equals("ABC")) {
            if (size >= 26 && size <= 30) {
                price = 160000;
            } else if (size >= 31 && size <= 34) {
                price = 180000;
            }
        } else if (brand.equals("DEF")) {
            if (size >= 26 && size <= 30) {
                price = 210000;
            } else if (size >= 31 && size <= 34) {
                price = 220000;
            }
        }

        if (price > 0) {
            System.out.println("The price of the pants is Rp " + price);
        } else {
            System.out.println("Invalid brand or size.");
        }
    }
}