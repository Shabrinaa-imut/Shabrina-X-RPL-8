public class Book {
     //ptoperties/variable
   private String title;
   private int year;
   private double price;

   //constructor->namanya sama dengan nama class
      public Book (){
       title = "Katakan sayang";
       year = 2021;
       price = 99000;

   }
   //Constructor dengan parameter
   public Book(String title, int year, double price){ 
    this.title = title;
    this.year = year;
    this.price = price;
   }

   //Getter dan Setter
   public String getTitle(){
    return title;
   }

   public void setTitle(String title) {
    this.title = title;
   }

   public int getYear(){
    return year;
   }

   public void setYear(){
    this.year = year;
   }

   public double getPrice(){
    return price;
   }

   public void setPrice(double price){
    this.price = price;
   }

   // method
    public void display() {
    System.out.println("Title :"+title);
    System.out.println("Year : "+year);
    System.out.println("Price : "+price);
    }

}


