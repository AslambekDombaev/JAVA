// Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.

import java.io.BufferedWriter;
import java.io.FileWriter;

public class seminar2Task4 {
    public static void main(String[] args) {
        String str = "TEST".repeat(100);
        writeFile(str, "index.txt");
    }
    public static void writeFile(String args, String fileName) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(args);
            System.out.println("File written to " + fileName);
        } catch (Exception e) {
            System.out.println("Error writing to file " + fileName);
        }
    }
}