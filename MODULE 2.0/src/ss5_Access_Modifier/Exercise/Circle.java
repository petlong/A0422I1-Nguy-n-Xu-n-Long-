package ss5_Access_Modifier.Exercise;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

      double getRadius() {
        return radius;
    }

     double getArea() {
        return radius * Math.pow(Math.PI, 2);
    }

}
