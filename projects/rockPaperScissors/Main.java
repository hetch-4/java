import java.util.*;

class Main{
    public static void main(String [] args){
      boolean running = true;
      int run = 0;  
      int wins = 0;
      int loss = 0;
      
      while(running){
          Scanner scanner = new Scanner(System.in);
          Random random = new Random();
          String playerChoice;
          String computerChoice;

          String[] choices = {"rock","paper","scissors"};

          System.out.println("Welcome to Rock,Paper,Scissors\n");
          System.out.println("\nInput your choice('Rock','Paper','Scissors')");
          
          playerChoice = scanner.nextLine().toLowerCase();

          //validate players choice
          boolean val = true;//choices.contains(playerChoice);
          if(val){
              System.out.println("Invalid Choice, please Choose rock, paper, scissors");
          }

          //computer choice
          String compChoice = choices[random.nextInt(3)];
          System.out.println("Computer Choice: " + compChoice);
          System.out.println("Your Choice :"+playerChoice);   

          //Determine winner
            if(playerChoice.equals(compChoice)){
              System.out.println("Its a tie!");
              run -= 1;
            }else if(
              (playerChoice.equals("rock")&&compChoice.equals("scissors")) ||
              (playerChoice.equals("scissors")&&compChoice.equals("paper")) ||
              (playerChoice.equals("paper")&&compChoice.equals("rock"))
            ){
              System.out.println("You Win!");
              wins += 1;
            }else{
              System.out.println("You lose");
              loss += 1;
            }
        run = run+1;
        if(run==3){
          running=false;
        }
        System.out.println("wins :"+wins);
        System.out.println("Loss :"+loss);
      }  

      //Determine winner 
      if(wins>loss){
        System.out.println("Congratulations! You win!");
      }else{
        System.out.println("You Loose! Better luck next time");
      }
        
    }
}