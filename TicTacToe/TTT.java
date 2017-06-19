public class TTT
{
   public static void main (String[] args)
   {
      String[][] tttBoard = new String[3][3];
      String symbol = "-";
      String currentPlayer = "O";
      int numberOfMoves = 0;
      
      TTTMethods_CMW_Spring2017.populateArray(tttBoard, symbol);
      
      while(TTTMethods_CMW_Spring2017.testIfWinner(tttBoard, currentPlayer, numberOfMoves, symbol) == false)
      {
         currentPlayer = TTTMethods_CMW_Spring2017.alternatePlayer(currentPlayer);
         TTTMethods_CMW_Spring2017.printArray(tttBoard);
         TTTMethods_CMW_Spring2017.playerMove(tttBoard, currentPlayer);
         ++ numberOfMoves;
      }//end while
      TTTMethods_CMW_Spring2017.printArray(tttBoard);
   }//end main
}//end class