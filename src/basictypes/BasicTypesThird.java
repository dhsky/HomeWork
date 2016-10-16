/* Задание 3
1. Используя данные задания 2 создать программу, которая
рассчитывает:
● объем цилиндра, объем полого цилиндра, площадь боковой поверхности цилиндра (не полого)
● объем шара, площадь поверхности шара
● объем, площадь поверхности прямоугольного параллелепипеда
● объем, площадь поверхности тетраэдра */
package basictypes;
public class BasicTypesThird {
    public static void main(String[] args) {
        int R = 20;
        int r = 10;
        int H = 30;
        
        double VCyl = 3.14 * R*R * H;
        double VCyl2 = 3.14 * H * (R*R - r*r);
        double SCyl = 2 * 3.14 * R * H;
        
        System.out.println("Объем цилиндра составляет: " + VCyl);
        System.out.println("Объем полого цилиндра составляет: " + VCyl2);
        System.out.println("Площадь боковой поверхности цилиндра (не полого): " + SCyl);
        
        double VBall = 4 * 3.14 * R * R * R / 3;
        double SBall = 4 * 3.14 * R * R;
        
        System.out.println("Объем шара составляет: " + VBall);
        System.out.println("Площадь поверхности шара составляет: " + SBall);
        
        int a = 10;
        int b = 20;
        int c = 30;
        
        int VPar = a * b * c;
        int SPar = 2 * (a * b + b * c + a * c);
        
        System.out.println("Объем прямоугольного параллелепипеда: " + VPar);
        System.out.println("Площадь поверхности параллелепипеда: " + SPar);
        
        int d = 40;
        int h1 = 50;
        int apof = 30;
        
        int VTet = d * d * h1/3;
        int STet = 4 * d * apof / 2;
        
        System.out.println("объем тетраэдра составляет: " + VTet);
        System.out.println("площадь поверхности тетраэдра составляет: " + STet);
        
    }
}
