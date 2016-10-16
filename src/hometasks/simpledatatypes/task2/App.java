/*Задание 2
1. Используя числовые типы данных создать программу, которая  рассчитывает
­ длину окружности
­ площадь окружности
­ площадь кольца */

package hometasks.simpledatatypes.task2;
public class App {
    public static void main(String[] args) {
        int R = 20;
        int r = 10;
        double s1 = (2 * 3.14 * R);
        double l = 3.14 * R * R;
        System.out.println("Длина окружности составляет: " + s1);
        System.out.println("Площадь окружности составляет: " + l);
        System.out.println("Площадь кольца составляет: " + 3.14 * (R * R - r * r));
    }
}
