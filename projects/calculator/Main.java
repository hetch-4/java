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
        System.out.println(sum1);
        System.out.println(sum2);
        double sum3 = ad.add(2.4,4.3);
        System.out.println(sum3);

        //subtraction
        System.out.println("Subtraction");
        int sub1 = sub.subtract(3,2);
        int sub2 = sub.subtract(9,2,1);
        double sub3 = sub.subtract(9.0,5.0);
        System.out.println(sub1);
        System.out.println(sub2);
        System.out.println(sub3);

        //Multiplication
        System.out.println("Multiplication");
        int mult1 = mult.multiply(2,3);
        int mult2 = mult.multiply(2,3,4);
        double mult3 = mult.multiply(4.3,2.3);
        System.out.println(mult1);
        System.out.println(mult2);
        System.out.println(mult3);


        //Division
        System.out.println("Division");
        int div1 = div.divide(4,3);
        double div2 = div.divide(6.0,2.0);
        System.out.println(div1);
        System.out.println(div2);

        //Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Operation below");
        String op1 = scanner.nextLine();
        List op2 = op1.toArray();
        System.out.println(op2);

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