import java.util.Scanner;
public class SSNCharacterException extends Exception
{
   public SSNCharacterException()
   {
      super("SSN length exception: All characters must be digits!");
   }//default constructor
   
   public SSNCharacterException(String messagePassed)
   {
      super(messagePassed);
   }//non-default constructor
   
   public String validateSSNDigits(String ssnPassed)
   {
      Scanner keyboard = new Scanner(System.in);
      while(testIfDigits(ssnPassed) == false)
      {
         System.out.println("Invalid entry please enter 9 digits.");
         ssnPassed = keyboard.nextLine();
      }//end while
      return ssnPassed;
   }//end method
   
   public boolean testIfDigits(String ssnPassed)
   {
      for (int i = 0; i < ssnPassed.length(); ++i)
      {
         if(Character.isDigit(ssnPassed.charAt(i)) == false)
            return false;
      }//end for loop
      return true;
   }

}//end class