// 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//  * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). 
//  * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, 
//                                                                  то есть [0][0], [1][1], [2][2], …, [n][n];
package Seminar1;


import java.util.Arrays;
import java.util.Random;


public class Task3 {
    public static void main(String[] args) {
        int[][] twoDimArray = twoDimArray(10);
        printTwoDimArray(twoDimArray);
        
    }


    private static int[][] twoDimArray(int len) {
        int[][] twoInts = new int[len][len]; 
        for (int i = 0; i < twoInts.length; i++) {
            twoInts[i][i] = 1;
            twoInts[i][twoInts.length - 1 - i] = 1;
        }
        return twoInts;
    }


    private static void printTwoDimArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        
    }
     
}
