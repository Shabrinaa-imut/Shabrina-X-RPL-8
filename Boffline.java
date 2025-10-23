public class Boffline extends buyer {
    private String location;
    private String benefit;

    public Boffline(String subject, int age, String name, String payMet, String needs, double budget, String location, String benefit) {
        super(subject, age, name, payMet, needs, budget);
        this.location = location;
        this.benefit = benefit;
    }

    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }

    public String getBenefit(){
        return benefit;
    }
    public void setBenefit(String benefit){
        this.benefit = benefit;
    }

    public void Display(){
        System.out.println(getSubject());
        System.out.println(getAge());
        System.out.println(getName());
        System.out.println(getPayMet());
        System.out.println(getNeeds());
        System.out.println(getBudget());
        System.out.println(location);
        System.out.println(benefit);
    }
} 
    
