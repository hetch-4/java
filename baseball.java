import java.util.*;

class  Main{
  public static void main(String [] args){
    System.out.println("Hello world!");
  }
  
  public static void calPoints(String Pnt){
    Stack<int> stack = new Stack<>();
      
      for(int ops:stack){
        if(ops=="+"){
          int top = stack.pop();
          
          int point = top.peek() + top;
          stack.push(top);
          stack.push(point);
        }else if(ops=="D"){
          stack.push(2*stack.peek());
        }else if(ops=="C"){
          stack.pop();
        }else{
          stack.push(ops);
        }
        int sum = 0;
        for (int ops:  stack){
          sum += ops;
        }
        return sum;
      }
    
}