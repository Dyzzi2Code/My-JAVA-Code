import java.util.Scanner;

public class DemoC9PP6_CeceliaWilliams
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int numberOfEmployees;
      int size = 100;
      Employee[] staff = new Employee[size];
      String name = "", address = "", phoneNumber = "", ssn = "";
      double salary = 0;
      double totalSalaries = 0;
      int numberRecordedEmployees;
      int currentEmployee = 0;
      double averageSalary;
      
      System.out.println("How many employees would you like to enter: ");
      numberOfEmployees = keyboard.nextInt();
      keyboard.nextLine();
      for(int i = 0; i < numberOfEmployees; ++i)
      {
         try
         {
            //person attributes
            System.out.println("Enter the employee name: ");
            name = keyboard.nextLine();
            System.out.println("Enter the employee's address: ");
            address = keyboard.nextLine();
            System.out.println("Enter the employee's telephone number: ");
            phoneNumber = keyboard.nextLine();
            //employee attributes
            do
            {
               System.out.println("Enter the employee's salary: ");
               salary = keyboard.nextDouble();
            }while(salary < 0);
            keyboard.nextLine();//flush the line
            System.out.println("Enter the employees Social Security Number no dashes: ");
            ssn = keyboard.nextLine();
            //throw of a length exception
            if(ssn.length() != 9) 
               throw new SSNLengthException();
            //throw of a character exception
            SSNCharacterException DummyCharacterException = new SSNCharacterException();
            if(DummyCharacterException.testIfDigits(ssn) == false)
               throw new SSNCharacterException();
            
            
         }//end try
         catch(SSNLengthException ssnle)
         {
            ssn = ssnle.validateSSNLength(ssn);
         }//end catch
         catch(SSNCharacterException ssnce)
         {
            ssn = ssnce.validateSSNDigits(ssn);
         }//end catch
         staff[i] = new Employee(name,address, phoneNumber, ssn, salary);
      }//end for loop
      
      System.out.println("Emplyee Record Details: ");
      while(staff[currentEmployee] != null)
      {
      totalSalaries = totalSalaries + staff[currentEmployee].getSalary();
      ++currentEmployee;
      
      }//end while
      
      System.out.println(totalSalaries);
      System.out.println(currentEmployee);
      averageSalary = totalSalaries/currentEmployee;
      System.out.println(averageSalary);
      
      currentEmployee = 0;//reset
      
      while(staff[currentEmployee] != null)
      {
      System.out.println(staff[currentEmployee].toString());
      if(staff[currentEmployee].getSalary() > averageSalary)
         System.out.println("Salary is above average.");
      else if(staff[currentEmployee].getSalary() < averageSalary)
         System.out.println("Salary is below average.");   
      ++currentEmployee;
      
      }//end while

   }//end main
}//end class