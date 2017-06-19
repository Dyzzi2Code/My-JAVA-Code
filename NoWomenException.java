public class NoWomenException extends Exception
{
   //default constructor
   public NoWomenException()
   {
      super("No women available");
   }//end
   
   //non-default constructor
   public NoWomenException(String stringPassed)
   {
      super(stringPassed);
   }//end non-default constructor
}//end class