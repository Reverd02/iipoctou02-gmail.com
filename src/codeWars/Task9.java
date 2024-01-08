package src.codeWars;
/*
 * Создайте функцию, которая отвечает на вопрос "Играете ли вы на банджо?".
 * Если ваше имя начинается с буквы "R" или строчной буквы "r", то вы играете на банджо!
 * Функция принимает имя в качестве единственного аргумента и возвращает одну из следующих строк:
 * name + " plays banjo"
 * name + " does not play banjo"
 * Указанные имена всегда являются допустимыми строками.
 */
public class Task9 {
    public static void main(String[] args) {
        System.out.println(areYouPlayingBanjo("Martin"));
    }
    public static String areYouPlayingBanjo(String name) {
        if (String.valueOf(name.charAt(0)).equalsIgnoreCase("r"))
            return name + " plays banjo";
        return name + " does not play banjo";
    }
}
