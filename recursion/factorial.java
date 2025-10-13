import java.util.*;

public class Main {
  static int factorial(int n){
    if(n>0){
      return n * factorial(n-1);
    }else{
      return 1;
    }
  }

  public static void main(String [] args){
    System.out.println("Factorial of 5 is "+ factorial(5));
    System.out.println("Enter number n to get factorial of\nEnter n:");

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Factorial of "+n+" is "+factorial(n));
  }

}
