package ss6_Inheritance.Exercise.Circle_Cylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(2,"red");
        System.out.println("Circle has: ");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(3,"yellow",5);
        System.out.println(cylinder);
    }
}
