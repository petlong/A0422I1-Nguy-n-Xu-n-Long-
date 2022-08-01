package ss7_abstractclass_interface.demo;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal animal = new Animal() {
            @Override
            public void speak() {

            }
        };
        Flyable flyable = new Vet();
        if (flyable instanceof Vet) {
            ((Vet) flyable).speak();
        }
        int a = Flyable.SPEED;
        int v = flyable.SPEED;
    }
}
