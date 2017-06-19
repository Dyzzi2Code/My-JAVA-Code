public class C11PP7_CeceliaWilliams
{
   public static void main(String[] args)
   {
      String[][] data = {
                        {"New","Used"},
                        {"Cheap", "Moderate","Expensive"},
                        {"Dining Table", "Hutch","Book Case","Curio Cabinet","Jewlery Box"},
                        {"Pine", "Oak", "Redwood","Birch", "Maple", "Mohogany"},
                        {"Natural", "Cedar", "Almond", "Chestnut Brown"}
                        };
     String[] oneline = new String[data.length];
     
     computeProduct(data,oneline,0);
      
   }//main
   
   public static void computeProduct(String[][] dataPassed,String[] onelinePassed, int groupPassed)
   {
      //exit if  off end of top level array
      if(groupPassed >= dataPassed.length)
         return;
      //pick all possible others for this group
      for(int i = 0; i < dataPassed[groupPassed].length; ++i)
      {
         onelinePassed[groupPassed] = dataPassed[groupPassed][i];
         System.out.println("Oneline is now: ");
         printItems(onelinePassed);
         computeProduct(dataPassed, onelinePassed, groupPassed + 1);
         //print if the last group
         if(groupPassed == dataPassed.length -1)
            printItems(onelinePassed);
      }//end for loop   
   }//end method
   
   public static void printItems(String[] onelinePassed)
   {
      for(int i = 0; i < onelinePassed.length; ++i)
         System.out.println(onelinePassed[i] + " ");
      System.out.println();//adding a line between each one
   }//end method
   
}//end class