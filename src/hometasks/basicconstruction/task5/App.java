/* Задание 5
Создать двумерный массив m на n элементов, заполнить его случайными
числами. Реализовать методы, позволяющие:
● распечатать массив в прямом и обратном порядке
● для каждой четной строки вывести все четные элементы массива
● для каждого нечетного столбца вывести все нечетные элементы массива
● сумму всех элементов, кратных 7 в четных строках
● произведение элементов, кратных 3 в нечетных строках */

package hometasks.basicconstruction.task5;
import java.util.Scanner;
public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            int nline;
            int npos;
            System.out.println("Введите 1 чтобы завершить приложение, либо другое число чтобы продолжить");
            int check = userChoise();
            if (check == 1){
                break;
            }
            System.out.println("Введите пожалуйста количество строк в вашем масиве");
            while (true) {
                nline = userChoise();
                if (nline < 1) {
                    System.out.println("У массива не могут отсутсвовать строки. Введите пожалуйста число больше 0");
                } else {
                    break;
                }
            }
            System.out.println("Введите пожалуйста количество символов в строке");
            while (true) {
                npos = userChoise();
                if (npos < 1) {
                    System.out.println("Массив не может не иметь символов в строке. Введите пожалуйста число больше 0");
                } else {
                    break;
                }
            }
            int[][] array = initArrays(nline, npos);
            System.out.println("Был создан массив размерами " + nline + "x" + npos + " заполненный произвольными числами");

            for (int i = 0; i < nline; i++) {
                for (int j = 0; j < npos; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }

            userIntarface();
            int choise = userChoise();
            if (choise == 7) {
                break;
            }
            cases(choise, array);
        }
    }

    static void cases(int choise, int[][] array){
        switch (choise){
            case 1: direction(array); break;
            case 2: andirection(array); break;
            case 3: even(array); break;
            case 4: odd(array); break;
            case 5: summ(array); break;
            case 6: mult(array); break;
            default:
                System.out.println("Введен неверный пункт меню. Повторите пожалуйста ввод");
        }
    }

    static void userIntarface(){
        System.out.println("Выберите, что необходимо сделать с данным масивом:");
        System.out.println("1 - распечатать массив в прямом порядке");
        System.out.println("2 - распечатать массив в обратном порядке");
        System.out.println("3 - для каждой четной строки вывести все четные элементы массива");
        System.out.println("4 - для каждого нечетного столбца вывести все нечетные элементы массива");
        System.out.println("5 - сумму всех элементов, кратных 7 в четных строках");
        System.out.println("6 - произведение элементов, кратных 3 в нечетных строках");
    }

    static int[][] initArrays(int nline, int npos){
        int[][] array = new int[nline][npos];
        for (int i = 0; i < nline; i++){
            for (int j = 0; j < npos; j++){
                array[i][j] = (int)(Math.random()*100);
            }
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

    static void direction(int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void andirection(int[][] array){
        for (int i = array.length - 1; i >= 0; i--){
            for (int j = array[i].length - 1; j >= 0; j--){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void even(int[][] array){
        for (int i = 0; i < array.length; i++){
            if (i % 2 != 0){
                for (int j = 0; j < array[i].length; j++){
                    if (array[i][j]%2 == 0){
                        System.out.print(array[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }

    static void odd(int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (j%2 == 0 && array[i][j]%2 != 0){
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    static void summ (int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            if (i % 2 != 0){
                for (int j = 0; j < array[i].length; j++){
                    if (array[i][j] % 7 == 0){
                        sum = sum + array[i][j];
                    }
                }
            }
        }
        if (sum != 0){
            System.out.println(sum);
        }else{
            System.out.println("В четных строках массива не обнаружены элементы кратные 7");
        }
        System.out.println();
    }

    static void mult(int[][] array){
        int multiplication = 1;
        for (int i = 0; i < array.length; i++){
            if (i % 2 == 0){
                for (int j = 0; j < array[i].length; j++){
                    if (array[i][j] % 3 == 0){
                        multiplication = multiplication * array[i][j];
                    }
                }
            }
        }
        if (multiplication != 1){
            System.out.println(multiplication);
        }else{
            System.out.println("В нечетных строках массива не обнаружены элементы кратные 3");
        }
        System.out.println();
    }
}
