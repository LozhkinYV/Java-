// 2. С помощью Java создать файл file.txt, и записать в него слово TEST 100 раз.
// Если уже файл создан, то перезаписываем его.

package Seminar2;

import java.nio.file.Files;
import java.nio.file.Path;

public class Task2 {
    public static void main(String[] args) {
        try {
            Path file = Path.of("Seminar2\\file.txt");
            if (Files.exists(file)) {
                System.out.println("Файл существует");
            }
            else {
                System.out.println("Нет файла");
                Files.createFile(file);
                System.out.println("Файл создан"); 
            }
            String str = "ТЕСТ";
            String str2 = "";
            for (int i = 0; i < 100; i++) {
                str2 += str + "\n";
            }
            Files.writeString(file, str2);
            System.out.println("Файл записан"); 
            } 
        catch (Exception e) {
            System.out.println("Ошибка");
        }
        
    }
}
