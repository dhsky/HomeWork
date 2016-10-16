/*Задание 1
1.Создать программу, которая выводит в консоль текст “Здравствуй мир”.
2.Создать в программе текстовую переменную (String) с произвольным текстом
размещенную на нескольких строках кода. Вывести текст в консоль. */

package basictypes;
public class SimpleDataTypesFirst {
    public static void main(String[] args) {
        System.out.println("Здравствуй Мир");
        String s = "Я размещаю "
            + "текст "
            + "на разных "
            + "строках!";
        System.out.println(s);
    }
}
