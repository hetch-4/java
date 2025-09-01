import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        // Write an answer using System.out.println()
        int c = 0;
        public void findC(int a,int b){
            if(a<180 && b<180){
            c = 360 - (a+b);
                return c;
            }
        }
        // To debug: System.err.println("Debug messages...");

        System.out.println("answer"+" = "+findC(a,b));
    }
}
