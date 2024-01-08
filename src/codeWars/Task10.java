package src.codeWars;

/*
 * Подсчитайте количество делителей положительного целого числа n.
 * Пример:
 * 4 --> 3 // we have 3 divisors - 1, 2 and 4
 * 5 --> 2 // we have 2 divisors - 1 and 5
 * 12 --> 6 // we have 6 divisors - 1, 2, 3, 4, 6 and 12
 * 30 --> 8 // we have 8 divisors - 1, 2, 3, 5, 6, 10, 15 and 30
 */
public class Task10 {
    public static void main(String[] args) {
        System.out.println(numberOfDivisors(30));
    }
    public static long numberOfDivisors(int n) {
        long count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        return count;
    }
}
