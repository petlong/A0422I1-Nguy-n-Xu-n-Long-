package ss7_abstractclass_interface.exercise.interface_resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();

        Circle circle = (Circle) shapes[0];
        circle.resize(10);
        System.out.println(circle);
        System.out.println("Area of Circle after resize: "+ circle.getArea());

        Rectangle rectangle = (Rectangle) shapes[1];
        rectangle.resize(20);
        System.out.println(rectangle);
        System.out.println("Area of Rectangle after resize: " + rectangle.getArea());
    }
}
