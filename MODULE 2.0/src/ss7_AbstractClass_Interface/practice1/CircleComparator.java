package ss7_abstractclass_interface.practice1;

import ss6_inheritance.practice.Circle;

import java.util.Comparator;

public class CircleComparable implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius() > o2.getRadius())  return 1;
        else if (o1.getRadius() < o2.getRadius()) return -1;
        else return 0;
    }
}
