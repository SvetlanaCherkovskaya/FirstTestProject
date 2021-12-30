/**
 * Java 1. Homework #7
 * <p>
 * author Svetlana Cherkovskaya
 * version 30.12.2021
 */

public class Cats {
    String name;
    int appetite;
    boolean satiety;

    Cats(String name, int appetite, boolean satiety){
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    void eat (Plate plate){

        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            satiety = true;
        }
        else {
            satiety = false;
        }

    }

    @Override
    public String toString() {
        return "Cat: " + name + ", appetite: " + appetite + ", satiety: " + satiety;
    }
}
