package src.codeWars;

import java.util.Arrays;
import java.util.List;

/*
 * Вам дан массив целых чисел нечетной длины, в котором все числа одинаковы, за исключением одного единственного.
 * Заполните метод, который принимает такой массив и возвращает это единственное число.
 */
public class Task11 {
    public static void main(String[] args) {
        System.out.println(stray(new int[] {2,1,1}));
    }
    public static int stray(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0] == numbers[1] ? numbers[numbers.length-1] : numbers[0];
    }
}
