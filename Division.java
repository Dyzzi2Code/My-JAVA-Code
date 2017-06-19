public abstract class Division 
{
   private String name;
   private long accountNumber;
   
   /////////////////////////////////    Constructors     ///////////////////////////////
   
   public Division()
   {
      name = "not yet entered";
      accountNumber = 1111;
   }//end default constructor
   
   public Division(String initialName, long initialAcctNum)
   {
      name = initialName;
      accountNumber = initialAcctNum;
   }//end non-default constructor
    
   /////////////////////////////////       Setters      //////////////////////////////////
   
   public void setName(String newName)
   {
      name = newName;
   }//end setName method
   
   public void setAccountNumber(long newAcctNum)
   {
      do
      {
         accountNumber = newAcctNum;
      }while(newAcctNum < 0);
   }//end setAccountNumber method

   ///////////////////////////////////     Getters      /////////////////////////////////
   
   public String getName()
   {
      return name;
   }//end getName method
   
   public long getAccountNumber()
   {
      return accountNumber;
   }//end getAccountNumber method
   
  ///////////////////////////////////      toString     /////////////////////////////////
  
   public String toString()
   {
      return "Name: " + getName() + "\nAccount Number: " + getAccountNumber();
   }//end toString method
   
   /////////////////////////////////       Equals       ////////////////////////////////
   
   public boolean equals(Division otherCustomer)
   {
      return this.name.equalsIgnoreCase(otherCustomer.name)
      &&
      this.accountNumber == otherCustomer.accountNumber;
   }//end equals method
   
   /////////////////////////////
   
   
   
   
   
   
   
   
   
   
   
   ///         SWOT       ////////////////////////////////
   
   public abstract double swot(int strengthPassed, int weaknessPassed, int opportunityPassed, int threatPassed);
   
}//end class