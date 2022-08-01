package ss6_inheritance.exercise.triangle;

import java.util.Scanner;

public class TriangleTest{
    public static void main(String[] args) {
//        Triangle triangle = new Triangle();
//        System.out.println(triangle);
//
//        triangle = new Triangle(3,6,8);
//        System.out.println(triangle);
//
//        triangle = new Triangle("blue", true, 4,5,6);
//        System.out.println(triangle);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter color of Triangle: ");
        String color = scanner.nextLine();

        System.out.println("Enter 3 side of Triangle: ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        Triangle triangle = new Triangle(color,true,side1,side2,side3);
        System.out.println(triangle);
    }
}
