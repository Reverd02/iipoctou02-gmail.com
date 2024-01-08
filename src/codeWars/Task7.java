package src.codeWars;

/*
 * Вы пишете код для управления светофорами в вашем городе. Вам нужна функция,
 * которая будет обрабатывать каждый переход с зеленого на желтый, на красный и снова на зеленый.
 * Напишите функцию, которая принимает в качестве аргумента строку, представляющую текущее состояние светофора,
 * и возвращает строку, представляющую состояние, в которое должен перейти светофор.
 * Например, когда на входе green, на выходе должен быть yellow.
 */

public class Task7 {
    public static void main(String[] args) {
        System.out.println(updateLight("red"));
    }
    public static String updateLight(String current) {
        String color = current.toLowerCase();
        if (color.equals("red"))
            return "green";
        else if (color.equals("green"))
            return "yellow";
        else
            return "red";
    }
}
