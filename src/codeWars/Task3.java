package src.codeWars;

/*
 * Вам даны длина и ширина четырёхстороннего многоугольника. Многоугольник может быть либо прямоугольником, либо квадратом.
 * Если это квадрат, верните его площадь. Если это прямоугольник, верните его периметр.
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println(areaOrPerimeter(3, 3));
    }
    public static int areaOrPerimeter (int l, int w) {
        if (l == w)
            return l * w;
        return l + l + w + w;
    }
}
