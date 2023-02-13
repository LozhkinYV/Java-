// 8.  Проверить, является ли год високосным.

package Seminar1;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Наберите год: ");
        if (in.hasNextInt()) {
            int year = in.nextInt();
            System.out.println("Является ли год " + year + " високосным? -> " + isLeapYear(year));
        }
        else System.out.println("Вы набрали не число!"); 
        in.close();
    }

    private static boolean isLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            return true;
        }
        else return false;
    }
   
}
