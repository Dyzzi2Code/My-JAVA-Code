import java.util.Scanner;

public class Book
{
   private String title;
   private String author;
   private int pages;
   private String category;
   private boolean read;
   private double cost;
   
   //constructors
   //default constructor
   public Book()
   {
      title = "Not yet assigned";
      author = "Not yet assigned";
      pages = 0;
      category = "Not yet assigned";
      read = false;
      cost = 0;
   }//end constructor
   
   //nondefault constructor
   public Book(String titlePassed, String authorPassed, int pagesPassed, String categoryPassed,
   boolean readPassed,double costPassed)
   {
      setTitle(titlePassed);
      setAuthor(authorPassed);
      setPages(pagesPassed);
      setCategory(categoryPassed);
      setRead(readPassed);
      setCost(costPassed);
   }//end constructor
   
   //getters
   public String getTitle()
   {
      return this.title;
   }//end method
   
   public String getAuthor()
   {
      return this.author;
   }//end method
   
   public int getPages()
   {
      return this.pages;
   }//end method
   
   public String getCategory()
   {
      return this.category;
   }//end method
   
   public boolean getRead()
   {
      return this.read;
   }//end method
   
   public double getCost()
   {
      return this.cost;
   }//end method
   
   
   //setters
   public void setTitle(String titlePassed)
   {
      Scanner keyboard = new Scanner(System.in);
      titlePassed = titlePassed.trim();
      while(titlePassed.length() == 0)
      {
         System.out.println("Invalid title, must be at least one printable character:");
         System.out.println("Please enter the title:");
         titlePassed = keyboard.nextLine();
         titlePassed = titlePassed.trim();
      }//end while loop
      this.title = titlePassed;
   }//end method
   
   public void setAuthor(String authorPassed)
   {
      Scanner keyboard = new Scanner(System.in);
      authorPassed = authorPassed.trim();
      while(authorPassed.length() == 0)
      {
         System.out.println("Invalid author, must be at least one printable character:");
         System.out.println("Please enter the author:");
         authorPassed = keyboard.nextLine();
         authorPassed = authorPassed.trim();
      }//end while loop
      this.author = authorPassed;
   }//end method
   
   public void setPages(int pagesPassed)
   {
      Scanner keyboard = new Scanner(System.in);
      while(pagesPassed < 1)
      {
         System.out.println("Invalid pages, must be at least 1:");
         System.out.println("Please enter the pages:");
         pagesPassed = keyboard.nextInt();
      }//end while loop
      this.pages = pagesPassed;
      }//end method
   
   public void setCategory(String categoryPassed)
   {
      String[] genre = {"Biography", "Children's", "Cooking", "Fantasy", "Fiction", "Technical"};
      boolean validCategory = false;
      for(int i = 0; i < genre.length; ++i)
      {
         if(categoryPassed.equals(genre[i]))
         {
            validCategory = true;
            break;
         }//end if
      }//end loop
      if(validCategory == true)
         this.category = categoryPassed;
      else
         this.category = "Invalid";
   }//end method
   
   public void setRead(boolean readPassed)
   {
      this. read = readPassed;
   }//end method
      
   public void setCost(double costPassed)
   {
      Scanner keyboard = new Scanner(System.in);
      while(costPassed < 0)
      {
         System.out.println("Invalid cost, must be at least 0:");
         System.out.println("Please enter the cost:");
         costPassed = keyboard.nextDouble();
      }//end while loop
      this.cost = costPassed;
   }//end method
   
   
   public String toString()
   {
      return
      "\nTitle: " + this.title +
      "\nAuthor: " + this.author +
      "\nPages: " + this.pages +
      "\nCategory: " + this.category +
      "\nRead: " + this.read +
      "\nCost: " + this.cost;
   }//end method
   
   public boolean equals(Book bookPassed)
   {
      return
      this.title.equals(bookPassed.title)
      &&
      this.author.equals(bookPassed.author)
      &&
      this.pages == bookPassed.pages
      &&
      this.category.equals(bookPassed.category)
      && 
      this.read == bookPassed.read
      &&
      this.cost == bookPassed.cost
      ;//end boolean expression
   
   }//end method
   
   public static void main(String[] args)
   {
      Book b1 = new Book();//calls the default constructor
      Book b2 = new Book("1984", "Orwell", 500, "Fiction", true, 19.95);//calls non default constructor with values
      Book b3 = new Book("", "", -1, "Great", true, -1);//passing invalid information
      System.out.println(b1.toString());//passing default constructor to toString()
      System.out.println(b2.toString());//passing a non-default ocnstructor to toString()
   }//end method



}//end class