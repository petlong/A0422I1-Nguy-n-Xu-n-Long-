package ss2_Array_Loop_Method.Exercise;

import java.util.Scanner;

public class CountCharOfString {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String string;
        char character;

        System.out.print("Enter a string: ");
        string = scanner.nextLine();
        System.out.print("Enter a character: ");
        character = scanner.next().charAt(0);
        System.out.print
                ("Times of char in string: "+ countCharInString(string, character));
    }
    public static int countCharInString(String str, char character) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (character == str.charAt(i))
                count++;
        }
        return count;
    }
}
