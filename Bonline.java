public class Bonline extends buyer{
    private String app;
    private String address;
    private double delFee;

    public Bonline(String subject, int age, String name, String payMet, String needs, double budget, String app, String address, double delFee) {
        super(subject, age, name, payMet, needs, budget);
        this.app = app;
        this.address = address;
        this.delFee = delFee;
    }

    public String getApp(){
        return app;
    }
    public void setApp(String app){
        this.app = app;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public double getDelFee(){
        return delFee;
    }
    public void setDelfee(double delFee){
        this.delFee = delFee;
    }

    public void Display(){
        System.out.println(getSubject());
        System.out.println(getAge());
        System.out.println(getName());
        System.out.println(getPayMet());
        System.out.println(getNeeds());
        System.out.println(getBudget());
        System.out.println(app);
        System.out.println(address);
        System.out.println(delFee);
    }
}
