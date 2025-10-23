public class Sonline extends seller {
    private String apps;
    private double tax;
    private String DExpress;

    public Sonline(String subject, int age, String name, String payMet, double profit, String product, String promotion,
            String TargMark, String apps, double tax, String DExpress) {
        super(subject, age, name, payMet, profit, product, promotion, TargMark);
        this.apps = apps;
        this.tax = tax;
        this.DExpress = DExpress;
    }
    
    public String getApps(){
        return apps;
    }
    public void setApps(String apps){
        this.apps = apps;
    }
    public double getTax(){
        return tax;
    }
    public void setTax(double tax){
        this.tax = tax;
    }
    public String getDExpress(){
        return DExpress;
    }
    public void setDExpress(String DExpress){
        this.DExpress = DExpress;
    }

    public void Display(){
        System.out.println(getSubject());
        System.out.println(getAge());
        System.out.println(getName());
        System.out.println(getPayMet());
        System.out.println(getProfit());
        System.out.println(getProduct());
        System.out.println(getPromotion());
        System.out.println(getTargMark());
        System.out.println(apps);
        System.out.println(tax);
        System.out.println(DExpress);
    }
} {
    
}
