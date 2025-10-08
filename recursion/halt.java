import java.util.*;

public class Main{
  public static int sum(int start, int end){
    if(end>start){
      return end + sum(start, end -1);
    }else{
      return end; 
    }
  }

  public static void main(String [] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("sum (40,45) = ");
    int result = sum(40,45);
    System.out.println(result);

    System.out.println("in sum above ie sum(a,b)\n Enter a");
    int a = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Enter b");
    int b = scanner.nextInt();
    scanner.nextLine();

    int c = sum(a,b);
    System.out.println(c);

  }
}
