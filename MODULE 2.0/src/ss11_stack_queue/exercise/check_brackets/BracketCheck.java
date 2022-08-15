package ss11_stack_queue.exercise.check_brackets;

import java.util.Stack;

public class BracketCheck {

    public static void main(String[] args) {
        String string = "s * (s – a) * s – b) * (s – c) ";
        System.out.println(check(string));
    }

    public static boolean check(String str){
        Stack<Character> bStack = new Stack<>();
        char sym;
        char left;
        for(int i=0; i<str.length();i++){
            sym = str.charAt(i);
            if(sym == '('){
                bStack.push(sym);
            }
            if(sym == ')'){
                if(bStack.isEmpty()){
                    return false;
                }
                left = bStack.pop();
                if(left != '('&& sym !=')') {
                    return false;
                }
            }
        }
        if(bStack.isEmpty()){
            return true;
        }else return false;
    }
}
