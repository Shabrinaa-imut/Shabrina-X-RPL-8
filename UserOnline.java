public class UserOnline {
    private String subject;
    private int age;
    private String name;
    private String payMet;

    public UserOnline(String subject, int age, String name, String payMet){
        this.subject = subject;
        this.age = age;
        this.name = name;
        this.payMet = payMet;
    }

    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getPayMet(){
        return payMet;
    }
    public void setPaymet(String payMet){
        this.payMet = payMet;
    }

    public void Display(){
        System.out.println("Subject: " + subject);
        System.out.println("age: " + age);
        System.out.println("name: " + name);
        System.out.println("Payment Method: " + payMet);
    }
} 
