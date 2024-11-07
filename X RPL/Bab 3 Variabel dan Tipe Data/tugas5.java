public class tugas5 {
// Buatlah variabel dan konstanta untuk program kasir yang menyimpan beberapa data, yaitu: 
// Sebagai konstanta      : nama toko dan harga pokok
// Sebagai variabel         :
// Harga promo (harga pokok dikurangi 10.000) 
// Harga reseller (harga pokok dikurangi 20.000)
// Kemudian tampilkan semua data tersebut dengan perintah System.out.println().
    public static void main(String[] args) {
        final String namaToko = "Basreng Cak Hadi";
        final int hargaBasreng = 32_000;
        int potonganPromo = 10_000;
        int potonganReseller = 20_000;

        int hargaPromo = hargaBasreng - potonganPromo;
        int hargaReseller = hargaBasreng - potonganReseller;

        System.out.println("Nama Toko : " + namaToko);
        System.out.println("Harga Basreng : " + hargaBasreng);
        System.out.println("Harga Promo : " + hargaPromo );
        System.out.println("Harga Reseller : " + hargaReseller);
    }
}
