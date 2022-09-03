package ss19_string.demo;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {

        //===============Viết hoa chữ cái đầu tiên ===============

        StringBuilder builder = new StringBuilder();
        System.out.println("Nhap vao chuoi: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            if (i == 0) {
                if (c > 97) {
                    c = (char)(c - 32);
                }
            } else {
                if (c != ' ') {
                    if (c < 97) {
                        c = (char)(c + 32);
                    }
                }
            }
            builder.append(c);
        }

        String result = builder.toString();
        System.out.println(result);
    }
}
