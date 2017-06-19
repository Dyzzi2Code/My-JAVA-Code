public class Handshakes
{
   public static void main(String[] args)
   {
      int nodes = 5;
      int handshakes;
      
      handshakes = recursiveHandshakes(nodes);
      System.out.println(handshakes);
   }//end main
   
   public static int recursiveHandshakes(int n)
   {
      if(n == 1)//base case
         return 0;
         else
            return (n - 1) + recursiveHandshakes(n - 1);
   }//end method
}//end class