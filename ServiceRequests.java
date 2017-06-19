public class ServiceRequests
{
   private String name;
   private String[] listOfNames = new String[10];
   
   public ServiceRequests()
   {
      name = "";
      for(int i = 0; i < listOfNames.length; ++i)
         listOfNames[i] = null;
   }//end method
   
   public void addName(String namePassed) 
   {
      try
      {
         if(getNumber() == 10)
            throw new ServiceBackUpException("No available service requests slots");
      }//end try
      catch(ServiceBackUpException sbe)
      {
         System.out.println(sbe.getMessage());
         System.exit(0);
      }//end catch
      for(int i = 0; i < listOfNames.length; ++i)
      {
         //if(listOfNames[i] == null)
            listOfNames[i] = namePassed;
      }//end for loop   
   }//end method
   
   public int getNumber()
   {
      int numberRequests = 10;
      for(int i = 0; i < listOfNames.length; ++i)
      {
         if(listOfNames[i] == null)
            --numberRequests;
      }//end for loop
      return numberRequests;
   }//end method
   
   public boolean removeName(String namePassed)
   {
      boolean inList = false;
      for(int i = 0; i < listOfNames.length; ++i)
      {
         if(listOfNames[i].equals(namePassed))
         {
            listOfNames[i] = null;
            inList = true;
         }//end if
      }//end for loop
      return inList;
   }//end method
   
   public String getName(int position)
   {
      return listOfNames[position];
   }//end method
}//end method