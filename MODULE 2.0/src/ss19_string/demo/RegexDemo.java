package ss19_string.demo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        String regex = "0[3789][\\d]{8}";
        Pattern pattern = Pattern.compile(regex);
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap vao sdt:");
            String sdt = scanner.nextLine();
            if (sdt.trim().equals("")) {
                break;
            }
//            System.out.println("So vua nhap la sdt: " + sdt.matches(regex));
            System.out.println("So vua nhap la sdt: " + pattern.matcher(sdt).matches());
        } while (true);
    }
}
