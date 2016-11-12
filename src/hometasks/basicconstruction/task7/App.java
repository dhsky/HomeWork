/* Реализовать приложение, которое производит операции циклического сдвига
над прямоугольным массивом (матрицей). Организовать методы, которые позволяют
произвести сдвиг:
● на n позиций влево
● на n позиций вправо
● на n позиций вверх
● на n позиций вниз */
package hometasks.basicconstruction.task7;
import java.util.Scanner;
public class App {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while(true) {
            userIntarface();
            int choise = userChoise();
            if (choise == 5){
                break;
            }
            if (choise > 0 && choise < 5){
                cases(choise);
            } else {
                System.out.println("Данного пункта в меню нет, повторите пожалуйста ввод");
            }
            System.out.println();
        }
    }

    static void shiftArrayleft(){
        int[][] arr = initArray();
        System.out.println();
        int shift = userShift();
        int[][] array = new int[5][5];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if ((j - shift) >= 0) {
                    array[i][j - shift] = arr[i][j];
                }else {
                    array[i][arr[i].length + j - shift] = arr[i][j];
                }
            }
        }

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void shiftArrayRight(){
        int[][] arr = initArray();
        System.out.println();
        int shift = userShift();
        int[][] array = new int[5][5];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if ((j + shift) < array[i].length) {
                    array[i][j + shift] = arr[i][j];
                }else {
                    array[i][shift+j - arr[i].length] = arr[i][j];
                }
            }
        }

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void shiftArrayUp(){
        int[][] arr = initArray();
        System.out.println();
        int shift = userShift();
        int[][] array = new int[5][5];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if ((i - shift) >= 0) {
                    array[i - shift][j] = arr[i][j];
                }else {
                    array[arr.length + i - shift][j] = arr[i][j];
                }
            }
        }

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void shiftArrayDown(){
        int[][] arr = initArray();
        System.out.println();
        int shift = userShift();
        int[][] array = new int[5][5];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if ((i + shift) < array.length) {
                    array[i + shift][j] = arr[i][j];
                }else {
                    array[shift + i - arr.length][j] = arr[i][j];
                }
            }
        }

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    static void cases(int choise){


        switch (choise){
            case 1: shiftArrayleft();break;
            case 2: shiftArrayRight();break;
            case 3: shiftArrayUp();break;
            case 4: shiftArrayDown();break;
        }
    }

    static int userShift(){
        int shift;
        System.out.println("Введите насколько необходимо произвести сдвиг");
        while (true){
            shift = userChoise();
            if (shift > 0){
                break;
            }else{
                System.out.println("Введите пожалуйста положительное число");
            }
        }
        return shift;
    }

    static void userIntarface(){
        System.out.println("Выберите, что необходимо сделать с массивом");
        System.out.println("1 - сдвинуть массив влево");
        System.out.println("2 - сдвинуть массив вправо");
        System.out.println("3 - сдвинуть массив вверх");
        System.out.println("4 - сдвинуть массив вниз");
        System.out.println("5 - завершить приложение");
    }

    static int[][] initArray(){
        int[][] arr = new int[5][5];
        System.out.println("Был создан массив заполненный произвольными числами:");
        System.out.println();
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = (int)(Math.random()*100);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return arr;
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
