public class buyer extends UserOnline {
    private String needs;
    private double budget;

    public buyer(String subject, int age, String name, String payMet, String needs, double budget){
        super(subject, age, name, payMet);
        this.needs = needs;
        this.budget = budget;
    }

    public String getNeeds(){
        return needs;
    }
    public void setNeeds(String needs){
        this.needs = needs;
    }

    public double getBudget(){
        return budget;
    }
    public void setBudget(double budget){
        this.budget = budget;
    }

    public void Display(){
        System.out.println(needs);
        System.out.println(budget);
    }

    public void addCart(){   
    }
}