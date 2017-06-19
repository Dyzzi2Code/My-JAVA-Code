/* Author: ProfJBS 
 * Description: LSBI Stego 
 * and writes result to another file 
 * Last Revision: 04.19.2017 
 */ 
 
import java.util.Scanner; 
import java.io.PrintWriter; 
import java.io.FileNotFoundException; 
import java.io.FileOutputStream; 
import java.io.FileInputStream; 
 
public class LSBI_CeceliaWilliams 
{ 
   public static void main(String[] args) 
   { 
    
      //variables 
      int bit;
      String message = "";
      int linecount = 0;
      
      //open file for reading to count the lines
      Scanner inputStream = null; 
      try 
      { 
         inputStream = new Scanner(new FileInputStream("binary.txt")); 
      }//end try 
      catch(FileNotFoundException e) 
      { 
         System.out.println("Could not open file, program will end."); 
         System.exit(0); 
      }//end catch 
      while(inputStream.hasNextLine())
      {
         inputStream.nextLine();
         ++linecount;
      }
      inputStream.close();
      
      System.out.println(linecount);
 
      //open file for reading  for input of binary
      inputStream = null; 
      try 
      { 
         inputStream = new Scanner(new FileInputStream("binary.txt")); 
      }//end try 
      catch(FileNotFoundException e) 
      { 
         System.out.println("Could not open file, program will end."); 
         System.exit(0); 
      }//end catch 
       
      //open a file for writing 
      PrintWriter outputStream = null; 
      try 
      { 
         outputStream = new PrintWriter(new FileOutputStream("stego.txt")); 
      }//end try 
      catch (FileNotFoundException e) 
      { 
         System.out.println("Could not open file, program will end."); 
         System.exit(0); 
      }//end catch 
       
      
      //read token (first word) on line 
      //discard rest of line and duplicates 
      //write to file 
      while(inputStream.hasNextInt()) 
      {
         for(int i = 0; i < 7; ++i)
         {
            inputStream.nextInt();
         } 
         outputStream.println(inputStream.nextInt());
      }//end while 
       
      //close files 
      inputStream.close(); 
      outputStream.close();
      
      
      
      ////////////////////////////
      //open file for reading 
      inputStream = null; 
      try 
      { 
         inputStream = new Scanner(new FileInputStream("stego.txt")); 
      }//end try 
      catch(FileNotFoundException e) 
      { 
         System.out.println("Could not open file, program will end."); 
         System.exit(0); 
      }//end catch 
       
      //open a file for writing 
      outputStream = null; 
      try 
      { 
         outputStream = new PrintWriter(new FileOutputStream("secretMessage.txt")); 
      }//end try 
      catch (FileNotFoundException e) 
      { 
         System.out.println("Could not open file, program will end."); 
         System.exit(0); 
      }//end catch 
       
      
      //read token (first word) on line 
      //discard rest of line and duplicates 
      //write to file 
      for(int j = 0; j < linecount/8; ++j)
      {
         for(int i = 0; i < 8; ++i)
         {
            message = message + inputStream.nextInt();
            inputStream.nextLine();
         } //end for loop
         outputStream.println(message);
         message = "";
      }//end for loop 
       
      //close files 

}
}