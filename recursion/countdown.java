//recursion by count down function
public class Main{
  static void countdown(int n){
    if(n>0){
      System.out.println(n+" ");
      //count down  by decreasing by on
      countdown(n-1);
    }

  }

  public static void main(String [] args){
    countdown(5);
  }
}
