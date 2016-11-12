/*Используя циклические конструкции и массивы создать “рваный массив”
треугольной формы, реализовать вывод данного массива в виде треугольника в
консоль. Реализовать методы, отражающие данный “треугольник”
● по горизонтали
● по вертикали
● по горизонтали и вертикали одновременно */


package hometasks.basicconstruction.task6;

import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while(true) {
            userInterface();
            int choise = userChoise();
            if (choise == 5) {
                break;
            }
            cases(choise);
        }
    }

    static void userInterface(){
        System.out.println("Выберите что необходимо вывести на экран");
        System.out.println("1 - вывести на экран треугольник;");
        System.out.println("2 - чтобы вывести треугольник отраженный по горизонтали");
        System.out.println("3 - чтобы вывести треугольник отраженный по вертикали");
        System.out.println("4 - чтобы вывести треугольник отраженный по горизонтали и вертикали");
        System.out.println("5 - чтобы завершить приложение");
    }

    static void cases(int choise){
        int[][] arr = new int[5][5];
        switch (choise){
            case 1: triangle(arr); break;
            case 2: triangle2(arr); break;
            case 3: triangle3(arr); break;
            case 4: triangle4(arr); break;
            default:
                System.out.println("Выбран неверный пункт меню, повторите пожалуйста ввод.");
        }

    }

    static void triangle(int[][] arr){
        int count = 1;
        for (int i = 0; i < arr.length ; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (j < count){
                    System.out.print(arr[i][j] + " ");
                }
            }
            count++;
            System.out.println();
        }
    }

    static void triangle2(int[][] arr){
        int count = 1;
        for (int i = 0; i < arr.length ; i++){
            int num = 0;
            for (int j = 0; j < arr[i].length; j++){
                while ( num < arr[i].length - count){
                    System.out.print("  ");
                    num++;
                }
                if (j < count){
                    System.out.print(arr[i][j] + " ");
                }
            }
            count++;
            System.out.println();
        }
    }

    static void triangle3(int[][] arr){
        int count = 5;
        for (int i = arr.length - 1; i >= 0 ; i--){
            for (int j = arr[i].length - 1; j >= 0; j--){
                if (j < count){
                    System.out.print(arr[i][j] + " ");
                }
            }
            count--;
            System.out.println();
        }
    }

    static void triangle4(int[][] arr){
        int count = 5;
        for (int i = arr.length - 1; i >= 0 ; i--){
            int num = 0;
            for (int j = arr[i].length - 1; j >= 0; j--){
                while ( num < arr[i].length - count){
                    System.out.print("  ");
                    num++;
                }
                if (j < count){
                    System.out.print(arr[i][j] + " ");
                }
            }
            count--;
            System.out.println();
        }
    }

    static int userChoise(){
        String s;
        int choise;
        while(true){
            s = sc.next();
            try{
                choise = Integer.parseInt(s);
                break;
            }catch (NumberFormatException ex){
                System.out.println("Введено не число, повторите пожалуйста ввод");
            }
        }
        return choise;
    }
}
