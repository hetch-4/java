import java.util.Scanner;

public class Main
{
    //initialize the playing board
    static char [][] board = new char[3][3];
    // sign of the curren tplayer
    static char currentPlayer = 'X';
    // number of moves played
    static int movesPlayed = 0;


    public static void main(String [] args)
    {
        System.out.println("Tic-Tac-Toe!");
       //initialize the board before the game start
        initializeBoard();
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
          //clear screen before displaying the board
          clearScreen();
          //display the board on the terminal
          printBoard();
          System.out.println("Player "+currentPlayer+" enter row and column (0-2):");
          int row =  scanner.nextInt();
          int col =  scanner.nextInt();
          if(!isValidMove(row, col))
          {
              System.out.println("Invalid move. Try Again.");
              continue;
          };

          board[row][col] = currentPlayer;

          if(isWinner())
          {
            printBoard();
            System.out.println("Player "+currentPlayer+" wins!");
            break;
          }
          else if(isDraw())
          {
            printBoard();
            System.out.println("The game is a draw!");
            break;
          };
          
          switchPlayer();
        };

        scanner.close();
    };

    //function to initalize playing board
    static void initializeBoard()
    {
        for(int i = 0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                board[i][j]='-';
            };
        };
    };

    //function to print board
    static void printBoard()
    {
      System.out.println("------------");
        for(int i=0; i<3; i++)
        {
          //System.out.println("| ");
          for(int j=0; j<3; j++)
          {
            System.out.print(board[i][j] +" | ");
          };
          System.out.println();
        };
        System.out.println("------------");
    };

    //logic to check if imputed move is valid
    static boolean isValidMove(int row, int col)
    {
        return row >=0 && row < 3 &&
               col >=0 && col < 3 &&
               board[row][col] == '-';
    };

    //function to determine the winner
    static boolean isWinner()
    {
      //check rows and columns
      for(int i=0; i<3; i++)
      {
        //check rows
        if(board[i][0] == currentPlayer &&
            board[i][1] == currentPlayer &&
            board[i][2] == currentPlayer)
        {
              return true;
        };

        //check columns
        if(board[0][i] == currentPlayer &&
            board[1][i] == currentPlayer &&
            board[2][i] == currentPlayer)
        {
              return true;
        };

      };

      //check diagonals
      if(board[0][0] == currentPlayer &&
          board[1][1] == currentPlayer &&
          board[2][2] == currentPlayer)
      {
            return true;
      };
      if(board[0][2] == currentPlayer &&
          board[1][1] == currentPlayer &&
          board[2][0] == currentPlayer)
      {
            return true;
      };

      return false;
    };

    //function to check if the game is a draw
    static boolean isDraw()
    {
      for(int i=0; i<3; i++)
      {
        for(int j=0; j<3; j++)
        {
          if(board[i][j]=='-')
          {
            return false;
          };
          //return true;
        };
      };
      return true;
    };

    //function to switch player after each move;
    static void switchPlayer()
    {
      currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    };

    //function to clear screen after the a move is made
    static void clearScreen()
    {
      System.out.println("\033[H\033[2J");
      System.out.flush();
    };

    //function to check for possible draw
    //checks rows, column, and diagonals
    //if there is atleast one X or 0 in everyline
    //then there is no possible win 
    static boolean possibleDraw()
    {
      for(int i=0; i<3; i++)
      {
        //check row win still possible
        if(board[i][0] == currentPlayer ||
            board[i][1] == currentPlayer ||
            board[i][2] == currentPlayer)
        {
          return false;
        };

        //check column win still possible
        if(board[0][i] == currentPlayer ||
            board[1][i] == currentPlayer ||
            board[2][i] == currentPlayer)
        {
          return false
        };

        //check diagonals win still possible
        if(board[0][0] == currentPlayer ||
            board [1][1] == currentPlayer ||
            board [2][2] == currentPLayer)
        {
          return false 
        };
        if(board[0][2] == currentPlayer ||
            board[1][1] == currentPlayer ||
            board[2][0] == currenPlayer)
        {
          return false;
        }

      }
      return true;
    };
}
