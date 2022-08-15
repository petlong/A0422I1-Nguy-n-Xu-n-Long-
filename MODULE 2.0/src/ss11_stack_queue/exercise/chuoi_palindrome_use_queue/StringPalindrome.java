package ss11_stack_queue.exercise.chuoi_palindrome_use_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String stringInput = scanner.nextLine();
        String reverseString = null;

        reverseString = reverseUseQueue(stringInput);
        check(stringInput, reverseString);

        reverseString = reverseUseStack(stringInput);
        check(stringInput, reverseString);

    }

    public static String reverseUseQueue(String str) {
        Queue stringQueue = new LinkedList<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            stringQueue.add(str.charAt(i));
        }
        String reverseString = "";
        while (!stringQueue.isEmpty()) {
            reverseString += stringQueue.remove();
        }
        return reverseString;
    }

    public static String reverseUseStack(String str) {
        Stack stringStack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            stringStack.push(str.charAt(i));
        }
        String reverseString = "";
        while (!stringStack.isEmpty()) {
            reverseString += stringStack.pop();
        }
        return reverseString;
    }

    public static void check(String strIn, String strOut) {
        if (strIn.equals(strOut)) {
            System.out.println("This is a Palindrome ");
        } else {
            System.out.println("This is not a Palindrome ");
        }
    }
}
