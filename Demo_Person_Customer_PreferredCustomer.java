public class Demo_Person_Customer_PreferredCustomer
{
   public static void main(String[] args)
   {
      Person p1 = new Person();
      Person p2 = new Person("Mickey", "WDWR", "1");
      
      Customer c1 = new Customer();
      Customer c2 = new Customer("Minnie", "WDWR", "2", 11111, true);
      
     /* System.out.println();
      System.out.println(printTheValues(p1));
      System.out.println();
      System.out.println(printTheValues(p2));
      System.out.println();
      System.out.println(printTheValues(c1));
      System.out.println();
      System.out.println(printTheValues(c2));*/
      
      //array  of instances of class  array of persons
      Customer[] peeps = new Customer[2];
      peeps[0] = new Customer();
      peeps[1] = new Customer();
      
      System.out.println(printTheValues(peeps[0]));
      System.out.println();
      System.out.println(printTheValues(peeps[1]));
      
   }//end main
   
   public static String printTheValues(Person p)
   {
      return p.getName() + "\n" +
      p.getAddress()+ "\n" +
      p.getTelephoneNumber();
   }
   
   public static String printTheValues(Customer c)
   {
      return 
      printTheValues((Person)c) + "\n" +
      c.getCustomerNumber()+ "\n" +
      c.getMailingList();
   }

}//end class
