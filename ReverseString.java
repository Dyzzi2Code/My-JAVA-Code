public class ReverseString
{
   public static void main(String[] args)
   {
      System.out.println(recursiveReverse("dennis sinned"));
   }//end main
   
   public static String recursiveReverse(String stringPassed)
   {
      String reversedString = null;
      if(stringPassed.length() == 1)
      {
         return stringPassed;
      }//end if
      else
      {
         String lastCharInString = stringPassed.substring(stringPassed.length() - 1, stringPassed.length());
         String remainingString = stringPassed.substring(0,stringPassed.length() - 1);
         reversedString = lastCharInString + recursiveReverse(remainingString);
         return reversedString;
      }//end else
   }//end method
}//end class