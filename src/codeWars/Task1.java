package src.codeWars;

/**
 * Выполните функцию, которая принимает строковый параметр и меняет местами каждое слово в строке.
 * Все пробелы в строке должны быть сохранены.
 * Примеры:
 *
 * "This is an example!" ==> "sihT si na !elpmaxe"
 * "double  spaces"      ==> "elbuod  secaps"
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println(reverseWords("This is an example!"));
    }
    public static String reverseWords(final String original) {
        int count = 0;
        for (int i = 0; i < original.length(); i++) {
            if (String.valueOf(original.charAt(i)).equals(" "))
                count++;
        }
        if (count == original.length()) // Если в строке всё состоит из пробелов, то вернуть строку без изменений
            return original;
        String[] strings = original.split(" ");
        String resultString = "";
        for (int i = 0; i < strings.length; i++) {
            StringBuilder str = new StringBuilder(strings[i]);
            resultString += str.reverse() + " ";
        }
        return resultString.trim();
    }
}
