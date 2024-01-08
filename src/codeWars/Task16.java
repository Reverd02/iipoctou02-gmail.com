package src.codeWars;

/*
 * Добро пожаловать. В этом ката вам предлагается возвести в квадрат каждую цифру числа и соединить их.
 * Например, если мы пропустим 9119 через функцию, то получится 811181, потому что 92 равно 81, а 12 равно 1. (81-1-1-81)
 * Пример №2: При вводе числа 765 должно получиться 493625, потому что 72 равно 49, 62 равно 36, а 52 равно 25. (49-36-25)
 * Примечание: Функция принимает целое число и возвращает целое число.
 * Счастливого кодинга!
 */
public class Task16 {
    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
    }
    public static int squareDigits(int n) {
        String str = n + "";
        char[] chars = str.toCharArray();
        str = "";
        for (int i = 0; i < chars.length; i++) {
            str += (int) Math.pow(Integer.parseInt(String.valueOf(chars[i])), 2);
        }
        return Integer.parseInt(str);
    }
}
