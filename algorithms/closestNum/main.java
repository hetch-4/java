import java.util.*;
// Java implementation to find the number closest to n
// and divisible by m
class Main {
    static int closestNumber(int n, int m) {
        // find the quotient
        int closest = 0;
        int minDifference = Integer.MAX_VALUE;

        // Check numbers around n
        for (int i = n - Math.abs(m); i <= n + Math.abs(m); ++i) {
            if (i % m == 0) {
                int difference = Math.abs(n - i);

                if (difference < minDifference || 
                   (difference == minDifference && Math.abs(i) > Math.abs(closest))) {
                    closest = i;
                    minDifference = difference;
                }
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Find the closest number to n and divisible by m");
        System.out.println("Enter two numbers \nn:");
        int n = scanner.nextInt();
        System.out.println("m:");
        int m = scanner.nextInt();
       
        System.out.println(closestNumber(n, m));
    }
}