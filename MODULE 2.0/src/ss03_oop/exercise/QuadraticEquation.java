package ss03_oop.exercise;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1(double delta) {

        return (-this.b + Math.pow(delta, 0.5)) / (2 * this.a);
    }

    public double getRoot2(double delta) {
        return (-this.b - Math.pow(delta, 0.5)) / (2 * this.a);
    }

}
