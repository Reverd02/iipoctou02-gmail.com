package src.alishevTasks.day1;

/**
 * Объявить переменную k типа int. Присвоить этой переменной какую-нибудь цифру
 * от 1 до 9. Используя любой цикл, вывести в консоль таблицу умножения для этой цифры
 */
public class Task6 {
    public static void main(String[] args) {
        int k = 5;
        for (int i = 1; i < 10; i++) {
            System.out.println(i + " x " + k + " = " + (i * k));
        }
    }
}
