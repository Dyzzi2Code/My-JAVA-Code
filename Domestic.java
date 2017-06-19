public class Domestic extends Division
{
   private String state;

   /////////////////////////////////    Constructors     ///////////////////////////////
   
   public Domestic()
   {
      super();
      state = "not entered yet";
   }//end default constructor
   
   public Domestic(String initialName, long initialAcctNum, String InitialStateName)
   {
      super(initialName, initialAcctNum);
      state = InitialStateName;
   }//end non-default constructor
   
   /////////////////////////////////       Setters      /////////////////////////////////
   
   public void setState(String newState)
   {
      state = newState;
   }//end setName method
   
   ///////////////////////////////////     Getters      /////////////////////////////////
   
   public String getState()
   {
      return state;
   }//end getState method
   
   ///////////////////////////////////      toString     /////////////////////////////////
   
   public String toString()
   {
      return "Name: " + getName() + "\nAccount Number: " + getAccountNumber() + "\nState: " + 
             getState();
   }//end toString method
   
   /////////////////////////////////       Equals       ////////////////////////////////

   public boolean equals(Domestic otherCustomer)
   {
      return super.equals(otherCustomer.getName())
      &&
      this.state.equals(otherCustomer.state);
   }//end equals method
   
   ////////////////////////////////         SWOT       ////////////////////////////////
   
   public double swot(int strengthPassed, int weaknessPassed, int opportunityPassed, int threatPassed)
   {
      return 1.5 * strengthPassed -  .75 * weaknessPassed + opportunityPassed + threatPassed;
   }//end swot method

}//end class
