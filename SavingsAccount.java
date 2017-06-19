public class SavingsAccount extends BankAccount
{
   public boolean active;
   
   public SavingsAccount()
   {
      super();
      active = true;
   }//end default constructor
   
   public SavingsAccount(double balancePassed, double annualInterestRatePassed, boolean activePassed)
   {
      super(balancePassed, annualInterestRatePassed);
      active = activePassed;
   }//end non-default constructor
   
   @Override
   public void withdraw(double withdrawalPassed)
   {
      if(active == false)
      {
         System.out.println("Withdrawal cannot be processed, your account is inactive");
         return;
      }//end if
      super.withdraw(withdrawalPassed);
   }//end withdrawal method

   @Override
   public void deposit(double depositPassed)
   {
      if(active)
      {
         super.deposit(depositPassed);
         return;
      }//end if
      else if(active == false && (balance + depositPassed) > 25)
      {
         super.deposit(depositPassed);
         active = true;
         return;
      }//end else if
      else
      {
         System.out.println("Account is not active, insuffcient deposit.");
         System.out.println("Deposit could not be made.");
         return;
      }//end else
   }//end deposit method
   
   @Override
   public void monthlyProcess()
   { 
      if(numberMonthlyWithdrawals > 4)
      {
         monthlyServiceCharges = monthlyServiceCharges + (numberMonthlyWithdrawals - 4);
      }//end if
      super.monthlyProcess();
      if(balance < 25)
         active = false;
   }//end Monthly Process Method
   
}//end class