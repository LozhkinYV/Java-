/**
* 1. Написать метод, принимающий на вход два целых числа и проверяющий,
* что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
**/
package Seminar1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение a: ");
        if (in.hasNextInt()) {
            int a = in.nextInt();
            System.out.print("Введите значение b: ");
            if (in.hasNextInt()) {
                int b = in.nextInt();
                in.close();
                int c = a + b;
                System.out.println("Сумма значений a + b = " + c + " в интервале (10, 20): " + isSumBetween10And20(a, b));
            } 
            else {
                System.out.println("Это не число!");
            }
        } 
        else {
            System.out.println("Это не число!");
        }
        
    }

private static boolean isSumBetween10And20(int a, int b) {
    int c = a + b;
    if (c > 10 && c < 20) return true;
    else return false;
}
}
