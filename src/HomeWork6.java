/**
 * Java 1. Homework #6
 * <p>
 * author Svetlana Cherkovskaya
 * version 27.12.2021
 */


public class HomeWork6 {
    public static void main(String[] args) {
        IAnimal catBarsik = new Cat("Barsik", 200, 0);
        IAnimal dogRex = new Dog("Rex", 500, 10);
        System.out.println(catBarsik.run(210));
        System.out.println(catBarsik.swim(5));
        System.out.println(dogRex.run(210));
        System.out.println(dogRex.swim(5));
    }
}
