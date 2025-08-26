import java.util.*;
 class baseball {
    public static int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();

        for (String op : ops) {
            if (op.equals("+")) {
                int top = stack.pop();
                int newScore = top + stack.peek();
                stack.push(top);      // put the top back
                stack.push(newScore); // push the new score
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } else if (op.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int score : stack) {
            sum += score;
        }
        return sum;
    }

    public static void main(String[] args) {
        String[] ops = {"5", "2", "C", "D", "+"};
        System.out.println(calPoints(ops)); // Output: 30
        String[] op = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        System.out.println(calPoints(op));
        
    }
}