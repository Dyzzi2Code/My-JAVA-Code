public class Customer extends Person
{
private int customerNumber;
private boolean mailingList;

 

//contructors

public Customer()
{
super();
customerNumber = 0;
mailingList = false;
}


public Customer(String namePassed, String addressPassed, String phoneNumberPassed, int customerNumberPassed, boolean mailingListPassed)
{
super(namePassed, addressPassed, phoneNumberPassed);
customerNumber = customerNumberPassed;
mailingList = mailingListPassed;
}

//setters

public void setCustomerNumberPassed(int customerNumberPassed)
{
customerNumber = customerNumberPassed;
}

public void setMailingList(boolean mailingListPassed)
{
mailingList = mailingListPassed;
}

//getters

public int getCustomerNumber()
{
return customerNumber;
}

public boolean getMailingList()
{
return mailingList;
}

}//end of class