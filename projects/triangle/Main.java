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
    public void findC(int a, int b){
      return 360 -(a+b);
    }

    System.out.println(findC(a,b));

  };

};
