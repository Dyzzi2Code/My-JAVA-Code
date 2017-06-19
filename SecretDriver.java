import java.util.Scanner;

public class SecretDriver 
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      String secretMessage = "";
      int shuffleTimes, shiftByMoves;
      String shuffledSecretMessage = "";
      String substituteSecretMessage = "";
      String unshuffledSecretMessage = "";
      String unsubSecretMessage = "";
      
      System.out.println("Enter the password or passphrase that you would like encoded");
      secretMessage = keyboard.nextLine();
      System.out.println("First, we will use the shuffle cipher to shuffle the password or passphrase: ");
      System.out.println("How many times would you like to shuffle? Enter a number 3 - 9.");
      shuffleTimes = keyboard.nextInt();
      while(shuffleTimes <= 2)
      {
         System.out.println("Invalid number of times to shuffle! Please enter a number 3 - 9.");
         shuffleTimes = keyboard.nextInt();
      }//end while
      keyboard.nextLine();//flush the line
      
      /////////////////////Shuffle Cipher Test////////////////////
      ShuffleCipher secrets = new ShuffleCipher(shuffleTimes);
      System.out.println("\n\nBeginning the Shuffle Cipher Encode Test Results");
      System.out.println("\npassword or passphrase to be encoded: " + secretMessage);
      System.out.println("Shuffle Cipher shuffling " + shuffleTimes + " times.\n");
      shuffledSecretMessage = secrets.encode(secretMessage);
      System.out.println("Shuffled user password/passphrase:  " + shuffledSecretMessage);
      unshuffledSecretMessage = secrets.decode(shuffledSecretMessage);
      System.out.println("Unshuffled user password/passphrase:  " + unshuffledSecretMessage);
      System.out.println("\n");
      System.out.println("Now we will encrypt using the Substitution Algorithm");
      System.out.println("Enter the number of moves you would like to shift by any number from 3 - 9");
      shiftByMoves = keyboard.nextInt();
      SubstitutionCipher subSecrets = new SubstitutionCipher(shiftByMoves);
      keyboard.nextLine();//flush the line
      System.out.println("\npassword or passphrase to be encoded: " + secretMessage);
      System.out.println("Substitution Cipher will shift places " + shiftByMoves + " times.\n");
      substituteSecretMessage = subSecrets.encode(secretMessage);
      System.out.println("Substitution ciphered user password/passphrase:  " + substituteSecretMessage);
      System.out.println("Substitution Cipher will shift places back " + shiftByMoves * -1 + " times.\n");
      System.out.println("\n\nTime to decode the cipher now.\n");
      unsubSecretMessage = subSecrets.decode(substituteSecretMessage);
      System.out.println("Reverse Substitution cipher user password/passphrase:  " + unsubSecretMessage);

      
   }//end main
}//end class

