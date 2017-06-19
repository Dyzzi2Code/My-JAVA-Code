import java.util.Scanner;
/*
   Exercise 17: Create a ShuffleCipher that implements the interface MessageEncoder
*/
public class ShuffleCipher implements MessageEncoder, MessageDecoder 
{
    private int n;
    
    /**
      The non-default construcctor should have only one parameter called n.
    */
    public ShuffleCipher(int shufflePlaces) 
    {
        n = shufflePlaces;
    }//end non default constructor
    
    /**
      Shuffles the text by what ever places is stored in shufflePlaces 
    */
    public String encode(String plainText)
    {
        String cipherText = plainText;
        for(int i = 0; i < n; i++)
        {
            cipherText = shuffle(cipherText);
        }//end for loop
        return cipherText;
    }//end method
    
    private String shuffle(String stringToShuffle)
    {
        String shuffledString = "";
        /**
          Find the center of the string
        */
        int centerOfString = stringToShuffle.length() / 2;
        //splits the string into the first half
        String firstHalf = stringToShuffle.substring(0, centerOfString);
        //splits the string into the second half
        String secondHalf = stringToShuffle.substring(centerOfString, stringToShuffle.length());
        /**
          For each position i in first half replace with same position i in second half
        */
        for(int i = 0; i < firstHalf.length(); i++)
        {
            shuffledString = shuffledString + firstHalf.charAt(i) + secondHalf.charAt(i);
        }//end for loop
        
        //when the length of the message is odd i seem to need to add the last character
        if(secondHalf.length() > firstHalf.length())
            shuffledString = shuffledString + secondHalf.charAt(secondHalf.length()-1); 
                   
        return shuffledString;
    }//end method
    
    /**
      Define the method decode so that each letter is shifted by minus the value in n
    */
    public String decode(String cipherText)
    {
        String plainText = cipherText;
        for(int i = 0; i < n; i++)
        {
            plainText = unshuffle(plainText);
        }
        return plainText;
    }
    
    /**
      Define the method to unshuffle
    */
    private String unshuffle(String shuffledString)
    {
        String unshuffledString = "";
        
        for(int i = 0; i < shuffledString.length(); i += 2)
        {
            unshuffledString = unshuffledString + shuffledString.charAt(i);
        }//end for loop
        for(int i = 1; i < shuffledString.length(); i += 2)
        {
            unshuffledString = unshuffledString + shuffledString.charAt(i);
        }//end for loop
        return unshuffledString;
    }//end unshuffle method
    
    
     public static void main(String[] args) 
     {
        Scanner keyboard = new Scanner(System.in);
        ShuffleCipher shuffle3Times = new ShuffleCipher(3);
        System.out.println("Shuffle Cipher shuffling n times.");
        String plainText = "I think I am finally back on track\n";
        System.out.println("Plain text: " + plainText);
        
        String cipherText = shuffle3Times.encode(plainText);
        System.out.println("Cipher text: " + cipherText);
        
        ShuffleCipher firstShuffle = new ShuffleCipher(1);
        ShuffleCipher secondShuffle = new ShuffleCipher(2);
        ShuffleCipher thirdShuffle = new ShuffleCipher(3);
        ShuffleCipher fourthShuffle = new ShuffleCipher(4);
        ShuffleCipher fifthShuffle = new ShuffleCipher(5);
        ShuffleCipher sixthShuffle = new ShuffleCipher(6);
        
        String testString1 = "dyzzidymindz";
        System.out.println("Shuffle this string: " + testString1);
        System.out.println("\n\n1st shuffle: " + firstShuffle.encode(testString1));
        System.out.println("\n\n2nd shuffle: " + secondShuffle.encode(testString1));
        
        String testString2 = "mi1k4ndc00kies";
        System.out.println("Shuffle this string: " + testString2);
        System.out.println("\n\n3rd shuffle: " + thirdShuffle.encode(testString2));
        System.out.println("\n\n4th shuffle: " + fourthShuffle.encode(testString2));
        
        String testString3 = "cats2eyes";
        System.out.println("Shuffle this string: " + testString3);
        System.out.println("\n\n5th shuffle: " + fifthShuffle.encode(testString3));
        System.out.println("\n\n6th shuffle: " + sixthShuffle.encode(testString3));
        
        String testString4 = "peanut is black";
        System.out.println("Shuffle this string: " + testString4);
        System.out.println("\n\n2nd shuffle: " + secondShuffle.encode(testString4));
        System.out.println("\n\n4th shuffle: " + fourthShuffle.encode(testString4));
        
        String testString5 = "sheaba is a loud grey cat";
        System.out.println("Shuffle this string: " + testString5);
        System.out.println("\n\n3rd shuffle: " + thirdShuffle.encode(testString5));
        System.out.println("\n\n5th shuffle: " + fifthShuffle.encode(testString5));
        
        System.out.println("Enter the password or passphrase that you would like");
        System.out.println(" to encrypt with the shuffle cypher: ");
        String stringToEncrypt = keyboard.nextLine();
        System.out.println("The string we will encrypt via shuffling is:  " + stringToEncrypt);
        System.out.println("\nHow many times would you like to shuffle:  ");
        int n = keyboard.nextInt();
        System.out.println("Shuffled user password/passphrase:  " + firstShuffle.encode(stringToEncrypt));
        String stringToDecrypt = firstShuffle.encode(stringToEncrypt);
        System.out.println("Unshuffled user password/passphrase:  " + firstShuffle.decode(stringToDecrypt));
        
              
    }//end main
}//end class




