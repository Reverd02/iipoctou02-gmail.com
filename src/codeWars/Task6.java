package src.codeWars;

/*
 * Если задан непустой массив целых чисел, верните результат умножения их значений по порядку.
 * Пример:
 * [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
 */
public class Task6 {
    public static void main(String[] args) {
        System.out.println(grow(new int[] {4,1,1,1,4}));
    }
    public static int grow(int[] x){
        int result = x[0];
        for (int i = 1; i < x.length; i++) {
            result *= x[i];
        }
        return result;
    }
}
