import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;

public class Warehouse_CeceliaWilliams
{
   public static void main(String[] args)
   {
      int orderNum, partNum, quantity, aisleNum, shelfNum, binNum;
      int orderCount = 0, truckCount = 0;
      boolean allNums = false;
      int ordersPerTruck = 6;
      TruckOrders[] orders;
      
      Scanner keyboard = new Scanner(System.in);
      
      //open-create file for writing
      PrintWriter outputStream = null;
      
      try
      {
          outputStream 
           = new PrintWriter(new FileOutputStream("sorted_warehouse_data.txt"));    
      }
      catch(FileNotFoundException e)
      {
          System.out.println("File was not found, program to end.");
          System.exit(0);
      }//end catch block

      //open file for reading orders
      Scanner inputStream = null;

		try
		{
		   inputStream = new Scanner
			(new FileReader("warehouse_data.txt"));
		}
		catch(FileNotFoundException e)
		{
   		System.out.println("File not found, program to close");
   		System.exit(0);
		}//end catch

      //Processing Orders By Number Of Trucks
      do
      {
         //get number of trucks greater than 0
         try
         {
            System.out.println("How many trucks are available for packing today? ");
            truckCount = keyboard.nextInt();
            if(truckCount <= 0)
            {
               throw new ArraySizeException("Number of trucks must be greater than 0!");
            }//end if
            allNums = true;
         }//end try
         
         //Catch If User Enters A Non-Digit
         catch(InputMismatchException ime)
         {
            System.out.println("Invalid input! Please enter the number of trucks greater than 0");
            System.out.println(ime.getMessage());
            keyboard.nextLine();//flush the line
         }//end catch
         catch(ArraySizeException ase)
         {
            System.out.println(ase.getMessage());
         }//end catch
         
      }while(!allNums);
      
      keyboard.nextLine();//flush the line
		
      //Create an Array to Hold the Truck Orders
      orders = new TruckOrders[ordersPerTruck];
      TruckOrders[] tempOrders = new TruckOrders[ordersPerTruck];
      int truckNumber = 0;
      
      for(int i = 0; i < truckCount; ++i)
      {
         while(inputStream.hasNextInt())
         {
            for(int j = 0; j < ordersPerTruck; ++j)
            {
               orderNum = inputStream.nextInt();
               partNum = inputStream.nextInt();
               quantity = inputStream.nextInt();
               aisleNum = inputStream.nextInt();
               shelfNum = inputStream.nextInt();
               binNum = inputStream.nextInt();
               
               //populate the array
               orders[j] = new TruckOrders(orderNum,partNum,quantity,aisleNum,shelfNum,binNum);
               orderCount = orderCount + 1;
               
               truckNumber++;              
            }//end for loop
            break;
         }//end while
         System.out.println("Truck Number: " + truckNumber + " Packing Slip");
         printOrders(orders);
         sortOrders(orders, tempOrders);
         System.out.println("Sorted Packing Slip: ");
         printOrders(tempOrders);
      }//end for loop                              
   }//end main
   
   //Create the printOrders method
   public static void printOrders(TruckOrders[] ordersPassed)
   {
      System.out.println("Aisle\t\t\t Shelf\t\t\t Bin\t\t\t Quantity\t\t\t Part No.\t\t\t Order No.");
      for(int i = 0; i < ordersPassed.length; ++i)
      {
         System.out.println(ordersPassed[i].toString());
      }//end for loop
   }//end printOrders method
   
   //Create the sortOrders method
   public static void sortOrders(TruckOrders[] ordersPassed,TruckOrders[] tempOrdersPassed)
   {
      int count = 0;
      
      //For Loop For AISLE
      for(int i = 1; i <= 6; ++i)
      {
         //For Loop For SHELF
         for(int j = 1; j <= 3; ++j)
         {
            //For Loop For BIN
            for(int k = 1; k <= 10; ++k)
            {
               //For Loop For Sorting
               for(int l = 0; l < 6; ++l)
               {
                  if(ordersPassed[l].aisleNumber == i &&
                     ordersPassed[l].shelfNumber == j &&
                     ordersPassed[l].binNumber == k)
                  {
                     tempOrdersPassed[count] = new TruckOrders(ordersPassed[l].orderNumber, 
                                                               ordersPassed[l].partNumber,
                                                               ordersPassed[l].quantityToPick, 
                                                               ordersPassed[l].aisleNumber,
                                                               ordersPassed[l].shelfNumber,
                                                               ordersPassed[l].binNumber);
                     count = count + 1;
                  }//end if
               }//end SORT for loop
            }//end BIN for loop
         }//end SHELF for loop
      }//end AISLE for loop
   }//end sortOrders method
}//end class