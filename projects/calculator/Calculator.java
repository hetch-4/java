import java.util.Scanner;

public class Calculator
{
  public static void main(String [] args)
    {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Input Verification");
      System.out.print("Enter double");
      String op1Input = scanner.nextLine();

      double op1double = 0;
      if(isDouble(op1Input))
          {
            op1double = toDouble(op1Input);
            System.out.println(op1double);
          };

    };

  static boolean isInt(String input)
  {
    //function to check if input is integer
    return input.matches("-?\\d+");
  }

  static boolean isDouble(String input)
  {
    //function to check if input is Double 
    return input.matches("-?\\d+(\\.\\d+)?");
  }

  static int toInt(String input)
  {
    //function to convert input from string to int
    int num = 0;
    try
    {
      num = Integer.parseInt(input);
    }
    catch(Exception e)
    {
      System.out.println(e);
    }

    return num;
  }

  static double toDouble(String input)
  {
    //convert input string to double
    double num = 0;
    if(isDouble(input))
    {
      try
      {
        num = Double.parseDouble(input);
      }
      catch(Exception e)
      {
        System.out.println(e);
      }
    }
    return num;
  }
}
