import java.util.Scanner;

public class DriverDivision 
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      Division[] customer = new Division[4];
      customer[0] =  new International("Gus Andrade", 4910, "Cape Verde", "Kriole");
      customer[1] =  new International("Betty Boo", 8574, "Italy", "Italian");
      customer[2] =  new Domestic("Penny Cents", 1605, "MA");
      customer[3] =  new Domestic("Broke Loser", 7588, "CA");
      for(Division c : customer)
      {
         c.toString();//International toString will be used
         System.out.println();
      }//end for loop
      
           
      International internationalCustomer = new International();
      Domestic domesticCustomer = new Domestic();           
      System.out.println("Enter the first and last name: ");
      String newName = keyboard.nextLine();
      System.out.println("Enter the customer account number: ");
      long newAcctNum = keyboard.nextLong();
      keyboard.nextLine();//flush the line
      System.out.println("Enter the customer resident country: ");
      String newCountryName = keyboard.nextLine();
      System.out.println("Enter the customer's preferred language: ");
      String newLanguage = keyboard.nextLine();
      System.out.println("Enter the customer's state of residence: ");
      String newState = keyboard.nextLine();
      System.out.println("Please enter the first number for SWOT: ");
      System.out.println("1-------------->>>>    ");
      int swotNum1 = keyboard.nextInt();
      System.out.println("Please enter the second number for SWOT: ");
      System.out.println("2-------------->>>>    ");
      int swotNum2 = keyboard.nextInt();
      System.out.println("Please enter the third number for SWOT: ");
      System.out.println("3-------------->>>>    ");
      int swotNum3 = keyboard.nextInt();
      System.out.println("Please enter the fourth number for SWOT: ");
      System.out.println("1-------------->>>>    ");
      int swotNum4 = keyboard.nextInt();

      System.out.println("International Output");
      International newCustomer = new International(newName, newAcctNum, newCountryName, newLanguage);
      System.out.println("Domestic Output");
      Domestic newDomCust = new Domestic(newName, newAcctNum, newState);
      System.out.println();//skip the line      
      System.out.println("International Output");
      System.out.println("here" + newCustomer);
      System.out.println();//skip the line      
      System.out.println("International Output");
      System.out.println(customer[0]);
      System.out.println("International SWOT computation: " + customer[0].swot(swotNum1, swotNum2, swotNum3, swotNum4));
      System.out.println();//skip the line      
      System.out.println("International Output");
      System.out.println(customer[1]);
      System.out.println("International SWOT computation: " + customer[1].swot(swotNum1, swotNum2, swotNum3, swotNum4));
      System.out.println();//skip the line      
      System.out.println("Domestic Output");
      System.out.println(customer[2]);
      System.out.println("Division SWOT computation: " + customer[2].swot(swotNum1, swotNum2, swotNum3, swotNum4));
      System.out.println();//skip the line      
      System.out.println("Domestic Output");
      System.out.println(customer[3]);
      System.out.println("Division SWOT computation: " + customer[3].swot(swotNum1, swotNum2, swotNum3, swotNum4));
      System.out.println();//skip the line      
      System.out.println("Domestic Output");
      System.out.println(newDomCust);

      International i = new International();

      System.out.println();
      i.setName("Milton Andrade");
      i.setAccountNumber(8512);
      i.setCountry("Brazil");
      i.setLanguage("Portugese");
      System.out.println(i.toString());
      System.out.println(i.swot(5,87,12,3));
      System.out.println();
      
      Domestic d = new Domestic();
      
      d.setName("Robert Rodriques");
      d.setAccountNumber(4655);
      d.setState("Maine");
      System.out.println(d.toString());
      System.out.println(d.swot(5,87,12,3));
      System.out.println();

      Domestic d3 = new Domestic("Lindsey Lohan", 4652, "MA");
      System.out.println(d3.toString());
      System.out.println(d3.swot(6,4,8,3));
      System.out.println();
      
      if(d.equals(d3))
         System.out.println("Oops they have the same name!!");
      else
         System.out.println("Different Customer Name");

            
      System.out.println("Division SWOT computation: " + i.swot(swotNum1, swotNum2, swotNum3, swotNum4)); 
       Division[] defaultCustomer = new Division[2];
      defaultCustomer[0] = new International();
      defaultCustomer[1] = new Domestic();
      
      System.out.println(defaultCustomer[0].toString());
      System.out.println();
      System.out.println(defaultCustomer[1].toString());



      
   }//end main
}//end class