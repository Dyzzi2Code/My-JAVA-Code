import java.util.Scanner;

public class DemoServiceRequests
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      ServiceRequests callersList = new ServiceRequests();
      String caller;
      String callerRemove;
      int functionChoice;
      boolean endOfCallList = false;
      
      System.out.println("Thank you for choosing MCC Help Desk Support");
      
      do
      { 
         System.out.println("Enter\n1 - Add A Caller\n2 - View Caller List\n3 - Remove A Caller\n0 - Quit");
         functionChoice = keyboard.nextInt();
         keyboard.nextLine();//flush the line 
         
         if(functionChoice == 1)
         {  //add names to the list of callers
            System.out.println("Enter the name of the caller: ");
            caller = keyboard.nextLine();
            callersList.addName(caller);
         }//end if
         else if(functionChoice == 2)  
         {  //print list of callers
            System.out.println("The current list of callers is: ");
            for(int i = 0; i < callersList.getNumber(); ++i)
            {
               if(callersList.getName(i) != "")
               {
                  caller = callersList.getName(i);
                  System.out.println("Caller number : " + (i + 1) + ("\t") + callersList.getName(i));
               }//end if
            }//end for loop
            System.out.println();//give a line space
          }//end else if
          else if(functionChoice == 3)
          {  //remove a caller from the list
             System.out.println("Which name would you like to remove? ");
             callerRemove = keyboard.nextLine();
             callersList.removeName(callerRemove);
          }//end else if
          else if(functionChoice == 0)
          {  //exits the program
             System.out.println("Thank you for choosing MCC Help Desk");
          }//end else if
          else
          {
             System.out.println("Thank you for choosing MCC Help Desk");
             System.exit(0);
          }//end else
      }while(!endOfCallList);
      System.out.println(callersList);
   }//end main
}//end class