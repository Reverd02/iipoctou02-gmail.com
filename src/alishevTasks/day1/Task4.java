package src.alishevTasks.day1;

/**
 * Используя цикл while, вывести в столбик строки вида "Олимпиада year года",
 * где year - это число, которое принимает значения, начиная с 1980 до 2020,
 * с шагом увеличения равным 4
 */
public class Task4 {
    public static void main(String[] args) {
        int year = 1980;
        while (year <= 2020) {
            System.out.println("Олимпиада " + year + " года");
            year += 4;
        }
    }
}
