public class DemoRecursion_cwilliams
{
   public static void main(String[] args)
   {
      int num = 5;
      System.out.println(factorialIterative(num));
      System.out.println(factorialIterative_after20(num));
      System.out.println(factorialRecursive(num));
   }//end main
   
////////////////////////   METHODS   /////////////////////////////

   public static long factorialIterative(long n)
   {
      long product = 1;
      for(long i = 1; i <= n; ++i)
      {
         product = product * i;   
      }//end for loop
      return product;
   }//end method
   public static long factorialIterative_after20(long n)
   {
      long product_after20 = 1;
      for(long i = n; i >= 1; --i)
      {
         product_after20 = product_after20 * i;   
      }//end for loop
      return product_after20;
   }//end method
   
   public static long factorialRecursive(long n)
   {
      if(n == 1)//base case
         return 1;
         else
            return n * factorialRecursive(n-1);
   }//end method

}//end class