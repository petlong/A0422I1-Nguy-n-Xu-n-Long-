package ss7_abstractclass_interface.practice.class_animal_and_interface_edible.animal;

import ss7_abstractclass_interface.practice.class_animal_and_interface_edible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return"could be fried";
    }
}
