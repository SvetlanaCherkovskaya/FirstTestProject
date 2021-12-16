/**
 * Java 1. Homework #2
 * <p>
 * author Svetlana Cherkovskaya
 * version 12.12.2021 - 13.12.2021
 */

class HomeWork2 {


    public static void main(String[] args) {
        System.out.println(isWithin10and20(5, 3));
        compareNumber(-5);
        System.out.println(isNumberNegative(5));
        printText("Hello", 5);
        System.out.println(isLeapYear(16));
        System.out.println(isLeapYear(100));
        System.out.println(isLeapYear(400));
        System.out.println(isLeapYear(2100));
    }

    private static boolean isWithin10and20(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }

    private static void compareNumber(int n) {
        System.out.println(n >= 0 ? "positive" : "negative");
    }

    private static boolean isNumberNegative(int m) {
        return (m <= 0);
    }

    private static void printText(String text, int k) {
        for (int i = 1; i <= k; i++) {
            System.out.println(text);
        }
    }

    private static boolean isLeapYear(int y) {
        if (y % 400 == 0) {
            return true;
        } else if (y % 100 == 0) {
            return false;
        } else if (y % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
