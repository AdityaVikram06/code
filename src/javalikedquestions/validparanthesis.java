package javalikedquestions;

import java.util.*;

public class validparanthesis {
    static boolean isCorrect(String input) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == ']' && top != '[') ||
                        (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string of brackets:");
        String input = sc.nextLine();

        if (isCorrect(input))
            System.out.println("Valid parenthesis");
        else
            System.out.println("Invalid parenthesis");
    }
}
