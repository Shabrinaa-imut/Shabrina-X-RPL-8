import java.util.Scanner;

public class BelanjaBuah {
    public static void main(String[] args) {
        int semangka = 14, apel = 20;
        double hargasemangka =14500, hargaapel=10500;
        double total, bayar, kembalian;

        total=(semangka*hargasemangka)+(apel*hargaapel);
        System.out.println("Jumlah Semangka yang di beli: "+semangka+" dan Apel : "+apel);
        System.out.println("Total pembayaran: "+total);
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Pembayaran : ");
        bayar=input.nextDouble();
        kembalian = bayar-total;
        System.out.println("Kembalian anda adalah : "+kembalian);
    }
}
