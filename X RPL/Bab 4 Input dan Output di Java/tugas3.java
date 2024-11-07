import java.util.Scanner;

public class tugas3 {
    // Buatlah program untuk menerima inputan biodata Anda berupa 
    // nomor sepatu (tipe int)
    // sudah menikah (tipe boolean)
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        // Input
        // Jenis Kelamin
        System.out.print("Jenis Kemlamin: ");
        char jenisKelamin = input.nextLine(). charAt(0);
        // Nomor Sepatu 
        System.out.print("Nomor Sepatu: ");
        int nomorSepatu = input.nextInt();

        input.nextLine();

        // Sudah menikah
        System.out.print("Sudah menikah: ");
        boolean sudahMenikah = input.nextBoolean();

        // Output
        System.out.println("\n====== Hasil =======");
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Nomor Sepatu: " + nomorSepatu);
        System.out.println("Sudah Menikah: " + sudahMenikah);
        input.close();
    }
}
