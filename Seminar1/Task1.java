// 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
//  * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

package Seminar1;

import java.util.Arrays;
import java.util.Random;

public class Task1 {

    public static void main(String[] args) {
        int[] array = randArray(10, 2);
        System.out.println(Arrays.toString(array));
        int[] invertArray = invertedArray(array );
        System.out.println(Arrays.toString(invertArray));
    }

    private static int[] randArray(int len, int value) {

        Random r = new Random();
        int[] ints = new int[len];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = r.nextInt(value); // random [0, value)
        }
        return ints;
    }


    private static int[] invertedArray(int[] ints) {
        int[] inverInts = new int[ints.length]; 
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == 1){
                inverInts[i] = 0;
            }
            else {
                inverInts[i] = 1;
            }
            
        }
        return inverInts;
    }

}
