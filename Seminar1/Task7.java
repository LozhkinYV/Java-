// 7. Напечатать строку несколько раз

package Seminar1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Наберите строку: ");
        String source = in.nextLine();
        System.out.print("Сколько раз ее напечатем? ");
        if (in.hasNextInt()) {
            int repeat = in.nextInt();
            printString(source, repeat);
        }
        else System.out.println("Вы набрали не число!"); 
        in.close();
          
    }

    private static void printString(String source, int repeat) {
        String resalt = source;
        for (int i = 1; i < repeat; i++) {
            resalt += source;
        }
        System.out.println(resalt);
    }
}
