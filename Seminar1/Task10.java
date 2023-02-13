// 10. Найти общий префикс среди слов из одного массива.
//          * ["aaa", "aab", "aa"] -> "aa", ["abc", "bca", "cda"] -> ""


package Seminar1;

import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {
        String[] stringArray = {"aaa", "ab", "aa"};
        System.out.println("Для " + Arrays.toString(stringArray) + " Префикс(а) " + findCommonPrefix(stringArray)); // aa
        String[] stringArray2 = {"abc", "bca", "cda"};
        System.out.println( "Для " + Arrays.toString(stringArray2) +" Префикс(а) " + findCommonPrefix(stringArray2)); // ""    
    }

    private static String findCommonPrefix(String[] source) {
        if (source.length == 0) return "нет";
        else {
            String prefix = source[0];
            for (int i = 0; i < source.length; i++) {
                while (source[i].indexOf(prefix) != 0){
                    prefix = prefix.substring(0, prefix.length() - 1);
                    if (prefix == "") return "нет";
                }
            } 
            return prefix;
        }  
    }
    
}
