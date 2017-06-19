public class CannotDivideAPersonException extends Exception
{
   //default constructor
   public CannotDivideAPersonException()
   {
      super("You cannot divide a person");
   }//end
   
   //non-default constructor
   public CannotDivideAPersonException(String stringPassed)
   {
      super(stringPassed);
   }//end non-default constructor
}//end class