package ss7_abstractclass_interface.demo;

public class Vet extends Bird implements Flyable {
    @Override
    public void speak() {
        System.out.println("Vet");
    }

    @Override
    public void fly() {
        System.out.println("can fly");
    }
}
