public class Person
{
   private String name;
   private String address;
   private String telephoneNumber;
   
   public Person()
   {
      name = "unknown";
      address = "unknown";
      telephoneNumber = "unknown"; 
   }//default constructor
   
   public Person(String namePassed, String addressPassed, String telephoneNumberPassed)
   {
      name = namePassed;
      address = addressPassed;
      telephoneNumber = telephoneNumberPassed; 
   }//non-default constructor
   
   ///////////////////////////////////Setters///////////////////////////////////////////////////
   public void setName(String namePassed)
   {
      name = namePassed;
   }

   public void setAddress(String addressPassed)
   {
      address = addressPassed;
   }
   
   public void setTelephoneNumber(String telephoneNumberPassed)
   {
      telephoneNumber = telephoneNumberPassed;
   }  
   
      ///////////////////////////////////Getters///////////////////////////////////////////////////
   public String getName()
   {
     return this.name;
   }

   public String getAddress()
   {
     return this.address;
   }
   
   public String getTelephoneNumber()
   {
     return this.telephoneNumber;
   }
   
   public String toString()
   {
      return
      "\nName: " + this.name + 
      "\nAddress: " + this.address +
      "\nPhone Number: " + this.telephoneNumber;
   }
   
   public boolean equals(Person personPassed)
   {
      return this.name.equals(personPassed.name)
      &&
      this.address.equals(personPassed.address)
      &&
      this.telephoneNumber.equals(personPassed.telephoneNumber);
   }
    
}//end class