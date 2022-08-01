package ss6_inheritance.demo;

public class FamilyCar extends Car {
    @Override
    public void move() {
        super.move();
        System.out.println("Family Car move");
    }
}
