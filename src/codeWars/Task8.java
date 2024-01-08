package src.codeWars;

/*
 * Ваша цель в этом ката - реализовать функцию difference, которая вычитает один список из другого и возвращает результат.
 * Она должна удалять все значения из списка a, которые присутствуют в списке b, сохраняя их порядок.
 * Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
 * Если значение присутствует в b, то все его вхождения должны быть удалены из другого:
 * Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
 */

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int [] {1,2,2,3,1,3,2,3}, new int[] {1,3})));
    }
    public static int[] arrayDiff(int[] a, int[] b) {
        if (a.length == 0 || b.length == 0)
            return a;
        Integer[] arrayA = fillArrayInteger(a), arrayB = fillArrayInteger(b);
        int count = 0;
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayA[i] == arrayB[j])
                    arrayA[i] = null;
            }
            if (arrayA[i] != null)
                count++;
        }
        a = new int[count];
        int index = 0;
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] == null) {
                continue;
            }
            a[index] = arrayA[i];
            index++;
        }
        return a;
    }
    public static Integer[] fillArrayInteger(int[] array) {
        Integer[] integers = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            integers[i] = array[i];
        }
        return integers;
    }
}
