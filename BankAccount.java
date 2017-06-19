public abstract class BankAccount
{
   public double balance;
   public int numberMonthlyDeposits;
   public int numberMonthlyWithdrawals;
   public double annualInterestRate;
   public double monthlyServiceCharges;
   
   public BankAccount()
   {
      balance = 0;
      numberMonthlyDeposits = 0;
      numberMonthlyWithdrawals = 0;
      annualInterestRate = 0;
      monthlyServiceCharges = 0;
   }//end default constructor method
   
   public BankAccount(double balancePassed, double annualInterestRatePassed)
   {
      balance = balancePassed;
      numberMonthlyDeposits = 0;
      numberMonthlyWithdrawals = 0;
      annualInterestRate = annualInterestRatePassed;
      monthlyServiceCharges = 0;
   }//end non-default constructor method
   
   public void deposit(double depositPassed)
   {
      balance = balance + depositPassed;
      ++numberMonthlyDeposits;
   }//end deposit method
   
   public void withdraw(double withdrawalPassed)
   {
      balance = balance + withdrawalPassed;
      ++numberMonthlyWithdrawals;
   }//end withdrawal method
   
   public void calcInterest()
   {
      balance = balance + balance * (annualInterestRate/12);
   }//end calcInterest method
   
   public void monthlyProcess()
   {
      balance = balance - monthlyServiceCharges;
      calcInterest();
      numberMonthlyDeposits = 0;
      numberMonthlyWithdrawals = 0;
      monthlyServiceCharges = 0;
   }//end calcInterest method 


}//end class