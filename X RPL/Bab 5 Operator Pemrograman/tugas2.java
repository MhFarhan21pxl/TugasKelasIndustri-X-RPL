import java.io.*;

public class tugas2 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Keterangan : Nilai a + Nilai b x Nilai c");
        System.out.println("========== Masukkan Nilai ==========");
        System.out.print("Nilai A : ");
        int nilaiA = Integer.parseInt(input.readLine());

        System.out.print("Nilai B : ");
        int nilaiB = Integer.parseInt(input.readLine());

        System.out.print("Nilai C : ");
        int nilaiC = Integer.parseInt(input.readLine());

        int hasil = nilaiA + nilaiB * nilaiC;

        System.out.println("========== Hasil ==========");
        System.out.println("Hasil : " + hasil);
    }
    
}       