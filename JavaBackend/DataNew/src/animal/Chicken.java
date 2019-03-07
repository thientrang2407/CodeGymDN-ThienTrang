package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {

    public Chicken() {
    }

    @Override
    public String makeSound() {
        return "Chicken makes sound: Cluck- cluck";
    }

    @Override
    public String toString() {
        return "Chicken: cluck - cluck! ";
    }

    @Override
    public String howToEat() {
        return "could be fried! ";
    }
}
