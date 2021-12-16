/**
 * Java 1. Homework #3
 * <p>
 * author Svetlana Cherkovskaya
 * version 12.12.2021 - 13.12.2021
 */

import java.util.Arrays;

public class HomeWork3 {

    public static void main(String[] args) {
        makeArray1();
        makeArray2();
        makeArray3();
        makeArray4();
        System.out.println(Arrays.toString(makeArray5(5, 8)));
        makeArray6();
        System.out.println(makeArray7(new int[]{1, 2, 3, 1, 2, 3}));


    }

    private static void makeArray1() {
        int[] nums = {1, 1, 1, 0, 0, 0};
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                nums[i] = 0;
            } else {
                nums[i] = 1;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    private static void makeArray2() {
        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        System.out.println(Arrays.toString(nums));
    }

    private static void makeArray3() {
        int[] nums = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 6) {
                nums[i] = nums[i] * 2;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    private static void makeArray4() {
        int[][] nums = new int[5][5];
        for (int i = 0; i < 5; i++) {
            int j;
            for (j = 0; j < 5; j++) {
                if (i == j) {
                    nums[i][j] = 1;
                } else if (j == nums.length - 1 - i) {
                    nums[i][j] = 1;
                }
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();

        }
    }

    private static int[] makeArray5(int len, int initialValue) {
        int[] nums = new int[len];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = initialValue;
        }
        {
            return (nums);
        }

    }

    private static void makeArray6() {
        int[] nums = {1, 2, 8, 4, 9, 6, 3};
        System.out.println(Arrays.toString(nums));
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("Max number = " + max);
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("Min number = " + min);
    }

    private static boolean makeArray7(int[] arr) {
        int sum = 0;
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        for (int j = 0; j < arr.length; j++) {
            sumLeft += arr[j];
            sumRight = sum - sumLeft;
            if (sumLeft == sumRight) {
                return true;
            }
        }
        return false;
    }
}
