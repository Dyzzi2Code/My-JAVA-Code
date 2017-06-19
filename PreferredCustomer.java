public class PreferredCustomer extends Customer
{
   private double purchase;
   private double discount;
   private double discountPrice;
   public PreferredCustomer(String name, String address,String phoneNumber, int customerNumber,
                             boolean mailingList, double purchase)
   {
      super(name,address,phoneNumber,
      customerNumber, mailingList);
      this.purchase = purchase;
   }
   
   //getters
   private void calcDiscount()
   {
      if(getPurchase() >= 2000) 
      {
         setDiscount(10);
      }
      else if(getPurchase() >= 1500) 
      {
         setDiscount(7);
      }
      else if(getPurchase() >= 1000)
      {
         setDiscount(6);
      }
      else if(getPurchase() >= 500) 
      {
         setDiscount(5);
      }
   }//end getters
   
   
   //setters
   public void setPurchase(double purchase)
   {
      this.purchase = purchase;
   }
   private void setDiscount(double discount)
   {
      this.discount = discount;
   }
               
   public double getPurchase()
   {
      return purchase;
   }
      
   public double getDiscount()
   {
      calcDiscount();
      return discount;
   }
      
   private void calcDiscountPrice()
   {
      discountPrice=getPurchase() - (getPurchase() * (getDiscount()/100));
   }
      
   public void setDiscountPrice(double discountPrice)
   {
      this.discountPrice = discountPrice;
   }
   
   public double getDiscountPrice()
   {
      calcDiscountPrice();
      return discountPrice;
   }//end setters
      
   @Override
   public String toString()
   {
      String preferredCustomer=super.toString()+
      "\nPurchase "+getPurchase()+
      "\nDiscount "+getDiscount()+
      "\nDiscountPrice "+getDiscountPrice();
      return preferredCustomer;
   }
}//end class
