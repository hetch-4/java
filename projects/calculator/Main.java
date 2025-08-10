import java.util.*;

class Main{
    public static void main(String [] args){
        System.out.println("Simple command line calculator");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Operation below");

        Adittion ad = new Adittion();
        Subtraction sub = new Subtraction();
        Multiplication mult = new Multiplication();
        Division div = new Division();
    
        //Addition
        System.out.println("Addition");
        int sum1 = ad.add(2,3,4);
        int sum2 = ad.add(2,3);
        System.out.println("2+3+4 ="+sum1);
        System.out.println("2+3 ="+sum2);
        double sum3 = ad.add(2.4,4.3);
        System.out.println("2.4+4.3 ="+sum3);

        //subtraction
        System.out.println("Subtraction");
        int sub1 = sub.subtract(3,2);
        int sub2 = sub.subtract(9,2,1);
        double sub3 = sub.subtract(9.0,5.0);
        System.out.println("3-2 ="+sub1);
        System.out.println("9-2-1 ="+sub2);
        System.out.println("9.0-5.0 ="+sub3);

        //Multiplication
        System.out.println("Multiplication");
        int mult1 = mult.multiply(2,3);
        int mult2 = mult.multiply(2,3,4);
        double mult3 = mult.multiply(4.3,2.3);
        System.out.println("2*3 ="+mult1);
        System.out.println("2*3*4 ="+mult2);
        System.out.println("4.3+2.3 ="+mult3);


        //Division
        System.out.println("Division");
        int div1 = div.divide(4,3);
        double div2 = div.divide(6.0,2.0);
        System.out.println("4/3 ="+div1);
        System.out.println("6.0 + 2.0 ="+div2);

        //Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Operation below");
        System.out.println("first number");
        String op1 = scanner.nextLine();

        int numInput1 = 0;
        Double doubleInput1 = 0.0;
        try
        {
          numInput1 = toInt(op1);
          doubleInput1 = toDouble(op1);
        }
        catch(Exception e)
        {
          System.out.println(e);
        }
    
        System.out.println("sign (+,-,/,*)");
        String operatorString = scanner.nextLine();

        System.out.println("second number");
        String op2 = scanner.nextLine();

        int numInput2 = 0;
        Double doubleInput2 = 0.0;
        try
        {
          numInput2 = toInt(op2);
          doubleInput2 = toDouble(op2);
        }
        catch(Exception e)
        {
          System.out.println(e);
        }

        double result=0.0;
        switch(operatorString)
          {
            case "+":
              result = op1+op2;
              break;
            case "-":
              result = op1-op2;
              break;
            case "*":
              result = op1*op2;
              break;
            case "/":
              if(op2!=0)
                {
                  result = op1/op2;
                }
              else
                {
                  System.out.println("Invalid operation!");
                  return;
                }
              break;
            default:
              System.out.println("Invalid input");
              break;
          }
        System.out.println(op1+" "+sign+" "+op2+"="+result);

    }

    static boolean isInt(int inputInt)
      {
        //function to check if input is int
        return input.matches("-?\\d+");
      }

    static boolean isDouble(String input)
      {
        //function to check if input is double
        return input.matches("-?\\d+(\\.\\d+)?");
      }
    static int toInt(String inputString)
      {
        //function to  convert input string to intrger
        int num = 0;
        try
          {
            num = Integer.parseInt(inputString);
          }
        catch(Exception e)
          {
            System.out.println(e);
          }
        return num;
      }

    static Double toDouble(String inputString)
        {
          //function to convert input string to doubl
          Double num = 0.0;
          try
            {
              num = Double.parseDouble(inputString);
            }
          catch(Exception e)
            {
              System.out.println(e);
            };
          return num;
        }
}

class Operation{
    
    Scanner scanner = new Scanner(System.in);

    public void disp(){
        System.out.println("Operation class");
    }
}
class Adittion{
    public int add(int x,int y){
        return x+y;
    }
    public int add(int x,int y,int z){
        return x+y+z;
    }
    public double add(double x,double y){
        return x+y;
    }
    public double add(double x,double y,double z){
        return x+y+z;
    }

}
class Subtraction{
    public int subtract(int x,int y){
        return x-y;
    }
    public int subtract(int x,int y,int z){
        return x-y-z;
    }
    public double subtract(double x,double y){
        return x-y;
    }
    public double subtract(double x,double y,double z){
        return x-y-z;
    }

}
class Multiplication{
    public int multiply(int x,int y){
        return x*y;
    }
    public int multiply(int x,int y,int z){
        return x*y*z;
    }
    public double multiply(double x,double y){
        return x*y;
    }
    public double multiply(double x,double y,double z){
        return x*y*z;
    }

}
class Division{
    public int divide(int x,int y){
        return x/y;
    }
    public double divide(double x,double y){
        return x/y;
    }
}
