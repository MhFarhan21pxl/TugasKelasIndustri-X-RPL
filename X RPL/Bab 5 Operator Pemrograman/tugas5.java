import javax.swing.JOptionPane;

public class tugas5 {
    public static void main(String[] args) {
        int sirup = 5;
        int deterjen = 6;
        int mieInstan = 10;

        System.out.println("-------- Jumlah Barang --------");
        System.out.println("Sirup\t\t : " + sirup + " Botol" );
        System.out.println("Deterjen\t : " + deterjen + " Bungkus");
        System.out.println("Mie Instan\t : " + mieInstan + " Bungkus");

        int tambahSirup = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Sirup Yang Akan Dimaksukan"));
        int tambahDeterjen = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Deterjen Yang Akan Dimaksukan"));
        int tambahMieInstan = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Mie Instan Yang Akan Dimaksukan"));

        sirup += tambahSirup;
        deterjen += tambahDeterjen;
        mieInstan += tambahMieInstan;

        System.out.println("\n-------- Jumlah Barang --------");
        System.out.println("Sirup\t\t : " + sirup + " Botol");
        System.out.println("Deterjen\t : " + deterjen + " Bungkus");
        System.out.println("Mie Instan\t : " + mieInstan + " Bungkus");
    }
}


