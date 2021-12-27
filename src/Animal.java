/**
 * Java 1. Homework #6
 * <p>
 * author Svetlana Cherkovskaya
 * version 27.12.2021
 */


abstract class Animal implements IAnimal {
    protected String name;
    protected int runDistance;
    protected int swimDistance;

    Animal(String name, int runDistance, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
    }

    @Override
    public String run(int distance) {
        if (distance <= runDistance) {
            return name + "run " + distance;
        } else {
            return name + "not run";
        }
    }

    @Override
    public String swim(int distance) {
        if (distance <= swimDistance) {
            return name + "swim " + distance;
        } else {
            return name + "not swim";
        }
    }
}
