package ss7_abstractclass_interface.exercise.interface_colorable;

import ss7_abstractclass_interface.exercise.interface_resizeable.Circle;
import ss7_abstractclass_interface.exercise.interface_resizeable.Rectangle;
import ss7_abstractclass_interface.exercise.interface_resizeable.Shape;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();

        for(Shape shape: shapes){
            shape.setFilled(false);
            Colorable colorable;
            if(shape instanceof Circle){
                colorable = (Circle) shape;
            }
            else{
                colorable = (Rectangle) shape;
            }
            colorable.howToColor();
            System.out.println(colorable);
        }

    }
}
