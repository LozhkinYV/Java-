// 6. Проверить, что число положительное

package Seminar1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число х: ");
        if (in.hasNextInt()) {
            int num = in.nextInt();
            System.out.println("Являяется ли число положительным -> " + isPositive(num));
        }
        else System.out.println("Вы ввели не число!"); 
        in.close();
    }

    private static boolean isPositive(int num) {
        if (num > 0) return true;
        else return false;
    }
}
