// 1. Создать метод, который проверяет, является ли строка палиндромом.
        // Палиндром - шалаш

package Seminar2;

public class Task1 {
    public static void main(String[] args)
    {
        //String str = "шалаш";
        String str = "Мама";
        //String str = "Кит на море романтик";
        //String str = "Лёша на полке клопа нашёл";
        palindrome(str);
        
        
    }
    
    
    public static void palindrome(String str) {
        
        str = str.replace(" ", "");
        String str2 = new StringBuilder(str).reverse().toString();
        System.out.println("Ваше выражение: " + str);
        System.out.println("Превернутое выражение: " + str2);
        if (str.equalsIgnoreCase(str2)){
            System.out.println("Палиндром");
        }
        else {
            System.out.println("Не палиндром");  
        }
    }
    
}
