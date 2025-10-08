public class Main{
  public static int sum(int k){
    // return k+((k-1) + sum(k)
    // returns the total sum of the numbers less than k
    // decreacing by 1
    if(k>0){
      return k + sum(k-1);
    }else{
      return 0;
    }
  }

  public static void main(String [] args){
    int result = sum(10);
    System.out.println(result);
  }
}
