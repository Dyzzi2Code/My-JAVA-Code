/*
   Exercise 15: Create an interface MessageEncoder that has a single abstract method encode(plainText),
                where plainText is the message to be encoded. The message will return the encoded message.
*/
public interface MessageEncoder
{
   //single abstract method encode(plainText) where plainText is the message to be encoded.
   public String encode(String plainText);
}//end interface