public class Soffline extends seller {
    private String place;
    private String employer;
    private double empSalary;


    public Soffline(String subject, int age, String name, String payMet, double profit, String product,
            String promotion, String TargMark, String place, String employer, double empSalary) {
        super(subject, age, name, payMet, profit, product, promotion, TargMark);
        this.place = place;
        this.employer = employer;
        this.empSalary = empSalary;
    }

    public String getPlace(){
        return place;
    }
    public void setPlace(String place){
        this.place = place;
    }

    public String getEmployer(){
        return employer;
    }
    public void setEmployer(String employer){
        this.employer = employer;
    }

    public double getEmpSalary(){
        return empSalary;
    }
    public void setEmpSalary(double empSalary){
        this.empSalary = empSalary;
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
        System.out.println(place);
        System.out.println(employer);
        System.out.println(empSalary);
    }

}