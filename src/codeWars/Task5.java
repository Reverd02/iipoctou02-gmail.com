package src.codeWars;

/*
 * Допишите решение так, чтобы оно возвращало true, если первый переданный аргумент (строка) заканчивается на 2-й аргумент (тоже строка).
 * solution("abc", "bc") // returns true
 * solution("abc", "d") // returns false
 */
public class Task5 {
    public static void main(String[] args) {
        System.out.println(solution("ails", "fails"));
    }
    public static boolean solution(String str, String ending) {
        if (str.length() < ending.length())
            return false;
        else if (str.substring(str.length() - ending.length()).equals(ending))
            return true;
        return false;
    }
}
