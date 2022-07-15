package ss2_ArrayAndLoop.Exercise;

import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        a = scanner.nextInt();
        System.out.println("Enter b: ");
        b = scanner.nextInt();

        a = Math.abs(a); // hàm abs() để trả về giá trị tuyệt đối (phần dương) của a, b
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }

        System.out.println("Greatest common factor: " + a);
    }
}
