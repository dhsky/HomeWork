/* Задание 1.
С помощью арифметических операций, операций сравнения и конструкций
if­else и циклических операций создать приложение которое:
● в последовательности чисел от 0 до 100 выводит все значения кратные 2, 3, 5, 7
● находит сумму чисел для каждой из этих последовательностей
● вычисляет разность сумм последовательности чисел, кратных 7 и 2
● вычисляет отношение последовательности чисел, кратных 5 к последовательности чисел, кратных 3 */

package hometasks.basic.construction.task1;
public class App {
    public static void main(String[] args) {
        
        int t2 = 0;
        int t3 = 0;
        int t5 = 0;
        int t7 = 0;
        
        for(int i = 0; i < 101; i++){    
            if (i%2 == 0){
                System.out.print(i + " ");
                t2 = t2 + i;
            }
        }
        System.out.println("");
        
        for(int i = 0; i < 101; i++){
            if (i%3 == 0){
                System.out.print(i + " ");
                t3 = t3 + i;
            }
        }
        System.out.println("");
        
        for(int i = 0; i < 101; i++){
            if (i%5 == 0){
                System.out.print(i + " ");
                t5 = t5 + i;
            }
        }
        System.out.println("");
        
        for(int i = 0; i < 101; i++){
            if (i%7 == 0){
                System.out.print(i + " ");
                t7 = t7 + i;
            }
        }
        System.out.println("");
        
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t5);
        System.out.println(t7);
        
        int sub = t7 - t2;
        System.out.println(sub);
        
        double deg = t5 / t3; //Надеюсь, что данное задание понял правильно и нужно было находить отношение сумм последовательностей т.к. разное количество элементов в последовательности
        System.out.println(deg);
        
    }
}


