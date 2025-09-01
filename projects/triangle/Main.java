import java.util.Scanner;

public class Main{

  public static void main(String [] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Calculate angle of c in a triangels of angles a,b,c ?");

    System.out.print("Enter the value of a: ");
    int a = scanner.nextInt();

    System.out.print("Enter the value of b: ");
    int b = scanner.nextInt();

    int c =0;
    if(a<180 && b<180){
      System.out.println(findC(a,b));
    }else{
      System.out.println("Something went wrong try again");
    }

  };


  public static int findC(int a, int b){
      return 180 - (a+b);
  };

};
