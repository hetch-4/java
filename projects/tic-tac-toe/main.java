import java.util.Scanner;

public class Main{
    //initialize the playing board
    static char [][] board = new char[3][3];
    static char currentPlayer = 'X';

    public static void main(String [] args){
        System.out.println("Tic-Tac-Toe!");
       //initialize the board before the game start
        initializeBoard();
        Scanner scanner = new Scanner(System.in);

        while(true){
          //display the board on the terminal
          printBoard();
          System.out.println("Player "+currentPlayer+" enter row and column (0-2):");
          int row =  scanner.nextInt();
          int col =  scanner.nextInt();
          if(!isValidMove(row, col)){
              System.out.println("Invalid move. Try Again.");
              continue;
          };

          board[row][col] = currentPlayer;

          if(isWinner()){
            printBoard();
            System.out.println("Player "+currentPlayer+" wins!");
            break;
          } else if(isDraw()){
            printBoard();
            System.out.println("The game is a draw!");
            break;
          };
          
          switchPlayer();
        };

        scanner.close();
    };

    //function to initalize playing board
    static void initializeBoard(){
        for(int i = 0; i<3; i++){
            for(int j=0; j<3; j++){
                board[i][j]='-';
            };
        };
    };

    //function to print board
    static void printBoard(){
        for(int i=0; i<3; i++){
          for(int j=0; j<3; j++){
            System.out.print(board[i][j] +" | ");
          };
          System.out.println();
        };
    };

    //logic to check if inputed move is valid
    static boolean isValidMove(int row, int col){
        return row >=0 && row < 3 &&
               col >=0 && col < 3 &&
               board[row][col] == '-';
    };

    //function to determine the winner
    static boolean isWinner(){
      //check rows and columns
      for(int i=0; i<3; i++){
        //check rows
        if(board[i][0] == currentPlayer &&
            board[i][1] == currentPlayer &&
            board[i][2] == currentPlayer){
              return true;
        };

        //check columns
        if(board[0][i] == currentPlayer &&
            board[1][i] == currentPlayer &&
            board[2][i] == currentPlayer){
              return true;
        };

      };

      //check diagonals
      if(board[0][0] == currentPlayer &&
          board[1][1] == currentPlayer &&
          board[2][2] == currentPlayer){
            return true;
      };
      if(board[0][0] == currentPlayer &&
          board[1][1] == currentPlayer &&
          board[2][2] == currentPlayer){
            return true;
      };

      return false;
    };

    //function to check if the game is a draw
    static boolean isDraw(){
      for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
          if(board[i][j]=='-'){
            return false;
          };
          //return true;
        };
      };
      return true;
    };

    //function to switch player after each move;
    static void switchPlayer(){
      currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    };
}
