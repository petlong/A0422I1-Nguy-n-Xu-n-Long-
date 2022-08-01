package ss6_inheritance.exercise.circle_cylinder;

public class Cylinder extends Circle {
    private double height;

    Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * super.getRadius() * super.getRadius() * getHeight();
    }

    public String toString(){
        return "Cylinder has:"
                + "\nHeight: " + getHeight()
                + "\n" + super.toString()
                + "\nVolume: " + getVolume();
    }
}
