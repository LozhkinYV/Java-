// 9. Должен вернуть массив длины len, каждое значение которого равно initialValue

package Seminar1;

import java.util.Scanner;
import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Наберите длину массива -> ");
        int lengtArray = in.nextInt();
        System.out.print("Какие значения положим в массив? -> ");
        int initalValue = in.nextInt();
        in.close();
        int[] array = createArray(lengtArray, initalValue);
        System.out.println(Arrays.toString(array));

        
    }

    private static int[] createArray(int len, int initalValue) {
        int[] ints = new int[len];
        for (int i = 0; i < len; i++) {
            ints[i] = initalValue;
        }
        return ints;
    }
}
