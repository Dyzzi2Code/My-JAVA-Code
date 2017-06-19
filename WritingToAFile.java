import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class WritingToAFile
{
   public static void main(String[] args)
   {
      int userInput;
      Scanner keyboard = new Scanner(System.in);
      PrintWriter outputStream = null;
            
      try
      {
         outputStream = new PrintWriter(new FileOutputStream("fred.txt"));
      }//end try
      catch(FileNotFoundException e)
      {
         System.out.println("Could not open fie, program will exit");
         System.exit(0);
      }//end catch
            
      for(int i = 0; i < 5; ++i)
      {
         System.out.println("Please enter an int:  ");
         userInput = keyboard.nextInt();
         outputStream.println(userInput);
      }
      outputStream.close();
   }//end main
}//end class