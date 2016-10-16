/*Задание 3
1.Используя данные задания 2 создать программу, которая рассчитывает
­ объем цилиндра
­ объем полого цилиндра
­ площадь боковой поверхности цилиндра (не полого) */

package hometasks.simple.data.types.task3;
public class App {
    public static void main(String[] args) {
        int R = 20;
        int r = 10;
        int h = 30;
        double V = 3.14 * R * R * h;
        double V2 = 3.14 * h * (R * R - r * r);
        double S = 2 * 3.14 * R * h;
        System.out.println("Объем цилиндра составляет: " + V);
        System.out.println("Объем полого цилиндра составляет: " + V2);
        System.out.println("Площадь боковой поверхности цилиндра (не полого): " + S);
    }
}
