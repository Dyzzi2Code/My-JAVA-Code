import java.util.Scanner;
public class SSNLengthException extends Exception
{
   public SSNLengthException()
   {
      super("SSN length exception: SSN must be 9 characters in length!");
   }//default constructor
   
   public SSNLengthException(String messagePassed)
   {
      super(messagePassed);
   }//non-default constructor
   
   public String validateSSNLength(String ssnPassed)
   {
      Scanner keyboard = new Scanner(System.in);
      while(ssnPassed.length() != 9)
      {
         System.out.println("Invalid entry please enter 9 digits.");
         ssnPassed = keyboard.nextLine();
      }//end while
      return ssnPassed;
   }//end method

}//end class