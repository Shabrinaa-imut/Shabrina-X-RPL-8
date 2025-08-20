import java.util.Scanner;

public class PercabanganSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan warna lampu");
        String lampu = input.next();

        switch (lampu) {
        case "Merah":
            System.out.println("Anda harus berhenti");
            break;
        case "Kuning":
            System.out.println("Anda siap-siap yaaa");
            break;
        case "Hijau":
            System.out.println("Anda boleh jalan");
            break;
        default:
            System.out.println("Salah ketik yaa");
            break;

        }
    }
}
