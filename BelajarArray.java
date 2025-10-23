public class BelajarArray {
    public static void main(String[] args) {
        String namaSiswaXR8[]={"Shabrina","Tazkia","Faliha","Najwa"};
        String[] eskul={"Badminton","Futsal","Basket"};
        String alamat[]={"Malang","Surabaya","Jember","Tuban"};
        char jenisKelamin[]= new char[2];
        jenisKelamin[0]='L';
        jenisKelamin[1]='P';

        System.out.println(jenisKelamin[0]);
        System.out.println(jenisKelamin[1]);

        System.out.println("List nama siswa kelas XR8:");
        System.out.println("=============================");
        for (int i=0; i < namaSiswaXR8.length; i++){
            System.out.println("- "+namaSiswaXR8[i]);
        }

        String NamaKota[]={"Malang","Surabaya","Jember","Tuban","Sidoarjo"};
        System.out.println("List nama kota ");
        System.out.println("=================");
        for (int i=0; i < NamaKota.length; i++){
            System.out.println("- "+NamaKota[i]);
        }

        String MataPelajaran[]={"Matematika","Bahasa Indonesia","Bahasa Inggris","Sejarah","RPL","Agama"};  
        System.out.println("List mata pelajaran "); 
        System.out.println("=================");
        for (int i=0; i < MataPelajaran.length; i++){
            System.out.println((i+1)+". "+MataPelajaran[i]);
        }

        String namaHewan[]={"Kucing","Anjing","Burung","Ikan","Buaya"};
        System.out.println("List nama hewan peliharaan ");
        for (int i=0; i < namaHewan.length; i++){
            if (namaHewan[i].length() > 4) {
                System.out.println("-"+namaHewan[i]);
            }
        }
    }
} 