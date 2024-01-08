package src.codeWars;

/**
 * Задав месяц в виде целого числа от 1 до 12, верните, к какому кварталу года он относится, в виде целого числа.
 * Например: месяц 2 (февраль) относится к первому кварталу; месяц 6 (июнь) - ко второму кварталу; месяц 11 (ноябрь) - к четвертому кварталу.
 */
public class Task4 {
    public static void main(String[] args) {
        System.out.println(quarterOf(3));
    }
    public static int quarterOf(int month) {
        if (month >= 1 && month <= 3)
            return 1;
        else if (month >= 4 && month <= 6)
            return 2;
        else if (month >= 7 && month <= 9)
            return 3;
        return 4;
    }
}
