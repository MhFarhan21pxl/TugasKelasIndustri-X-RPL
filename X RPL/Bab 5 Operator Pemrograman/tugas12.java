import java.util.Scanner;

public class tugas12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean hasilSeleksiTinggi;
        boolean hasilSeleksiNilai;
        double tinggiMinimal = 160;
        int nilaiMinimum = 80;

        double tinggiUser = input.nextDouble();
        int nilaiUser = input.nextInt();

        hasilSeleksiTinggi = tinggiMinimal >= tinggiUser;
        System.out.println("Hasil Seleksi Tinggi Badan\t: " + hasilSeleksiTinggi);

        hasilSeleksiNilai = nilaiMinimum >= nilaiUser;
        System.out.println("Hasil Seleksi Nilai\t: " + hasilSeleksiNilai);

        System.out.println("Hasil final : " + (hasilSeleksiNilai && hasilSeleksiTinggi));
        input.close();
    }
}