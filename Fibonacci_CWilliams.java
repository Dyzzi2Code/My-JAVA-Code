import java.util.Scanner;
public class Fibonacci_CWilliams
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      long index;
      long rabbits;
      
      System.out.println("Please enter the desired index: ");
      index = keyboard.nextLong();
      rabbits = fib(index);
      System.out.println(rabbits);
      
   }//end main
   public static long fib(long indexPassed)
   {
      if(indexPassed == 0)
      {
         System.out.println("Base Case 0 reached, returning 0");
         return 0;
      }//end if
         else if(indexPassed == 1)
         {
            System.out.println("Base Case 1 reached, returning 1");
            return 1;
         }//end else if
         else 
         {
            System.out.println("Calling Fib passing " + (indexPassed - 1) +
                              " Calling fib passing " + (indexPassed - 2));
            return fib(indexPassed - 1) + fib(indexPassed -2);
         }//end else
   }//end method
   
}//end class