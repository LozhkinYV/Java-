// 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

package Seminar1;


import java.util.Arrays;
import java.util.Random;

public class Task2 {
    
public static void main(String[] args) {
    int[] array = randArray(10, 11);
    System.out.println(Arrays.toString(array));
    int[] newArray =changeArray(array);
    System.out.println(Arrays.toString(newArray));
}


private static int[] randArray(int len, int value) {

    Random r = new Random();
    int[] ints = new int[len];
    for (int i = 0; i < ints.length; i++) {
        ints[i] = r.nextInt(value); // random [0, value)
    }
    return ints;
}


private static int[] changeArray(int[] ints) {
    int[] changeInts = new int[ints.length]; 
    for (int i = 0; i < ints.length; i++) {
        if (ints[i] < 6){
            changeInts[i] = ints[i]*2;
        }
        else {
            changeInts[i] = ints[i];
        }
        
    }
    return changeInts;
}
}
