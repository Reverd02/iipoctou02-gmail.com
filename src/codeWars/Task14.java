package src.codeWars;

/* Программы распознавания символов широко используются для оцифровки печатных текстов. Таким образом, тексты можно редактировать, искать и хранить на компьютере.
 * При оцифровке документов (особенно старых, написанных на пишущей машинке) программы распознавания символов часто допускают ошибки.
 * Ваша задача - исправить ошибки в оцифрованном тексте. Вам предстоит справиться только со следующими ошибками:
 * S is misinterpreted as 5
 * O is misinterpreted as 0
 * I is misinterpreted as 1
 * Тестовые примеры содержат числа только по ошибке.
 */
public class Task14 {
    public static void main(String[] args) {
        System.out.println(correct("1F-RUDYARD K1PL1NG"));
    }
    public static String correct(String string) {
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            String str = String.valueOf(string.charAt(i));
            if (str.equals("1"))
                result += "I";
            else if (str.equals("0"))
                result += "O";
            else if (str.equals("5"))
                result += "S";
            else
                result += str;
        }
        return result;
    }
}
