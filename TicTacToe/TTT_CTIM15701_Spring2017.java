import java.util.Scanner;
public class TTT_CTIM15701_Spring2017
{
   public static void main(String[] args)
   {
      //TTTMethods_CMW_Spring2015
      String currentPlayer = "O";
      String[][] gameBoard = new String[3][3];
      int numberOfMoves = 0;
      String placeHolderString = "-";
      
      TTTMethods_CMW_Spring2017.populateArray(gameBoard, placeHolderString);
     // TTTMethods_CMW_Spring2015.printArray(gameBoard);

      while(TTTMethods_CMW_Spring2017.testIfWinner(gameBoard, currentPlayer, numberOfMoves, placeHolderString) == false)
      {
         currentPlayer = TTTMethods_CMW_Spring2017.alternatePlayer(currentPlayer);
         TTTMethods_CMW_Spring2017.printArray(gameBoard);
         TTTMethods_CMW_Spring2017.playerMove(gameBoard, currentPlayer);
         ++numberOfMoves;
      }//end while
   }//end main
}//end class