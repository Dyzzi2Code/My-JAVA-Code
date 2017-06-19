public class International extends Division
{
   private String country;
   private String language;

   /////////////////////////////////    Constructors     ///////////////////////////////

   public International()
   {
      super();
      country = "not entered yet";
      language = "not entered yet";
   }//end default constructor
   
   public International(String initialName, long initialAcctNum, String initialCountryName, String initialLanguageName)
   {
      super(initialName, initialAcctNum);
      country = initialCountryName;
      language = initialLanguageName;
   }//end non-default constructor
      
   /////////////////////////////////       Setters      /////////////////////////////////
   
   public void setCountry(String newCountry)
   {
      country = newCountry;
   }//end setName method
   
   public void setLanguage(String newLanguage)
   {
      language = newLanguage;
   }//end setAccountNumber method
   
   ///////////////////////////////////     Getters      /////////////////////////////////
   
   public String getCountry()
   {
      return country;
   }//end getCountry method
   
   public String getLanguage()
   {
      return language;
   }//end getLanguage method

   ///////////////////////////////////      toString     /////////////////////////////////
  
   public String toString()
   {
      return "Name: " + getName() + "\nAccount Number: " + getAccountNumber() + "\nCountry: " + 
             getCountry() + "\nPerferred Language: " + getLanguage();
   }//end toString method
   
   /////////////////////////////////       Equals       ////////////////////////////////
   
   public boolean equals(International otherCustomer)
   {
      return super.equals(otherCustomer.getName())
      &&
      this.country.equals(otherCustomer.getCountry())
      &&
      this.language.equals(otherCustomer.getLanguage());
   }//end equals method
   
   ////////////////////////////////         SWOT       ////////////////////////////////
   public double swot(int strengthPassed, int weaknessPassed, int opportunityPassed, int threatPassed)
   {
      return strengthPassed - weaknessPassed + opportunityPassed + 2 * threatPassed;
   }//end swot method
   
}//end class
