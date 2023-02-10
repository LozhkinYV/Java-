// 4. Задать одномерный массив и найти в нем минимальный и максимальный элементы

package Seminar1;

import java.util.Arrays;
import java.util.Random;


public class Task4 {

    public static void main(String[] args) {
        int[] array = randArray(10, 20);
        System.out.println(Arrays.toString(array));
        int maximum = Arrays.stream(array).max().getAsInt();
        System.out.println(maximum);
        int minimum = Arrays.stream(array).min().getAsInt();
        System.out.println(minimum);
    }

    private static int[] randArray(int len, int value) {

        Random r = new Random();
        int[] ints = new int[len];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = r.nextInt(value); // random [0, value)
        }
        return ints;
    }
}
    

