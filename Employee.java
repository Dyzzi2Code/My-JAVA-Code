public class Employee extends Person
{

   private String ssn;
   private double salary;
   
   public Employee()
   {
      super();
      ssn = "unknown";
      salary = 0;
   }
   
   public Employee(String ssnPassed,  double salaryPassed)
   {
      ssn = ssnPassed;
      salary = salaryPassed;
   }
   
   public Employee(String namePassed,String addressPassed,String phoneNumberPassed,String ssnPassed,double salaryPassed)
   {
      super(namePassed, addressPassed, phoneNumberPassed);
      ssn = ssnPassed;
      salary = salaryPassed;
   }

   
   public void setSSN(String ssnPassed)
   {
      this.ssn = ssnPassed;
   }
   
   public void setSalary(double salaryPassed)
   {
      this.salary = salaryPassed;
   }
   
   public String getSSN()
   {
      return this.ssn;
   }
   
   public double getSalary()
   {
      return this.salary;
   }
   
   public String toString()
   {
      return super.toString() +
      "\nSocial Security Number: " + this.ssn +
      "\nSalary: " + this.salary;
   }
   
   
   
   public boolean equals(Employee employeePassed)
   {
      return super.equals(employeePassed) 
      && 
      this.ssn.equals(employeePassed.ssn)
      &&
      this.salary == employeePassed.salary;
   }

}//end class