public class Tugas2 {
//Buatlah variabel numerik dengan menyesuaikan nominal isiannya.
//Berat badan: 56 kg
//Tinggi badan: 160 cm
//Uang di dompet senilai: Rp. 30.000
//Uang di rekening: Rp. 2.100.000.000
//Nilai investasi: Rp 30.000.000.000
//Jarak sekolah ke rumah: 5.5 km
    public static void main(String[] args) {
        
        byte beratBadan = 56;
        short tinggiBadan = 160;
        short uangDiDompet = 30_000;
        int uangDiRekening = 2_100_000_000;
        long investasi = 30_000_000_000L;
        float jarakSekolah = 5.5f;

        System.out.println(beratBadan + " " + "kg");
        System.out.println(tinggiBadan + " " + "cm");
        System.out.println("Rp. " + uangDiDompet);
        System.out.println("Rp. " + uangDiRekening);
        System.out.println("Rp. " + investasi);
        System.out.println(jarakSekolah + " " + "km");
        
    }
}
