import java.util.Scanner;

public class BankAccountDemo
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      //BankAccount account_b = new BankAccount();
      SavingsAccount account_b = new SavingsAccount();
      int selection = 0;
      double interestRate;
      double depositAmount = 0.0, withdrawAmount = 0.0;
      
      do
      {
         System.out.println("Enter 1 to make a deposit\n" +
                            "Enter 2 to make a withdrawal\n" +
                            "Enter 3 to complete monthly process\n" +
                            "Enter 4 to display balance\n" +
                            "Enter 5 to chose another process\n" +
                            "Enter any other number to QUIT\n");
         selection = keyboard.nextInt();
         while(selection < 1 || selection > 5)
         {
            System.out.println("Please enter a valid selection 1 - 5");
            selection = keyboard.nextInt();
         }
         switch(selection)
         {
            case 1:
               System.out.println("Enter the amount to be deposited: ");
               depositAmount = keyboard.nextDouble();
               account_b.deposit(depositAmount);
               System.out.println("The amount you have deposited during this transaction is: ");
               System.out.println(String.format("$%,.2f", depositAmount));
               System.out.println();
               break;
               
            case 2:
               System.out.println("Enter the amount you would like to withdraw: ");
               withdrawAmount = keyboard.nextDouble();
               account_b.withdraw(withdrawAmount);
               System.out.println("The amount you have withdrawn during this transaction is: ");
               System.out.println(String.format("$%,.2f", withdrawAmount));
               System.out.println();
               if(account_b.numberMonthlyWithdrawals > 4)
               {
                  for(int i = 4; i < account_b.numberMonthlyWithdrawals; ++i)
                  {
                     double serviceCharge = 0.00;
                     serviceCharge = serviceCharge + 1.00;
                     account_b.monthlyServiceCharges = serviceCharge;
                  }//end for
               }//end if
               break;
               
            case 3:
               System.out.println("Enter the annual interest rate: ");
               interestRate = keyboard.nextDouble();
               account_b.annualInterestRate = interestRate;
               System.out.println("The balance this month with calculated interest is: ");
               System.out.println(String.format("$%,.2f", account_b.balance));
               System.out.println("This month you have made: ");
               System.out.println(account_b.numberMonthlyDeposits + " deposits to your account.");
               System.out.println(account_b.numberMonthlyWithdrawals + " withdrawals from your account.");
               if(account_b.monthlyServiceCharges >= 1.00)
               {
                  System.out.println("You have incurred:");
                  System.out.print(String.format("$%,.2f", account_b.monthlyServiceCharges));
                  System.out.println(" in surcharges this month."); 
               }//end while
               System.out.println();
               break;
               
            case 4:
               System.out.println("Your current balance is: ");
               System.out.println(String.format("$%,.2f", account_b.balance));
               System.out.println();
               break;
            
            case 5:
               System.out.println("Enter the corresponding number to the process you would like to use next: ");
               selection = keyboard.nextInt();
               break;
         }//end switch statement
      }while(selection != 5);
      while(selection < 1 || selection > 5)
      {
         System.exit(0);
      }//end while
   }//end main
}//end class