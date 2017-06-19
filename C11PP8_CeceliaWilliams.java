import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;

public class C11PP8_CeceliaWilliams 
{
	public static void main(String[] args)
	{
		String wordRead, startWord, endWord;
      boolean allChars;
      int count = 0;
      int position;
		Scanner inputStream = null;
      Scanner keyboard = new Scanner(System.in);
      String[] wordLibrary;
      
      //open for writing
      PrintWriter outputStream = null;
      try
      {
          outputStream 
           = new PrintWriter(new FileOutputStream("FourLetterWords.txt"));    
      }
      catch(FileNotFoundException e)
      {
          System.out.println("File was not found, program to end.");
          System.exit(0);
      }//end catch block

      //open for reading
		try
		{
		   inputStream = new Scanner
			(new FileReader("DictionaryTest.txt"));
		}
		catch(FileNotFoundException e)
		{
   		System.out.println("File not found, program to close");
   		System.exit(0);
		}//end catch
      

		
      //processing
		while(inputStream.hasNextLine())
		{
   		allChars = true;
         wordRead = inputStream.nextLine();
         if(wordRead.length() == 4)
         {
            if(isAllChars(wordRead))
            {
               outputStream.println(wordRead.toLowerCase());
               ++count;
            }//end if
         }//end if
		}//end while
              
               
      outputStream.close();
		inputStream.close();
		//System.out.println(count);
      
      //get user input
      do
      {
         System.out.println("Enter the starting word: ");
         startWord = keyboard.nextLine();
         startWord = startWord.toLowerCase();
      }while(startWord.length() != 4 || !(isAllChars(startWord)));
      do
      {
         System.out.println("Enter the ending word: ");
         endWord = keyboard.nextLine();
         endWord = endWord.toLowerCase();
      }while(endWord.length() != 4 || !(isAllChars(endWord)));  
      
      wordLibrary = new String[count];
      
      try
      {
         inputStream = new Scanner(new FileReader("FourLetterWords.txt"));
      }//end try block
      catch(FileNotFoundException e)
      {
         System.out.println("File not found, program to close.");
         System.exit(0);
      }//end catch block
      position = 0;
      
      while(inputStream.hasNextLine())
      {
         wordLibrary[position] = inputStream.nextLine();
         ++position;
      }    //end while
      
      inputStream.close();
      
      if(!(findTheWord(startWord, endWord, wordLibrary, 1, 0)))
      {
         System.out.println("Ladder found!");
      }//end if
      else
      {
         System.out.println("No Ladder Found!!");
      }//end else
      
	}//end main
   public static boolean isAllChars(String stringPassed)
   {
      for(int i = 0; i < 4; ++i)
      {
          if(!Character.isLetter(stringPassed.charAt(i)))
          {
            return false;
          }//end if
      }//end for loop
      return true;
   }//end method
   
   public static boolean findTheWord(String startWordPassed, 
            String endWordPassed, String[] wordLibraryPassed, int i, int count)
   {
      String currentWord = "";
      System.out.println(startWordPassed);
      //base case
      if(endWordPassed.substring(0,3).equals(startWordPassed.substring(0,3)))
      {
         System.out.println(endWordPassed);
         return true;
      }//end if
      else if(!(endWordPassed.substring(0,3).equals(startWordPassed.substring(0,3))))
      {
         for(int x = 0; x < wordLibraryPassed.length; ++x)
         {
            currentWord = wordLibraryPassed[x];
            if(startWordPassed.equals(currentWord))
            {
               ++x;
               currentWord = wordLibraryPassed[x];
            }//end inner if
               if(count < 2)
               {
                  if(startWordPassed.substring(i).equals(currentWord.substring(i)))
                  {
                     ++i;
                     ++count;
                     findTheWord(currentWord, endWordPassed,wordLibraryPassed, i, count);
                  }//end if
               }//end if
               else 
               {
                  if(endWordPassed.charAt(0) == currentWord.charAt(0))
                  {
                     if(startWordPassed.substring(1).equals(currentWord.substring(1)))
                     {
                        ++count;
                        //recursive call
                        findTheWord(currentWord, endWordPassed, wordLibraryPassed, i, count);
                     }//end if
                  }//end if
               }//end else
         }//end if
      }//end inner for loop
      return false;
   }//end method
}//end class