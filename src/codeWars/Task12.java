package src.codeWars;

/*
 * Напишите функцию, которая принимает массив слов, объединяет их в предложение и возвращает это предложение.
 * Вы можете игнорировать необходимость дезинфекции слов или добавления знаков препинания, но вы должны добавить пробелы между каждым словом.
 * Пример:
 * ['hello', 'world', 'this', 'is', 'great']  =>  'hello world this is great'
 */
public class Task12 {
    public static void main(String[] args) {
        System.out.println(smash(new String[] {" "}));
    }
    public static String smash(String... words) {
        if (words.length == 0)
            return "";
        else if (String.valueOf(words[0].charAt(0)).equals(" "))
            return words[0];
        String result = "";
        for (String str : words)
            result += str + " ";
        return result.trim();
    }
}
