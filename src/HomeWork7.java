/**
 * Java 1. Homework #7
 * <p>
 * author Svetlana Cherkovskaya
 * version 30.12.2021
 */

public class HomeWork7 {
    public static void main(String[] args) {
        Cats cats = new Cats("Barsik", 5, false);
        Cats cats1 = new Cats("Murzik", 3, false);
        Cats cats2 = new Cats("Feliks", 4, false);
        Cats cats3 = new Cats("Tom", 90, false);

        Plate plate = new Plate(100);

        Cats[] arrayCats = new Cats[4];
        arrayCats[0] = cats;
        arrayCats[1] = cats1;
        arrayCats[2] = cats2;
        arrayCats[3] = cats3;

        for (int i = 0; i < arrayCats.length; i++){
            System.out.println(arrayCats[i]);
        }

        System.out.println(plate);

        for (int i = 0; i < arrayCats.length; i++){
            arrayCats[i].eat(plate);
            System.out.println(arrayCats[i].name + ": " + arrayCats[i].satiety);
        }

        System.out.println(plate);

        plate.addFood(60);

        System.out.println(plate);

        for (int i = 0; i < arrayCats.length; i++){
            arrayCats[i].eat(plate);
            System.out.println(arrayCats[i].name + ": " + arrayCats[i].satiety);
        }

        System.out.println(plate);
    }
}
