/* Задание 2
1. Используя числовые типы данных создать программу, которая
рассчитывает:
● длину окружности, площадь окружности, площадь кольца
● периметр треугольника, площадь треугольника
● периметр, площадь прямоугольника
 */
package hometasks.basictypes.task2;
public class App {
    public static void main(String[] args) {
        int R = 20;
        int r = 10;
        int a = 15;
        int b = 10;
        int c = 5;
        int h = 5;
        
        double lCircle = 2 * 3.14 * R;
        double sCircle = 3.14 * R * R;
        double sRingle = 3.14 * (R * R - r * r);
        
        int pTriangle = a + b + c;
        int sTriangle = a * h / 2;
        int pRectangle = 2 * a + 2 * b;
        int sRectangle = a * b;
        
        System.out.println("Длина окружности составляет: " + lCircle);
        System.out.println("Площадь окружности составляет: " + sCircle);
        System.out.println("Площадь кольца составляет: " + sRingle);
        System.out.println("Периметр треугольника составляет: " + pTriangle);
        System.out.println("Площадь треугольника составляет: " + sTriangle);
        System.out.println("Периметр прямоугольника составляет: " + pRectangle);
        System.out.println("Площадь прямоугольника составляет: " + sRectangle);
        
    }
}
