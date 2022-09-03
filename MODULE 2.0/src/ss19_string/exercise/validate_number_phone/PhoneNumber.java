package ss19_string.exercise.validate_number_phone;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static void main(String[] args) {

//        Số điện thoại hợp lệ cần đạt theo mẫu sau: (xx)-(0xxxxxxxxx)
//        x là ký tự số
//        Không chứa các ký tự đặc biệt

        String regex = "\\(\\d{2}\\)-\\(0[\\d]{9}\\)";
        Pattern pattern = Pattern.compile(regex);
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter phone number:");
            String sdt = scanner.nextLine();
            if (sdt.trim().equals("")) {
                break;
            }
            System.out.println("Number entered is phone number: " + pattern.matcher(sdt).matches());
        } while (true);
    }
}
