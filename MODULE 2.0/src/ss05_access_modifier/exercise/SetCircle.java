package ss05_access_modifier.exercise;

import java.util.Scanner;

public class SetCircle {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        Circle circle = new Circle(5.0);

        System.out.println("Radius of circle: " + circle.getRadius());
        System.out.println("Area of circle: " + circle.getArea());

    }
}
