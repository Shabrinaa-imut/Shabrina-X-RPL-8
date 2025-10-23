public class seller extends UserOnline {
        private double profit;
        private String product;
        private String promotion;
        private String TargMark;
    public seller(String subject, int age, String name, String payMet, double profit, String product, String promotion, String TargMark) {
        super(subject, age, name, payMet);
        this.profit = profit;
        this.product = product;
        this.promotion = promotion;
        this.TargMark = TargMark;
    }

    public String getProduct(){
        return product;
    }
    public void setProduct(String product){
        this.product = product;
    }

    public double getProfit(){
        return profit;
    }
    public void setProfit(double profit){
        this.profit = profit;
    }

    public String getPromotion(){
        return promotion;
    }
    public void setPromotion(String promotion){
        this.promotion = promotion;
    }

    public String getTargMark(){
        return TargMark;
    }
    public void setTargmark(String TargMark){
        this.TargMark = TargMark;
    }

    public void addProduct(){
    }
    public void Display(){
        System.out.println(product);
        System.out.println(profit);
        System.out.println(promotion);
        System.out.println(TargMark);
    }
}
    
