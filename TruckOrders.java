public class TruckOrders
{
   int orderNumber, partNumber, quantityToPick;
   int aisleNumber, shelfNumber, binNumber;
   //Default Constructor
   public TruckOrders()
   {
      orderNumber = 0;
      partNumber = 0;
      quantityToPick = 0;
      aisleNumber = 0;
      shelfNumber = 0;
      binNumber = 0;
   }//end default constructor
   
   //Non-Default Constructor
   public TruckOrders(int orderNumberPassed, int partNumberPassed, int quantityToPickPassed,
                      int aisleNumberPassed, int shelfNumberPassed, int binNumberPassed)
   {
      orderNumber = orderNumberPassed;
      partNumber = partNumberPassed;
      quantityToPick = quantityToPickPassed;
      aisleNumber = aisleNumberPassed;
      shelfNumber = shelfNumberPassed;
      binNumber = binNumberPassed;
   }//end non-default constructor
   
   //ToString Method
   public String toString()
   {
      return this.aisleNumber + "\t\t\t\t\t" + this.shelfNumber + "\t\t\t\t\t" + this.binNumber + "\t\t\t\t\t" +
             this.quantityToPick + "\t\t\t\t\t" + this.partNumber + "\t\t\t\t\t" + this.orderNumber;
   }//end toString method
   
}//end class