 /*Задание 4
Создать одномерный массив на n элементов, заполнить его случайными
числами. Реализовать методы, позволяющие:
● вывести все элементы массива в прямом и обратном порядке
● вывести все четные элементы массива
● вывести все нечетные элементы массива
● сумму элементов, кратных 7
● произведение элементов, кратных 3 */

package hometasks.basic.construction.task4;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите ваш массив");
        String[] s = new String[5];
        int size = 0;
        while(scanner.hasNextInt()){
            s[size] = scanner.next();
            size++;
            if(size >=5){
                break;
            }
        }
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = Integer.parseInt(s[i]);
        }
        for(int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }
    }
    
    static void userIntarface(){
        System.out.println("Введите пожалуйста массив чисел через пробел. ");
        System.out.println("В конце массива через пробел необходимо поставить любой нечисловой символ");
    }
    
    
}
