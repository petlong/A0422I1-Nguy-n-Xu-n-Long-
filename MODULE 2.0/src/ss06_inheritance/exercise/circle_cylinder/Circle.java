package ss06_inheritance.exercise.circle_cylinder;

public class Circle {
    private double radius;
    private String color;

    Circle(){
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return "Radius: " + getRadius()
                +"\nColor: " + getColor();
    }
}
