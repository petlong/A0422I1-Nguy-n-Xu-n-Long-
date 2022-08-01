package ss3_oop.exercise;

import java.util.Scanner;

public class QuadraticEquationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        double delta;

        System.out.println("Quadratic Equation: ax2+bx+c=0 (a≠0)");

        do {
            System.out.print("Enter a: ");
            a = scanner.nextDouble();
            if (a == 0)
                System.out.print("Enter again a≠0 ");
        }
        while (a == 0);

        System.out.print("Enter b: ");
        b = scanner.nextDouble();

        System.out.print("Enter c: ");
        c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        delta = quadraticEquation.getDiscriminant();

        if (delta > 0)
            System.out.print("Equation has two roots:" +
                    "\n" + "r1 = " + quadraticEquation.getRoot1(delta) +
                    "\n" + "r2 = " + quadraticEquation.getRoot2(delta));
        else if (delta == 0)
            System.out.print("Equation has double root:" +
                    "\n" + "r1 = r2 = " + quadraticEquation.getRoot1(delta));
        else
            System.out.print("The equation has no roots");
    }
}
