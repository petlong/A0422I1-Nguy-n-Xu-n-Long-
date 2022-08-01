package ss7_AbstractClass_Interface.Practice.Class_Animal_And_Interface_Edible;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for(Animal animal : animals){
            animal.makeSound();
        }
    }
}
