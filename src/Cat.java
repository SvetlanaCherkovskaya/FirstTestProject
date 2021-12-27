/**
 * Java 1. Homework #6
 * <p>
 * author Svetlana Cherkovskaya
 * version 27.12.2021
 */


class Cat extends Animal {
    Cat(String name, int runDistance, int swimDistance) {
        super(name, runDistance, swimDistance);
    }

    @Override
    public String swim(int distance) {
        return name + " absolutely not swim";
    }
}
