import java.util.Scanner;

public class PerhitunganDiskon {
    public static void main(String[] args) {
        double totalBeli,diskon,hargaAkhir,bayar,kembalian;

        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Total Pembelian: ");
        totalBeli = input.nextDouble();
        if(totalBeli > 500000){
            System.out.println("Mendapat diskon 20%");
            diskon = (0.20)*totalBeli;
        }else if (totalBeli > 300000){
            System.out.println("Mendapat diskon 15%");
            diskon = (0.15)*totalBeli;
        }else if (totalBeli > 100000){
            System.out.println("Mendapat diskon 10%");
            diskon = (0.1)*totalBeli;
        }else{
            System.out.println("Tidak ada diskon");
            diskon = 0;
        }

        hargaAkhir = totalBeli - diskon;
        System.out.println("Harga Akhir "+hargaAkhir);
        System.out.println("Masukkan pembayaran ");
        bayar = input.nextDouble();
        kembalian = bayar-hargaAkhir;
        System.out.println("Kembalian anda "+kembalian);

    }
    
}
