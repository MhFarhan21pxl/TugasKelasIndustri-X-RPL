import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int belanja;

        System.out.println("Inputkan total belanjaan anda");
        belanja = input.nextInt();
        

        if (belanja >= 500000) {
            System.out.println("Selamat! Anda mendapatkan hadiah gantungan kunci");
        }else{
            int selisihBelanja = 500000 - belanja ;
            System.out.println("Total belanja anda kurang dari Rp.500000");
            System.out.println("Silahkan tambahkan lagi total belanja anda senilai Rp. " + selisihBelanja);
            System.out.println("Untuk mendapatkan hadiahgantungan kunci");
        }
    }
}
