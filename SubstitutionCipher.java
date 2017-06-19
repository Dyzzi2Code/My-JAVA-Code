import java.util.Scanner;
/*
   Exercise 16: Create a class SubstitutionCipher that implements the interface MessageEncoder
*/
public class SubstitutionCipher implements MessageEncoder, MessageDecoder
{
    /**
      The constructor should have 1 parameter called shift
    */
    private int shift;
    
    /**
      Non-default constructor with one parameter      
    */
    public SubstitutionCipher(int numberSpaces) 
    {
        shift = numberSpaces;
    }//end non default constructor
    
    /**
      Define the method encode so that each letter is shifted by the value in shift
    */
    public String encode(String plainText)
    {
        String cipherText = "";
        for(int i = 0; i < plainText.length(); i++)
        {
            Character encodeLetter = plainText.charAt(i);
            cipherText = cipherText + shift1Character(encodeLetter);
        }//end for loop
        return cipherText;
    }//end encode method
    
    /**
      Define the method decode so that each letter is shifted by minus the value in shift
    */
    public String decode(String cipherText)
    {
        String plainText = "";
        for(int i = 0; i < cipherText.length(); i++)
        {
            Character decodeLetter = cipherText.charAt(i);
            plainText = plainText + shift1CharacterBack(decodeLetter);
        }//end for loop
        return plainText;
    }//end encode method

    /**
      Hint: You may wish to define a private method that shifts a single character 
    */
    private Character shift1Character(Character oneLetter)
    {
        return (char)(oneLetter + shift);
    }//end method
    
    /**
      Hint: You may wish to define a private method that shifts a single character 
            back to its original position 
    */
    private Character shift1CharacterBack(Character oneLetter)
    {
        return (char)(oneLetter - shift);
    }//end method
    
////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        SubstitutionCipher shift3Places = new SubstitutionCipher(3);
        System.out.println("Substituation method using caesar shift: \n");
        String plainText = "I think I am finally back on track\n";
        System.out.println("Plain text to be encoded: " + plainText);
        
        String cipher = shift3Places.encode(plainText);
        System.out.println("Cipher text after encoding: " + cipher);
        
        SubstitutionCipher shiftMinus3 = new SubstitutionCipher(-3);
        System.out.println("\n\nTime to decode the cipher now.\n");
        
        String decoded = shiftMinus3.encode(cipher);
        System.out.println("Decoded text after removing cipher: " + decoded);
      
        ////////////////////////////////////////////////////////////////////////////System.out.println("Testing the decode method.");
        ////////////////////////////////////////////////////////////////////////////decoded = shift3Places.decode(cipher);
        ////////////////////////////////////////////////////////////////////////////System.out.println("Text after decoding: " + decoded);
    }//end main
}//end class