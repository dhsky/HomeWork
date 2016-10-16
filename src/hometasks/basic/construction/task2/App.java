/* Задание 2
Используя конструкцию switch, простейшие арифметические операции и
операции сравнения реализовать приложение, которое выводит в консоль текстовое
представление случайного целого числа в диапазоне от 0 до 99 включительно. */

package hometasks.basic.construction.task2;
public class App {
    public static void main(String[] args) {
        
        int x = 87;
        
        int x1 = x / 10;
        int x2 = x % 10;
        
        if(x1 == 1){
            switch(x){
                case 10:{
                    System.out.println("Десять");
                }break;
                case 11:{
                    System.out.println("Одиннадцать");
                }break;
                case 12:{
                    System.out.println("Двенадцать");
                }break;
                case 13:{
                    System.out.println("Тринадцать");
                }break;
                case 14:{
                    System.out.println("Четырнадцать");
                }break;
                case 15:{
                    System.out.println("Пятнцадцать");
                }break;
                case 16:{
                    System.out.println("Шестнадцать");
                }break;
                case 17:{
                    System.out.println("Семнадцать");
                }break;
                case 18:{
                    System.out.println("Восемнадцать");
                }break;
                case 19:{
                    System.out.println("Девятнадцать");
                }break;
            }
        }
        else{
            if(x1 > 1){
                switch(x1){
                    case 2:{
                        System.out.print("Двадцать ");
                    }break;
                    case 3:{
                        System.out.print("Тридцать ");
                    }break;
                    case 4:{
                        System.out.print("Сорок ");
                    }break;
                    case 5:{
                        System.out.print("Пятьдесят ");
                    }break;
                    case 6:{
                        System.out.print("Шестьдесят ");
                    }break;
                    case 7:{
                        System.out.print("Семьдесят ");
                    }break;
                    case 8:{
                        System.out.print("Восемьдесят ");
                    }break;
                    case 9:{
                        System.out.print("Девяносто ");
                    }break;
                }
            }
        }
        
        if (x1 != 1){
            switch(x2){
                case 1:{
                System.out.println("Один");
                }break;
                case 2:{
                System.out.println("Два");
                }break;
                case 3:{
                System.out.println("Три");
                }break;
                case 4:{
                System.out.println("Четыре");
                }break;
                case 5:{
                System.out.println("Пять");
                }break;
                case 6:{
                System.out.println("Шесть");
                }break;
                case 7:{
                System.out.println("Семь");
                }break;
                case 8:{
                System.out.println("Восемь");
                }break;
                case 9:{
                System.out.println("Девять");
                }break;  
            }
        }
        
        if(x == 0){
            System.out.println("Ноль");
        }
        System.out.println();
    }
}
