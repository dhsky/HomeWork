/* Задание 1
1. Создать программу, которая выводит в консоль текст “Здравствуй
мир”.
2. Создать в программе текстовую переменную (String) с
произвольным текстом  размещенную на нескольких строках кода.
Вывести текст в консоль.
3. Создать программу, которая выводит в консоль следуюшие данные:
● ФИО
● номер группы
●время занятий
в виде:
ФИО: [ваши данные]
номер группы: [ваши данные]
время занятий: [ваши данные]
При выполнении задания использовать числовые типы данных,
строки, оперировать выходными данными на уровне сложения строк,
сложения строк и числовых данных. */

package basictypes;
public class BasicTypesFirst {
    public static void main(String[] args) {
        System.out.println("Здравствуй мир");
        String s = "Я умею "
                + "прописывать текст "
                + "в разных строках "
                + "кода";
        System.out.println(s);
        String name = "ФИО: ";
        String number = "номер группы: ";
        String time = "время занятий: ";
        String name2 = "Мотырев П.С.";
        String number2 = "AD 136";
        int time2 = 9;
        int time3 = 18;
        int time4 = 0;
        System.out.println(name + name2);
        System.out.println(number + number2);
        System.out.println(time + time2 + ":" + time4 + time4 + " - " + time3 + ":" + time4 + time4);
        
        
    }
}
