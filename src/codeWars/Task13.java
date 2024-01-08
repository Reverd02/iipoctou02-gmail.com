package src.codeWars;
/*
 * В заданном массиве целых чисел ваше решение должно найти наименьшее целое число.
 * Например:
 * Given [34, 15, 88, 2] your solution will return 2
 * Given [34, -345, -1, 100] your solution will return -345
 * Для целей этого ката вы можете предположить, что предоставленный массив не будет пустым.
 */

import java.util.Arrays;

public class Task13 {
    public static void main(String[] args) {
        System.out.println(findSmallestInt(new int[] {78,56,232,12,11,43}));
    }
    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);
        return args[0];
    }
}
