package src.codeWars;

/**
 * Доработайте функцию так, чтобы она находила среднее значение из трех переданных ей оценок и возвращала буквенное значение, связанное с этой оценкой.
 * 90 <= score <= 100   'A'
 * 80 <= score < 90     'B'
 * 70 <= score < 80     'C'
 * 60 <= score < 70     'D'
 * 0 <= score < 60	    'F'
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println(getGrade(90, 97, 92));
    }
    public static char getGrade(int s1, int s2, int s3) {
        int score = (s1 + s2 + s3) / 3;
        if (score >= 90 && score <= 100)
            return 'A';
        else if (score >= 80 && score < 90)
            return 'B';
        else if (score >= 70 && score < 80)
            return 'C';
        else if (score >= 60 && score < 70)
            return 'D';
        return 'F';
    }
}
