import java.util.Scanner;

public class BelanjaBarangShabrinaa {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Masukkan Nama Barang1");
     String namabarang1 = input.nextLine();
     System.out.println("Masukkan Harga Barang1");
     int harga1 = input.nextInt();

     System.out.println("Masukkan Nama Barang2");
     String namabarang2 = input.next();
     System.out.println("Masukkan Harga Barang2");
     int harga2 = input.nextInt();

     System.out.println("Barang yang dibeli:" + namabarang1 + "dan" + namabarang2);
     System.out.println ("Harga" +harga1 + "dan" +harga2);

    }
}
