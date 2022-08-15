package ss11_stack_queue.exercise.reverse_element_array_integer_use_stack;

import java.util.Stack;

public class StringReverse {
    public static void main(String[] args) {
        String str = "codegym";
        System.out.println("String before reverse: " + str);
        System.out.println("String before reverse: " + reverse(str));
    }

    public static String reverse(String str){
    Stack<Character> stringStack = new Stack<>();
        for(int i=0; i<str.length();i++){
            stringStack.push(str.charAt(i));
        }
        String stringReverse ="";
        char reverse;
        while (!stringStack.empty()){
            reverse = stringStack.pop();
            stringReverse+=reverse;
        }
        return stringReverse;
    }

}
