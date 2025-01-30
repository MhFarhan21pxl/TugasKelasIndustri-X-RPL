public class tugas8 {
    public static void main(String[] args) {
        System.out.println("------------------| Program Dimulai |------------------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j * i +"\t");
            }
            System.out.print("Perkalian " + i);
            System.out.println();
        }
        System.out.println("------------------| Program Selesai |------------------");
    }
}
