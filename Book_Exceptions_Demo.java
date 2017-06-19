import java.util.Scanner;
import java.util.InputMismatchException;

public class Book_Exceptions_Demo
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      String title = "";
      String author = "";
      int pages = 1;
      String category = "";
      boolean read = false;
      double cost = 0;
      int n = 0;
      boolean validN = false, validTitle = false, validAuthor = false, validPages = false, validRead = false, validCost = false, validCategory = false;
      Book[] arrayOfBooks;
      
      
      //get number of books to process
      do
      {
         try
         {
            System.out.println("Please enter the number of books in your library:");
            n = keyboard.nextInt();
            if(n < 0)
               {
               throw new ArraySizeException("Invalid number of books, must be >= 0, try again.");
               }//end if
            validN = true;
         }//end try
         catch(InputMismatchException ime)
         {
            System.out.println("Invalid input type.");
            System.out.println(ime.getMessage());
            keyboard.nextLine();//flush line
         }//end catch
         catch(ArraySizeException ase)
         {
            System.out.println(ase.getMessage());
         }//end catch
      
      }while(!validN);
      keyboard.nextLine();//flush line
      
      //creat the array
      arrayOfBooks = new Book[n];
      
//////////////////////////////////////////////////////////////////////////////////////      
      //get user input for each book
      
      for(int i = 0; i < n; ++i)
      {
         //get title information
         do
         {
            try
            {
               System.out.println("Please enter the title:");
               title = keyboard.nextLine();
               title = title.trim();
               if(!(title.length() >= 0))
                  {
                  throw new TitleException("Invalid title must be at least one printable character, try again.");
                  }//end if
               validTitle = true;   
            }//end try
         
            catch(TitleException te)
            {
               System.out.println(te.getMessage());
            }//end catch
         }while(!validTitle);
      
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////      
         //get author information
         do
         {
            try
            {
               System.out.println("Please enter the author:");
               author = keyboard.nextLine();
               author = author.trim();
               if(!(author.length() >= 0))
                  {
                  throw new AuthorException("Invalid author must be at least one printable character, try again.");
                  }//end if
               validAuthor = true;   
            }//end try
            
            catch(AuthorException ae)
            {
               System.out.println(ae.getMessage());
            }//end catch
         }while(!validAuthor);
 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////     
         //get page information
         do
         {
            try
            {
               System.out.println("Please enter the number of pages:");
               pages = keyboard.nextInt();
               if(!(pages > 0))
                  {
                     throw new PagesException("Invalid pages must be at least one, try again.");
                  }//end if
               validPages = true;   
            }//end try
            catch(InputMismatchException ime)
            {
               System.out.println("Invalid input type.");
               System.out.println(ime.getMessage());
            }//end catch
            catch(PagesException pe)
            {
               System.out.println(pe.getMessage());
            }//end catch
         }while(!validPages);
         keyboard.nextLine();
         // get valid category
         do
         {
            try
            {
               System.out.println("Valid Book Categories: ");
               System.out.println("Biography, Children's, Cooking, Fantasy, Fiction, Technical");
               System.out.println("Please enter the category your book falls under: ");
               category = keyboard.nextLine();
               category = category.trim();
               if(!(category.length() >= 0))
                  {
                  throw new CategoryException("Invalid category must be at least one printable character, try again.");
                  }//end if
               validCategory = true;   
            }//end try
            catch(CategoryException ce)
            {
               System.out.println(ce.getMessage());
            }//end catch
         }while(!validCategory);
 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////     
         //get read information
         do
         {
            try
            {
               System.out.println("Please enter if you read the book, true or false:");
               read = keyboard.nextBoolean();
               validRead = true;
            }//end try
            catch(InputMismatchException ime)
            {
               System.out.println("Invalid input type.");
               System.out.println(ime.getMessage());
               keyboard.nextLine();//flush line
            }//end catch
         }while(!validRead);  
////////////////////////////////////////////////////////////////////////////////////////////////////////////////     

         //cost
         do
         {
            try
            {
               System.out.println("Please enter the cost of the book in your library:");
               cost = keyboard.nextDouble();
               if(!(cost >= 0))
                  {
                     throw new CostException("Invalid cost, must be >= 0, try again.");
                  }//end if
               validCost = true;
            }//end try
            catch(InputMismatchException ime)
            {
               System.out.println("Invalid input type.");
               System.out.println(ime.getMessage());
               keyboard.nextLine();//flush line
            }//end catch
            catch(CostException ce)
            {
               System.out.println(ce.getMessage());
            }//end catch
         
         }while(!validCost);
      keyboard.nextLine();//flush line

         //create the book and save in the array
         arrayOfBooks[i] = new Book(title, author, pages, category, read, cost);
         System.out.println("Book added to array:");
         System.out.println(arrayOfBooks[i].toString());
         keyboard.nextLine();//flush line
      }//end for loop
         
      for(int i = 0; i < arrayOfBooks.length; ++i)
      {
         System.out.println(arrayOfBooks[i].toString());
      }//end for loop
   
   }//end main


}//end class