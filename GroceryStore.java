import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class GroceryStore
{
   public static void main(String[] args)
   {
      double quantityPurchased;
      double costPerPound;
      String description;
      Scanner inputStream = null;
      PrintWriter outputStream = null;
      Scanner keyboard = new Scanner(System.in);
      //open to read      
      try
      {
         inputStream = new Scanner(new FileReader("cgs.txt"));
      }//end try
      catch(FileNotFoundException e)
      {
         System.out.println("Could not open fie, program will exit");
         System.exit(0);
      }//end catch
      
      //open to write
      try
      {
         outputStream = new PrintWriter(new FileOutputStream("purchases.txt"));
      }//end try
      catch(FileNotFoundException e)
      {
         System.out.println("Could not open fie, program will exit");
         System.exit(0);
      }//end catch

            
      while(inputStream.hasNextLine())
      {
         costPerPound = inputStream.nextDouble();
         description = inputStream.nextLine();
         System.out.println("How many pounds of " + description + " at $" 
         + costPerPound + " per pound would you like to purchase:");
         quantityPurchased = keyboard.nextDouble();
         outputStream.print(costPerPound + " ");
         outputStream.print(quantityPurchased + " ");
         outputStream.print(description + " ");
         outputStream.println(quantityPurchased * costPerPound + " ");

         
      }//end while
      inputStream.close();
      outputStream.close();
   }//end main
}//end class