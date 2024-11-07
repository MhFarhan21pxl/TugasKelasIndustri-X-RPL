import java.util.Scanner;

public class tugas6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Anda Berada Di Jakarta dengan plat A...");
        System.out.print("Masukkan Huruf Plat nomor A(B,C,E,F,G,P,S,T,U,,K,) = ");

        char platNomor = scanner.next().toUpperCase().charAt(0);
        String namaDaerah;

        switch (platNomor) {
            case 'B':
                namaDaerah = "Kota Jakarta Barat";
                break;
            case 'C':
                namaDaerah = "Kota Tangerang";
                break;
            case 'E':
                namaDaerah = "Kota Depok";
                break;
            case 'F':
                namaDaerah = "Kab. Bekasi";
                break;
            case 'G':
                namaDaerah = "Kab. Tangerang";
                break;
            case 'P':
                namaDaerah = "Kota Jakarta Pusat";
                break;
            case 'S':
                namaDaerah = "Kota Jakarta Selatan";
                break;
            case 'T':
                namaDaerah = "Kota Jakarta Timur";
                break;
            case 'U':
                namaDaerah = "Kota Jakarta Selatan";
                break;
            case 'K':
                namaDaerah = "Kota Bekasi";
                break;
            default:
                namaDaerah = "DATA YANG ANDA INPUTKAN TIDAK VALID";
        }
        System.out.println("Nama Kota Plat Anda " + "'" + namaDaerah + "'");
    }
}
