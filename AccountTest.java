public class AccountTest {
    public static void main(String[] args) {
        SavingsAccount account1 = new SavingsAccount();
        account1.balance = 150000;
        account1.name = "Choi Seungcheol";
        account1.interestRate = 1.5;

        SavingsAccount account2 = new SavingsAccount();
        account2.balance = 99999;
        account2.name = "Kim Mingyu";
        account2.interestRate = 1.5;

        SavingsAccount account3 = new SavingsAccount();
        account3.name = "Sayang aku";
        account3.balance = 1000000;

        account1.displayCustomer();
        account2.displayCustomer();
        account2.displayCustomer();

    }
    public class sheckle{
        SavingsAccount account1;

        public sheckle() {
            account1 = new SavingsAccount();
            account1.name = "Choi Seungcheol";
            account1.balance = 150000;
            account1.interestRate = 1.5;
        }

        public String name;
        public double balance,rate;
        public int term,MonthsRemaining;

        public void setTermAndRate(int t) {
            if (t>=0 && t<=12)
            rate = 0.005;
            else if (t>12 && t<24)
            rate = 0.010;
            else if(t>=24 && t<36)
            rate = 0.015;
            else if(t>=36 && t<48)
            rate = 0.020;
            else if(t>=48 && t<=60)
            rate = 0.025;
            else{
                System.out.println("Invalid Term");
                t = 0;
}
     term = t;
     MonthsRemaining = t;
        }
        /**
         * 
         */
        public void earnInterest(){
         if(MonthsRemaining > 0){
         balance += balance * rate / 12;
         MonthsRemaining--;
         System.out.println("Balance: $" +balance);
         System.out.println("Rate: " +rate);
         System.out.println("Months Remaining: "
         + MonthsRemaining);
         }  else{
         System.out.println("Bond Matured");
         }
        }
        
