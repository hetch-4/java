//initialize class
class Main{
    public static void main(String [] args){
        //create variables// initialize variables
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';
        
        //print Variables
        System.out.println("Number of items: "+ items);
        System.out.println("Cost per Item: " + costPerItem + currency);
        System.out.print("Total Cost = "+ totalCost + currency+"\n");

        //Type casting
        //widening casting
        int myInt = 9;
        double myDouble = myInt;//automatically casting int to double data type

        System.out.println("\nint data type "+myInt);
        System.out.println("int above casted to double "+ myDouble  ); 
        
        //Narrow Casting
        double my2Double = 9.78d;
        int my2Int = (int) my2Double;

        System.out.println("\nNarrowing Casting");
        System.out.println("Double :"+my2Double);
        System.out.println("int :"+my2Int+" //double data type above narrow casted to int");
        
        int maxScore = 500;
        int userScore = 423;

        float percentage = (float) userScore / maxScore * 100.0f;

        System.out.println("\njava User's percentage id "+ percentage);
    }
}
