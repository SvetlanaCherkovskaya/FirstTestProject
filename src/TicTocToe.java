import java.util.Random;
import java.util.Scanner;

/**
 * Java 1. Homework #4
 * <p>
 * author Svetlana Cherkovskaya
 * version 20.12.2021 - 20.12.2021
 */


public class TicTocToe {

    final char SIGN_X = 'x';
    final char SIGN_O = 'o';
    final char SIGN_EMPTY = '.';
    char[][] table;
    Scanner sc;
    Random random;

    public static void main(String[] args) {
        new TicTocToe().game();
    }

    TicTocToe() {
        table = new char[3][3];
        sc = new Scanner(System.in);
        random = new Random();
    }

    void game() {
        initTable();
        printTable();
        while (true) {
            turnHuman();
            if (isWin(SIGN_X)) {
                System.out.println("YOU WON");
                printTable();
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW...");
                printTable();
                break;
            }

            turnAi();
            if (isWin(SIGN_O)) {
                System.out.println("Ai WON");
                printTable();
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW...");
                printTable();
                break;
            }
            printTable();
        }
    }

    void initTable() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                table[y][x] = SIGN_EMPTY;
            }
        }
    }

    void printTable() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                System.out.print(table[y][x] + " ");
            }
            System.out.println();
        }
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.println(("Enter x y [1..3]: "));
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[y][x] = SIGN_X;
    }

    void turnAi() {
        int x, y;
        do {
            System.out.println(("Enter x y [1..3]: "));
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[y][x] = SIGN_O;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table[y][x] == SIGN_EMPTY;
    }

    boolean isWin(char ch) {
        //
        for (int y = 0; y < table.length; y++) {
            int count = 0;
            for (int x = 0; x < table.length; x++) {
                if (table[y][x] == ch) {
                    count++;
                    if (count == table.length) {
                        return true;
                    }
                }
            }
        }
        //
        for (int x = 0; x < table.length; x++) {
            int count = 0;
            for (int y = 0; y < table.length; y++) {
                if (table[y][x] == ch) {
                    count++;
                    if (count == table.length) {
                        return true;
                    }
                }
            }
        }
        //
        int count1 = 0;
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                if (table[y][x] == ch && y == x) {
                    count1++;
                    if (count1 == table.length) {
                        return true;
                    }
                }
            }
        }
        //
        int count2 = 0;
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                if (table[y][x] == ch && x == table.length - 1 - y) {
                    count2++;
                    if (count2 == table.length) {
                        return true;
                    }
                }
            }
        }
        //
        return false;
    }

    boolean isTableFull() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                if (table[y][x] == SIGN_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}
