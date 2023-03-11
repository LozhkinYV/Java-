// Реализовать консольное приложение, которое:

// Принимает от пользователя строку вида
// text~num

// Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

//      // text~num (например, word~4)
// // print~num (распечатать текст)

// // word~1
// // foo~5
// // qwerty~10
// // bar~5
// // print~10 -> qwerty
// // print~1 -> word
// // print~2 -> пустая строка или исключение NoSuchElementException
// // print~5 -> bar

package Seminar4;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Boolean notStop = true;

        while (notStop) {
            System.out.println();
            String[] userInput = getUserInput(scan).split("~");

            if (userInput[0].equalsIgnoreCase("Print")) {
                System.out.println(getData(list, userInput[1]));
            } else if (userInput[0].equalsIgnoreCase("Exit")) {
                notStop = false;
            } else {
                saveData(list, userInput);
            }
        }
    }

    public static String getUserInput(Scanner scan) {
        System.out.println("Для выхода наберите 'Exit'\nДля вывода наберите 'Print~value'");
        System.out.print("Для заполнения введите  значение в виде 'text~value': ");
        return scan.nextLine();
    }

    public static void saveData(ArrayList<String> list, String[] array) {
        int temp = valueCheck(list, array[1]);

        if (temp == -1) {
            list.add(array[1]);
            list.add(array[0]);
        } else {
            list.remove(temp);
            list.add(temp, array[0]);
        }
    }

    public static String getData(ArrayList<String> list, String key) {
        int index = valueCheck(list, key);
        if (index == -1) {
            return "Такого элемента нет";
        }
        return list.get(index);
    }

    public static int valueCheck(ArrayList<String> list, String key) {
        for (int i = 0; i < list.size(); i ++) {
            if (list.get(i).equals(key)) {
                return i + 1;
            }
        }
        return -1;
    }
}