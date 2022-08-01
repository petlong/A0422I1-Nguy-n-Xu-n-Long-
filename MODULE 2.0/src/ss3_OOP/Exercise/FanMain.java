package ss3_oop.exercise;

import java.util.Scanner;

public class FanMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.getFAST());
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        System.out.println("Fan 1: " + fan1.toString());

        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.getMEDIUM());
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println("Fan 2: " + fan2.toString());
    }
}
