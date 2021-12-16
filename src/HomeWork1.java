public class HomeWork1 {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }


    private static void checkSumSign() {
        int a = 0;
        int b = -5;
        System.out.println("Sum is " + (a + b >= 0 ? "positive" : "negative"));
    }


    private static void printColor() {
        int value = 155;
        if (value <= 0) System.out.println("red");
        if (value > 0 && value <= 100) System.out.println("yellow");
        if (value > 100) System.out.println("green");
    }

    private static void compareNumbers() {
        int a = 10;
        int b = 100;
        System.out.println((a >= b ? "a>=b" : "a<b"));
    }
}