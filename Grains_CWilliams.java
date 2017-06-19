import java.util.Scanner;
public class Grains_CWilliams
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int numberOfSquares;
      long totalGrains;
      
      System.out.println("How many squares on the board? ");
      numberOfSquares = keyboard.nextInt();
      totalGrains = calculateTotalGrains(numberOfSquares, 1);
      System.out.println(totalGrains);
      
   }//end main
   public static long calculateTotalGrains(int squaresPassed, long numGrainsPassed)
   {
      if(squaresPassed == 1)
         return numGrainsPassed;
         else return numGrainsPassed + calculateTotalGrains(squaresPassed - 1, numGrainsPassed * 2);
   }//end method
}//end class