package ss6_inheritance.exercise.circle_cylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(2,"red");
        System.out.println("Circle has: ");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(3,"yellow",5);
        System.out.println(cylinder);
    }
}
