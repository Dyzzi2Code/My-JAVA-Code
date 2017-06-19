import java.util.Scanner;
public class DemoExceptions 
{   
   public static void main(String[] args) throws Exception   
   {    
      Scanner keyboard = new Scanner(System.in);    
      int userInput;    
      System.out.println("Please enter 1, 2 or 3.");    
      userInput = keyboard.nextInt();       
      try    
      {      
         if(userInput == 1)        
            throw new Exception1();        
            else           
               if(userInput == 2)              
                  throw new Exception2();                
                  else                   
                     if(userInput == 3)                       
                        throw new Exception3();                       
                        else                         
                           throw new Exception("Exception thrown");       
      }//end try block  
      
      //catch methods() look for the instances of the class Exception1 trying to go by
      //grabs it and refers to it as e and does what its supposed to do.       
      catch(Exception1 e)    
      {     
         System.out.println(e.getMessage());    
      }//end catch Exception1   
      
      //catch methods() look for the instances of the class Exception2 trying to go by
      //grabs it and refers to it as e and does what its supposed to do.    
      catch(Exception2 e)    
      {     
         System.out.println(e.getMessage());    
      }//end catch Exception2  
      
      //catch methods() look for the instances of the class Exception1 trying to go by
      //grabs it and refers to it as e and does what its supposed to do.     
      catch(Exception3 e)    
      {     
         System.out.println(e.getMessage());    
      }//end catch Exception3
      
      //this catch method() look for the not found instances of the class Exception trying to go by
      //grabs it and refers to it as e and does what its supposed to do.       
      catch(Exception e)    
      {     
         System.out.println(e.getMessage());    
      }//end catch Exception
      
      
      finally    
      {      
         System.out.println("Finally block executed.");    
      }//end finally block
   }//end main 
}//end class