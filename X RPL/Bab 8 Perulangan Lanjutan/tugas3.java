public class tugas3 {
    public static void main(String[] args) {
        int a = 0, b = 1, c;

        System.out.print(a + "\t" + b + "\t");

        while (true) {
            c = a + b;
            if (c >= 200) {
                break;
            }
            System.out.print(c + "\t");
            a = b;
            b = c;
        }
        System.out.println(" ");
    }
}