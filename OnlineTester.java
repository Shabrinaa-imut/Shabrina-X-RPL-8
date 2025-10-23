public class OnlineTester {
    public static void main(String[] args) {
        System.out.println("buyer offline");
        UserOnline atha = new Boffline("null", 15, "Atha", "QRIS", "Food", 50000, "Malang", "true");
        atha.Display();
        System.out.println("buyer online");
        UserOnline sakti = new Bonline("abc", 71, "Sakti", "cash", "clothes", 70000, "shopee", "graha kota", 1);
        sakti.Display();
        System.out.println("seller online");
        UserOnline zaniswara = new Sonline("BCA", 17, "M Ilham danis", "gopay", 0.5, "food", "advertisement", "college student", "gojek", 0.1, null);
        zaniswara.Display();
        UserOnline hama = new Soffline("cba", 54, "ajam", "cash", 0.22, "fod", "poster", "people", "restaurant malang", "yes 20", 0.1);
        hama.Display();
    }
}
