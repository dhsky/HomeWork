 /*Задание 4
Создать одномерный массив на n элементов, заполнить его случайными
числами. Реализовать методы, позволяющие:
● вывести все элементы массива в прямом и обратном порядке
● вывести все четные элементы массива
● вывести все нечетные элементы массива
● сумму элементов, кратных 7
● произведение элементов, кратных 3 */

package hometasks.basicconstruction.task4;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            userIntarface();
            int[] array = initArrays();
            userIntarface2();
            int choise = userChoise();
            if (choise == 7){
                continue;
            }
            if (choise < 1 || choise > 7){
                break;
            }
            cases(choise, array);
            System.out.println();
        }
    }

    static void cases(int choise, int[] array){
        switch (choise){
            case 1: sort(array); break;
            case 2: sortInv(array); break;
            case 3: even(array); break;
            case 4: unEven(array); break;
            case 5: summ(array); break;
            case 6: mul(array); break;
        }
    }

    static void userIntarface(){
        System.out.println("Введите пожалуйста массив чисел через пробел.");
        System.out.println("В конце массива через пробел необходимо поставить любой нечисловой символ");
    }

    static void userIntarface2(){
        System.out.println("Выберите что необходимо сделать с даным числовым рядом:");
        System.out.println("1. Вывести все элементы ряда в прямом порядке");
        System.out.println("2. Вывести все элементы ряда в обратном порядке");
        System.out.println("3. Вывести все четные элементы ряда");
        System.out.println("4. Вывести все нечетные элементы ряда");
        System.out.println("5. Сумму всех элементов ряда кратных 7");
        System.out.println("6. Произведение всех элементов ряда кратных 3");
        System.out.println("7. Вернуться в предыдущее меню");
        System.out.println("Введите любое другое число чтобы закрыть приложение");
    }

    static int[] initArrays(){
        String[] s = new String[20];
        int size = 0;
        boolean a = true;
        while(a) {
            while (scanner.hasNextInt()) {
                s[size] = scanner.next();
                size++;
                if (size >= 20) {
                    break;
                }
            }
            scanner.next();
            if(size != 0){
                a = false;
            }else{
                System.out.println("Введено не число. Повторите пожалуйста ввод");
            }
        }
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(s[i]);
        }
        return array;
    }

    static int userChoise(){
        int choise = 0;
        boolean a = true;
        while (a) {
            String s = scanner.next();
            try {
                choise = Integer.parseInt(s);
                a = false;
            } catch (NumberFormatException ex) {
                System.out.println("Введено не число. Повторите пожалуйста ввод");
            }
        }
        return choise;
    }

    static void sort(int[] array){
        for(int i = array.length - 1; i >= 0; i--){
            for (int j = 0; j < i-1; j++){
                if(array[j] > array[j+1]){
                    int a = array[j+1];
                    array[j+1] = array[j];
                    array[j] = a;
                }
            }
        }
        init(array);
    }

    static void sortInv(int[] array){
        for(int i = 0; i < array.length; i++){
            for (int j = array.length - 2; j >= 0; j--){
                if(array[j] < array[j+1]){
                    int a = array[j+1];
                    array[j+1] = array[j];
                    array[j] = a;
                }
            }
        }
        init(array);
    }

    static void even(int[] array){
        System.out.println("Четные числа в указанном ряде:");
        for (int i = 0; i < array.length; i++){
            if (array[i]%2 == 0){
                System.out.print(array[i] + " ");
            }
        }
    }

    static void unEven(int[] array){
        System.out.println("Нечетные числа в указанном ряде:");
        for (int i = 0; i < array.length; i++){
            if (array[i]%2 != 0){
                System.out.print(array[i] + " ");
            }
        }
    }

    static void summ(int[] array){
        int b = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i]%7 == 0){
                b = b + array[i];
            }
        }
        if(b == 0){
            System.out.println("В данном числовом ряде нет элементов кратных 7");
        }else{
            System.out.print(b);
        }
    }

    static void mul(int[] array){
        int b = 1;
        for (int i = 0; i < array.length; i++){
            if (array[i]%3 == 0){
                b = b * array[i];
            }
        }
        if (b == 1){
            System.out.println("В данном числовом ряде нет элементов кратных 3");
        }else{
            System.out.print(b);
        }
    }

    static int[] init(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        return array;
    }
}
