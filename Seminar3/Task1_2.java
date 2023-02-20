// 1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)
// 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.

package Seminar3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.Iterator;

public class Task1_2 {
    public static void main(String[] args) {
       
        Random rnd = new Random();

        ArrayList<Integer> myList = new ArrayList<>(20);
            for (int i = 0; i < 20; i++) {
                myList.add(rnd.nextInt(10));
        }

        System.out.println("Рандомный целочисленный List:");
        System.out.println(myList.toString());
        
        Iterator<Integer> myLstIterator = myList.iterator();//создаем итератор
            while(myLstIterator.hasNext()) {//до тех пор, пока в списке есть элементы
                Integer elem = myLstIterator.next();//получаем следующий элемент
                if (elem % 2 == 0) {
                    myLstIterator.remove();
                }
            }

        System.out.println("Нечетный целочисленный myList:"); 
        System.out.println(myList.toString());

        int maximum = Collections.max(myList);
        System.out.println("Максималное значение List:"); 
        System.out.println(maximum);

        int minimum = Collections.min(myList);
        System.out.println("Минимальное значение List:"); 
        System.out.println(minimum);
        
        int sum = 0;
            for (Integer elem : myList) {
                sum += elem; 
            }
        int ssum = sum / myList.size();
        System.out.println("Среднеарифметическое значение List:"); 
        System.out.println(ssum);
    }
}
